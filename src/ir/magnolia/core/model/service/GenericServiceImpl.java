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
import java.util.*;
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

    public String editFriend(String friend) throws Exception {
        JsonNode contentKey = JsonUtil.objectMapper.readTree(friend);
        String mobileNumber = contentKey.at("/mobileNumber").asText();
        Member member = memberDAO.memberByMobileNumber(mobileNumber);
        JsonNode friendNode = contentKey.path("friend");
        String nationalCode = friendNode.get(4).at("/nationalCode").asText();
        Friend friend1 = null;
        for (Friend frnd : member.getFriends()) {
            if (frnd.getNationalCode().equalsIgnoreCase(nationalCode.trim())) {
                friend1 = frnd;
                break;
            }
        }
        friend1.setFirstName(friendNode.get(0).at("/firstName").asText());
        friend1.setLastName(friendNode.get(1).at("/lastName").asText());
        friend1.setLatinFirstName(friendNode.get(2).at("/latinFirstName").asText());
        friend1.setLatinLastName(friendNode.get(3).at("/latinLastName").asText());
        friend1.setBirthDate(friendNode.get(5).at("/birthDate").asText());
        friend1.setSexType(friendNode.get(6).at("/sexType").asText());
        friend1.setAgeType(friendNode.get(7).at("/ageType").asText());
        if (friendDAO.update(friend1) != null) {
            return "1";
        } else {
            return "0";
        }
    }

    public String deleteFriend(String nationalCode) throws Exception {
        JsonNode contentKey = JsonUtil.objectMapper.readTree(nationalCode);
        String national = contentKey.at("/nationalCode").asText();
        Friend friend = friendDAO.findByNationalCode(national.trim());
        if (friend != null) {
            if (friendDAO.delete(friend)) {
                return "1";
            } else {
                return "0";
            }
        } else {
            return "-1";
        }
    }

    public String addFriend(String friend) throws Exception {
        JsonNode contentKey = JsonUtil.objectMapper.readTree(friend);
        String mobileNumber = contentKey.at("/mobileNumber").asText();
        Member member = memberDAO.memberByMobileNumber(mobileNumber);
        Friend friend1 = new Friend();
        JsonNode friendNode = contentKey.path("friend");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        friend1.setRegisterDate(dateFormat.format(new Date()));
        friend1.setFirstName(friendNode.get(0).at("/firstName").asText());
        friend1.setLastName(friendNode.get(1).at("/lastName").asText());
        friend1.setLatinFirstName(friendNode.get(2).at("/latinFirstName").asText());
        friend1.setLatinLastName(friendNode.get(3).at("/latinLastName").asText());
        friend1.setNationalCode(friendNode.get(4).at("/nationalCode").asText());
        friend1.setBirthDate(friendNode.get(5).at("/birthDate").asText());
        friend1.setSexType(friendNode.get(6).at("/sexType").asText());
        friend1.setAgeType(friendNode.get(7).at("/ageType").asText());
        boolean flag = false;
        for (Friend frnd : member.getFriends()) {
            if (frnd.getNationalCode().equalsIgnoreCase(friend1.getNationalCode())) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            member.setFriends(new HashSet<>(Arrays.asList(friend1)));
            if (memberDAO.update(member) != null) {
                return "1";
            } else {
                return "0";
            }
        } else {
            return "-1";
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
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd-hh:mm:ss");
        memberDAO.create(new Member(phoneKey.at("/mobileNumber").asText(), generatedCode, dateFormat.format(new Date()), "true"));
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
