package ma.jemla.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.model.Account;

public class ContactUs extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req, 
			HttpServletResponse res)throws Exception
	{
		System.out.println("in the controller ");
		Account account = (Account) req.getSession().getAttribute("ActiveUser");
		if(account != null){
			return mapping.findForward("active");
		}else{
			return mapping.findForward("inactive");
		}
	}

}
