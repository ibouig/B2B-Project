package ma.jemla.view;

import org.apache.struts.action.ActionForm;

public class MessageForm extends ActionForm{
	String message;
	long id;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	

}
