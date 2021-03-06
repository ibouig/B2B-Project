package ma.jemla.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.daoimpl.EntrepriseDaoImpl;
import ma.jemla.model.Entreprise;
import ma.jemla.view.RegisterForm;

public class UserInscription extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req, 
			HttpServletResponse res)throws Exception
	{
		System.out.println("in the controller ");
		RegisterForm registerForm = (RegisterForm) form;
		Entreprise entreprise = new Entreprise();
		entreprise.setAdresse(registerForm.getAdresse());
		entreprise.setVille(registerForm.getVille());
		entreprise.setPassword(registerForm.getPassword());
		entreprise.setEmail(registerForm.getEmail());
		entreprise.setName(registerForm.getName());
		EntrepriseDaoImpl e_DaoImpl = new EntrepriseDaoImpl();
		if(e_DaoImpl.inserer(entreprise)){
			req.getSession().setAttribute("ActiveUser", entreprise);
			return mapping.findForward("success");
		}else{
			return mapping.findForward("failure");
		}
	}

}
