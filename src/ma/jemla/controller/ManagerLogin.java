package ma.jemla.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.daoimpl.ManagerDaoImpl;
import ma.jemla.model.Manager;
import ma.jemla.view.LoginForm;

public class ManagerLogin extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req, 
			HttpServletResponse res)throws Exception
	{
		System.out.println("in the controller of Manager Login :D");
		LoginForm myForm = (LoginForm) form;
		System.out.println("mail :"+myForm.getEmail()+", pass: "+myForm.getPassword());
		ManagerDaoImpl m_DaoImpl = new ManagerDaoImpl();
		Manager manager = m_DaoImpl.login(myForm.getEmail(), myForm.getPassword());
		
		if(manager != null){
			req.getSession().setAttribute("ActiveUser", manager);
			return mapping.findForward("success");
		}else{
			return mapping.findForward("failure");
		}
	}
}
