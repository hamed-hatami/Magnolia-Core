package ir.magnolia.core.model.objectValue;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CheckTicket {

    @JsonProperty(value = "MethodName")
    private String methodName;
    @JsonProperty(value = "SessionID")
    private String sessionID;
    @JsonProperty(value = "Parameters")
    private List<CheckTicketProperty> parameters;


    public CheckTicket() {
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

    public List<CheckTicketProperty> getParameters() {
        return parameters;
    }

    public void setParameters(List<CheckTicketProperty> parameters) {
        this.parameters = parameters;
    }
}
