package model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "user")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class User {

    private String userName;
    private String password;
    private String firstName;
    private String lastName;

    public User() {
    }

   

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



	@Override
	public String toString() {
		return "User [" + (userName != null ? "userName=" + userName + ", " : "")
				+ (password != null ? "password=" + password + ", " : "")
				+ (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName : "") + "]";
	}

   
}
