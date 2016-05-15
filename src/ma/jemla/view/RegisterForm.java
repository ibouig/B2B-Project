package ma.jemla.view;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class RegisterForm extends ActionForm{
	private String name;
	private String email;
	private String password;
	private String conf_pass;
	private String adresse;
	private String ville;
	public ActionErrors validate(ActionMapping mapping,  HttpServletRequest request) {
		System.out.println("Here in the ActionErrors validate form");
		System.out.println("the name is: "+name+", the email is: "+email+", password is: "+password);
		ActionErrors errors = new ActionErrors();
		if(name==null||name.length()<=6)
			errors.add("name", new ActionMessage("error.name"));
		if(email==null || email.length()<5)	
			errors.add("email", new ActionMessage("error.email"));
		if(password ==null || conf_pass==null|| !password.equals(conf_pass))
			errors.add("password", new ActionMessage("error.password"));

		return errors;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getConf_pass() {
		return conf_pass;
	}
	public void setConf_pass(String conf_pass) {
		this.conf_pass = conf_pass;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}


}
