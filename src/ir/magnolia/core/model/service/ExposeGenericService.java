package ir.magnolia.core.model.service;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/exposeGenericService")
public class ExposeGenericService {

    @EJB
    private GenericServiceImpl genericService;

    @POST
    @Path("/editFriend")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String editFriend(String mobileNumber) {
        try{
            return genericService.editFriend(mobileNumber);
        } catch (Exception e) {
            return "0";
        }
    }
    @POST
    @Path("/deleteFriend")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String deleteFriend(String mobileNumber) {
        try{
            return genericService.deleteFriend(mobileNumber);
        } catch (Exception e) {
            return "0";
        }
    }
    @POST
    @Path("/addFriend")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String addFriend(String mobileNumber) {
        try{
            return genericService.addFriend(mobileNumber);
        } catch (Exception e) {
            return "0";
        }
    }
    @POST
    @Path("/listOfFriends")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String listOfFriends(String mobileNumber) {
        try{
            return genericService.listOfFriends(mobileNumber);
        } catch (Exception e) {
            return "0";
        }
    }
    @POST
    @Path("/sendMessage")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String sendMessage(String mobileNumber, String message) {
        try{
            return genericService.sendMessage(mobileNumber, message);
        } catch (Exception e) {
            return "0";
        }
    }
    @POST
    @Path("/getTicketImage")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getTicketImage(String mobileNumber, String email) {
        try {
            return genericService.getTicketImage(mobileNumber, email);
        } catch (Exception e) {
            return "0";
        }
    }
    @POST
    @Path("/confirmKey")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String confirmKey(String mobileNumber, String key) {
        try {
            return genericService.confirmKey(mobileNumber, key);
        } catch (Exception e) {
            return "0";
        }
    }

    @POST
    @Path("/generateKey")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String generateKey(String mobileNumber) {
        try {
            return genericService.generateKey(mobileNumber);
        } catch (Exception e) {
            return "0";
        }
    }

    @POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String login(String login) {
        try {
            return genericService.login(login);
        } catch (Exception e) {
            return "0";
        }
    }

    @POST
    @Path("/getAllTicket")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getAllTicket(String ticket) {
        try {
            return genericService.getAllTicket(ticket);
        } catch (Exception e) {
            return "0";
        }
    }

    @POST
    @Path("/book")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String book(String book) {
        try {
            return genericService.book(book);
        } catch (Exception e) {
            return "0";
        }
    }

    @POST
    @Path("/reserve")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String reserve(String reserve) {
        try {
            return genericService.reserve(reserve);
        } catch (Exception e) {
            return "0";
        }
    }

    @POST
    @Path("/checkTicket")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String checkTicket(String checkTicket) {
        try {
            return genericService.checkTicket(checkTicket);
        } catch (Exception e) {
            return "0";
        }
    }

    @POST
    @Path("/getTicketFile")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getTicketFile(String ticketFile) {
        try {
            return genericService.ticketFile(ticketFile);
        } catch (Exception e) {
            return "0";
        }
    }

}
