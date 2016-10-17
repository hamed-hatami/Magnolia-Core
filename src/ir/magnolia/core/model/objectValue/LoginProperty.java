package ir.magnolia.core.model.objectValue;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class LoginProperty implements Serializable {

    @JsonProperty(value = "UserID")
    private int userID;
    @JsonProperty(value = "Password")
    private String password;

    public LoginProperty(int userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
