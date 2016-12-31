package ir.magnolia.core.model.service;

import ir.magnolia.core.model.security.Secured;

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
    @Secured
    public String editFriend(String friend) {
        try {
            return genericService.editFriend(friend);
        } catch (Exception e) {
            return "0";
        }
    }

    @POST
    @Path("/deleteFriend")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Secured
    public String deleteFriend(String friend) {
        try {
            return genericService.deleteFriend(friend);
        } catch (Exception e) {
            return "0";
        }
    }

    @POST
    @Path("/addFriend")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Secured
    public String addFriend(String friend) {
        try {
            System.out.println("add called");
            return genericService.addFriend(friend);
        } catch (Exception e) {
            return "0";
        }
    }

    @POST
    @Path("/listOfFriends")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Secured
    public String listOfFriends(String content) {
        try {
            return genericService.listOfFriends(content);
        } catch (Exception e) {
            return null;
        }
    }

    @POST
    @Path("/sendMessage")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Secured
    public String sendMessage(String content) {
        try {
            return genericService.sendMessage(content);
        } catch (Exception e) {
            return "0";
        }
    }

    @POST
    @Path("/getTicketImage")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Secured
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
    public String confirmKey(String content) {
        try {
            return genericService.confirmKey(content);
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
    @Secured
    public String login(String login) {
        try {
            return genericService.login(login);
        } catch (Exception e) {
            return "0";
        }
    }

    @POST
    @Path("/findTickets")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Secured
    public String findTickets(String ticket, String sourceCity, String destinationCity, String flighDate) {
        try {
            return genericService.findTickets(ticket, sourceCity, destinationCity, flighDate);
        } catch (Exception e) {
            return "0";
        }
    }


    @POST
    @Path("/searchSystemTicket")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Secured
    public String searchSystemTicket(String ticket) {
        try {
            return genericService.searchSystemTicket(ticket);
        } catch (Exception e) {
            return "0";
        }
    }

    @POST
    @Path("/getIssuedTicketPNR")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Secured
    public String getIssuedTicketPNR(String reservedCode) {
        try {
            return genericService.getIssuedTicketPNR(reservedCode);
        } catch (Exception e) {
            return "0";
        }
    }

    @POST
    @Path("/remainingAccount")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Secured
    public String remainingAccount(String account) {
        try {
            return genericService.remainingAccount(account);
        } catch (Exception e) {
            return "0";
        }
    }

    @POST
    @Path("/getAllTicket")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Secured
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
    @Secured
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
    @Secured
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
    @Secured
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
    @Secured
    public String getTicketFile(String ticketFile) {
        try {
            return genericService.ticketFile(ticketFile);
        } catch (Exception e) {
            return "0";
        }
    }

}
