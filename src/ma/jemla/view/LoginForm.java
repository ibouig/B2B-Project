package ma.jemla.view;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm{
	private String email;
	private String password;

	public ActionErrors validate(ActionMapping mapping,  HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		System.out.println("In the actionErrors method");
		if(email==null || email.length()<5){
			System.out.println("error.email");
			errors.add("email", new ActionMessage("error.email"));
		}
		if(password ==null || password.length()<7){
			System.out.println("error.password");
			errors.add("password", new ActionMessage("error.password"));
		}

		return errors;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
