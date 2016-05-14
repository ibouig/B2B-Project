package ma.jemla.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class UserInscription extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req, 
			HttpServletResponse res)throws Exception
	{
		System.out.println("in the controller ");
		try {
           
        } catch(Exception ioe) {
             ioe.printStackTrace();
        }
		//if(dao.save(u) == 1) 
			return mapping.findForward("success");
		//else
			//return mapping.findForward("failure");
	}

}
