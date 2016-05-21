package ma.jemla.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.model.Account;
import ma.jemla.model.Manager;

public class AddCategoryRedirect extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req, 
			HttpServletResponse res)throws Exception
	{
		Account acc = (Account) req.getSession().getAttribute("ActiveUser");
		System.out.println("\n\n\n\n "+acc.getClass());
		if(acc != null && acc.getClass()==Manager.class){
			return mapping.findForward("success");
		}else{
			return mapping.findForward("failure");
		}
	}

}
