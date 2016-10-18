package ir.magnolia.core.model.service;

import ir.magnolia.core.model.dao.FriendDAOImpl;
import ir.magnolia.core.model.dao.MemberDAOImpl;
import ir.magnolia.core.model.entity.Friend;
import ir.magnolia.core.model.entity.Member;
import ir.magnolia.core.util.Configuration;
import ir.magnolia.core.util.RESTfulClientUtil;
import ir.magnolia.core.util.WebServiceClientUtil;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.*;

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

    public String addFriend(String ownerMobileNumber, Friend friend) throws Exception {
        Member member = memberDAO.memberByMobileNumber(ownerMobileNumber);
        member.setFriends(new HashSet<>(Collections.singletonList(friend)));
        if (memberDAO.update(member) != null) {
            return "true";
        } else {
            return "false";
        }
    }

    public Set<Friend> listOfFriends(String mobileNumber) throws Exception {
        Member member = memberDAO.memberByMobileNumber(mobileNumber);
        return member.getFriends();
    }

    public String sendMessage(String mobileNumber, String message) throws Exception {
        return webServiceClientUtil.sendMessage(mobileNumber, message);
    }

    public String getTicketImage(String mobileNumber, String email) throws Exception {
        // todo: send email the image of ticket
        return resTfulClientUtil.restFullService(SERVICE_URL, mobileNumber);
    }

    public String confirmKey(String mobileNumber, String key) throws Exception {
        Member member = memberDAO.findByCodeAndMobileNumber(mobileNumber, key);
        if (member != null) {
            return "true";
        }
        return "false";
    }

    public String generateKey(String mobileNumber) throws Exception {
        String generatedCode = webServiceClientUtil.sendCode(mobileNumber);
        memberDAO.create(new Member(mobileNumber, generatedCode));
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

}
