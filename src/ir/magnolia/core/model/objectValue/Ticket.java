package ir.magnolia.core.model.objectValue;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ticket {

    @JsonProperty(value = "MethodName")
    private String methodName;
    @JsonProperty(value = "SessionID")
    private String sessionID;
    @JsonProperty(value = "TicketID")
    private String ticketID;


    public Ticket(String methodName, String sessionID) {
        this.methodName = methodName;
        this.sessionID = sessionID;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
}
