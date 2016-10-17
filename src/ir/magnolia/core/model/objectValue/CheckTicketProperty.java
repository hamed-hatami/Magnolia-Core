package ir.magnolia.core.model.objectValue;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckTicketProperty {

    @JsonProperty(value = "TicketID")
    private int ticketID;

    public CheckTicketProperty(int ticketID) {
        this.ticketID = ticketID;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }
}
