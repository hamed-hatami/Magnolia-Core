package ir.magnolia.core.model.objectValue;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReserveProperty {

    @JsonProperty(value = "reservecode")
    private String reservecode;

    public ReserveProperty(String reservecode) {
        this.reservecode = reservecode;
    }

    public String getReservecode() {
        return reservecode;
    }

    public void setReservecode(String reservecode) {
        this.reservecode = reservecode;
    }
}
