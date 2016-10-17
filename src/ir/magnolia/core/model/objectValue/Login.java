package ir.magnolia.core.model.objectValue;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class Login implements Serializable {

    @JsonProperty(value = "MethodName")
    private String methodName;
    @JsonProperty(value = "Parameters")
    private List<LoginProperty> parameters;
    @JsonProperty(value = "SessionID")
    private String sessionID;

    public Login() {
    }

    public Login(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public List<LoginProperty> getParameters() {
        return parameters;
    }

    public void setParameters(List<LoginProperty> parameters) {
        this.parameters = parameters;
    }
}
