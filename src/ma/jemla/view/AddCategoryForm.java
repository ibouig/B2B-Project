package ma.jemla.view;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AddCategoryForm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String description;
	
	public ActionErrors validate(ActionMapping mapping,  HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if(nom==null )	
			errors.add("name", new ActionMessage("error.name"));
		if(description ==null)
			errors.add("description", new ActionMessage("error.description"));
		
		return errors;
			}
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
