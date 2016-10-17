package ir.magnolia.core.model.objectValue;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Book {

    @JsonProperty(value = "MethodName")
    private String methodName;
    @JsonProperty(value = "SessionID")
    private String sessionID;
    @JsonProperty(value = "TicketID")
    private int ticketID;
    @JsonProperty(value = "PassengerEmail")
    private String passengerEmail;
    @JsonProperty(value = "PassengerMobileNumber")
    private String passengerMobileNumber;
    @JsonProperty(value = "TicketCount")
    private String ticketCount;
    @JsonProperty(value = "Price")
    private String price;
    @JsonProperty(value = "Parameters")
    private List<BookProperty> parameters;

    public Book() {
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

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public String getPassengerEmail() {
        return passengerEmail;
    }

    public void setPassengerEmail(String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }

    public String getPassengerMobileNumber() {
        return passengerMobileNumber;
    }

    public void setPassengerMobileNumber(String passengerMobileNumber) {
        this.passengerMobileNumber = passengerMobileNumber;
    }

    public String getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(String ticketCount) {
        this.ticketCount = ticketCount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<BookProperty> getParameters() {
        return parameters;
    }

    public void setParameters(List<BookProperty> parameters) {
        this.parameters = parameters;
    }
}
