package ma.jemla.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.model.Account;
import ma.jemla.model.Entreprise;
import ma.jemla.model.Manager;

public class AddCategoryRedirect extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req, 
			HttpServletResponse res)throws Exception
	{
		Account acc = (Account) req.getSession().getAttribute("ActiveUser");
		
		if(acc != null && acc.getClass()==Manager.class){
			System.out.println("\n\n\n\n "+acc.getClass());
			return mapping.findForward("success");
		}else if(acc != null && acc.getClass()==Entreprise.class){
			System.out.println("\n\n\n\n "+acc.getClass());
			return mapping.findForward("entreprise");
		}else{
			return mapping.findForward("failure");
		}
	}

}
