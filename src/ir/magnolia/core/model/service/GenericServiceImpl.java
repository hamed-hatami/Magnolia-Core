package ir.magnolia.core.model.service;

import ir.magnolia.core.util.Configuration;
import ir.magnolia.core.util.RESTfulClientUtil;
import ir.magnolia.core.util.WebServiceClientUtil;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
@LocalBean
public class GenericServiceImpl {

    @Inject
    private RESTfulClientUtil resTfulClientUtil;
    @Inject
    private WebServiceClientUtil webServiceClientUtil;

    private final String SERVICE_URL = Configuration.getProperty("service_url");

    public String editFriend(String mobileNumber) throws Exception {
        // todo: edit one of my friends
        return resTfulClientUtil.restFullService(SERVICE_URL, mobileNumber);
    }

    public String deleteFriend(String mobileNumber) throws Exception {
        // todo: delete one of my friends
        return resTfulClientUtil.restFullService(SERVICE_URL, mobileNumber);
    }

    public String addFriend(String mobileNumber) throws Exception {
        // todo: add friend to my list
        return resTfulClientUtil.restFullService(SERVICE_URL, mobileNumber);
    }

    public String listOfFriends(String mobileNumber) throws Exception {
        // todo: get list of friends from DB
        return resTfulClientUtil.restFullService(SERVICE_URL, mobileNumber);
    }

    public String sendMessage(String mobileNumber, String message) throws Exception {
        // todo: send sms with message
        return resTfulClientUtil.restFullService(SERVICE_URL, mobileNumber);
    }

    public String getTicketImage(String mobileNumber, String email) throws Exception {
        // todo: send email the image of ticket
        return resTfulClientUtil.restFullService(SERVICE_URL, mobileNumber);
    }

    public String confirmKey(String mobileNumber, String key) throws Exception {
        // todo: confirm key with phone number and key
        return resTfulClientUtil.restFullService(SERVICE_URL, mobileNumber);
    }

    public String generateKey(String mobileNumber) throws Exception {
        String generatedCode = webServiceClientUtil.sendCode(mobileNumber);
        //todo: insert generatedCode into DB
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
