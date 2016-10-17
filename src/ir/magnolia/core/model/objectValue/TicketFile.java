package ir.magnolia.core.model.objectValue;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TicketFile {

    @JsonProperty(value = "MethodName")
    private String methodName;
    @JsonProperty(value = "SessionID")
    private String sessionID;
    @JsonProperty(value = "Parameters")
    private List<TicketFileProperty> parameters;

    public TicketFile() {
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

    public List<TicketFileProperty> getParameters() {
        return parameters;
    }

    public void setParameters(List<TicketFileProperty> parameters) {
        this.parameters = parameters;
    }
}
