package ir.magnolia.core.model.objectValue;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Reserve {

    @JsonProperty(value = "MethodName")
    private String methodName;
    @JsonProperty(value = "SessionID")
    private String sessionID;
    @JsonProperty(value = "Parameters")
    private List<ReserveProperty> parameters;

    public Reserve() {
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

    public List<ReserveProperty> getParameters() {
        return parameters;
    }

    public void setParameters(List<ReserveProperty> parameters) {
        this.parameters = parameters;
    }
}
