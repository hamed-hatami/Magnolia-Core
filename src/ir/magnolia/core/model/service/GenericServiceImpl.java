package ir.magnolia.core.model.service;

import com.fasterxml.jackson.databind.JsonNode;
import ir.magnolia.core.model.dao.FriendDAOImpl;
import ir.magnolia.core.model.dao.MemberDAOImpl;
import ir.magnolia.core.model.entity.Friend;
import ir.magnolia.core.model.entity.Member;
import ir.magnolia.core.util.Configuration;
import ir.magnolia.core.util.JsonUtil;
import ir.magnolia.core.util.RESTfulClientUtil;
import ir.magnolia.core.util.WebServiceClientUtil;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Stateless
@LocalBean
public class GenericServiceImpl {

    @Inject
    private RESTfulClientUtil resTfulClientUtil;
    @Inject
    private WebServiceClientUtil webServiceClientUtil;
    @EJB
    private MemberDAOImpl memberDAO;
    @EJB
    private FriendDAOImpl friendDAO;

    private final String SERVICE_URL = Configuration.getProperty("service_url");

    public String findTickets(String ticket, String sourceCity, String destinationCity, String flightDate) {
        try {
            return JsonUtil.object2Json(JsonUtil.findInJson(getAllTicket(ticket)).parallelStream().filter(order -> order.getSourceCityChar().equalsIgnoreCase(sourceCity) && order.getDestinationCityChar().equalsIgnoreCase(destinationCity) && order.getFlighDate().equalsIgnoreCase(flightDate)).collect(Collectors.toList()));
        } catch (Exception e) {
            return "0";
        }
    }

    public String editFriend(Friend friend) throws Exception {
        if (friendDAO.update(friend) != null) {
            return "true";
        } else {
            return "false";
        }
    }

    public String deleteFriend(Friend friend) throws Exception {
        if (friendDAO.delete(friend)) {
            return "true";
        } else {
            return "false";
        }
    }

    public String addFriend(String friend) throws Exception {
        //String s = {"mobileNumber":"09124472787","friend":[{"firstName":"حامد"},{"lastName":"حاتمی"},{"latinFirstName":"Hamed"},{"latinLastName":"Hatami"},{"nationalCode":"0070810213"},{"birthDate":"1395/01/01"},{"sexType":"male"},{"ageType":"child"}]}
        JsonNode contentKey = JsonUtil.objectMapper.readTree(friend);
        String mobileNumber = contentKey.at("/mobileNumber").asText();
        Member member = memberDAO.memberByMobileNumber(mobileNumber);
        Friend friend1 = new Friend();
        JsonNode friendNode = contentKey.path("friend");
        friend1.setFirstName(friendNode.path("firstName").asText());
        friend1.setLastName(friendNode.path("lastName").asText());
        friend1.setLatinFirstName(friendNode.path("latinFirstName").asText());
        friend1.setLatinLastName(friendNode.path("latinLastName").asText());
        friend1.setNationalCode(friendNode.path("nationalCode").asText());
        friend1.setBirthDate(friendNode.path("birthDate").asText());
        friend1.setSexType(friendNode.path("sexType").asText());
        friend1.setAgeType(friendNode.path("ageType").asText());
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        friend1.setRegisterDate(dateFormat.format(new Date()));
        member.setFriends(new HashSet<>(Collections.singletonList(friend1)));
        if (memberDAO.update(member) != null) {
            return "true";
        } else {
            return "false";
        }
    }

    public String listOfFriends(String content) throws Exception {
        JsonNode contentKey = JsonUtil.objectMapper.readTree(content);
        String mobileNumber = contentKey.at("/mobileNumber").asText();
        Member member = memberDAO.memberByMobileNumber(mobileNumber);
        Set<Friend> friends = member.getFriends();
        return JsonUtil.objectMapper.writeValueAsString(friends);
    }

    public String sendMessage(String content) throws Exception {
        JsonNode contentKey = JsonUtil.objectMapper.readTree(content);
        String mobileNumber = contentKey.at("/mobileNumber").asText();
        String message = contentKey.at("/message").asText();
        return webServiceClientUtil.sendMessage(mobileNumber, message);
    }

    public String getTicketImage(String mobileNumber, String email) throws Exception {
        // todo: send email the image of ticket
        return resTfulClientUtil.restFullService(SERVICE_URL, mobileNumber);
    }

    public String confirmKey(String content) throws Exception {
        JsonNode contentKey = JsonUtil.objectMapper.readTree(content);
        String mobileNumber = contentKey.at("/mobileNumber").asText();
        String key = contentKey.at("/key").asText();
        Member member = memberDAO.findByCodeAndMobileNumber(mobileNumber, key);
        if (member != null) {
            return "true";
        }
        return "false";
    }

    public String generateKey(String mobileNumber) throws Exception {
        JsonNode phoneKey = JsonUtil.objectMapper.readTree(mobileNumber);
        String generatedCode = webServiceClientUtil.sendCode(phoneKey.at("/mobileNumber").asText());
        memberDAO.create(new Member(phoneKey.at("/mobileNumber").asText(), generatedCode));
        return generatedCode;
    }

    public String login(String login) throws Exception {
        return resTfulClientUtil.restFullService(SERVICE_URL, login);
    }

    public String getAllTicket(String ticket) throws Exception {
        return resTfulClientUtil.restFullService(SERVICE_URL, ticket);
    }

    public String book(String book) throws Exception {
        return resTfulClientUtil.restFullService(SERVICE_URL, book);
    }

    public String reserve(String reserve) throws Exception {
        return resTfulClientUtil.restFullService(SERVICE_URL, reserve);
    }

    public String checkTicket(String checkTicket) throws Exception {
        return resTfulClientUtil.restFullService(SERVICE_URL, checkTicket);
    }

    public String ticketFile(String ticketFile) throws Exception {
        return resTfulClientUtil.restFullService(SERVICE_URL, ticketFile);
    }

    public String getIssuedTicketPNR(String reservedCode) throws Exception {
        return resTfulClientUtil.restFullService(SERVICE_URL, reservedCode);
    }

    public String remainingAccount(String account) throws Exception {
        return resTfulClientUtil.restFullService(SERVICE_URL, account);
    }

    public String searchSystemTicket(String queryString) throws Exception {
        String message = resTfulClientUtil.restFullService(SERVICE_URL, queryString);
        JsonNode messageKey = JsonUtil.objectMapper.readTree(message);
        JsonNode sessionKey = JsonUtil.objectMapper.readTree(queryString);

        String result = "";
        int counter = 0;
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (counter <= 3) {
            result = resTfulClientUtil.restFullService(SERVICE_URL, "{\"MethodName\":\"GetSystemTicketResualt\",\"SessionID\":\"" + sessionKey.at("/SessionID").asText() + "\",\"Parameters\":[{\"SearchCode\":\"" + messageKey.get(0).get("Message").asText() + "\"}]}");
            if (!result.trim().equalsIgnoreCase("[]")) {
                break;
            } else {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter++;
            }
        }
        return result;
    }

}
