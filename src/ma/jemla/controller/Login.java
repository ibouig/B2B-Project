package ma.jemla.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.daoimpl.EntrepriseDaoImpl;
import ma.jemla.daoimpl.ProductDaoImpl;
import ma.jemla.model.Entreprise;
import ma.jemla.model.Product;
import ma.jemla.view.LoginForm;

public class Login extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req, 
			HttpServletResponse res)throws Exception
	{
		System.out.println("in the controller of Entreprise login");
		LoginForm myForm = (LoginForm) form;
		EntrepriseDaoImpl e_DaoImpl = new EntrepriseDaoImpl();
		Entreprise entreprise = e_DaoImpl.login(myForm.getEmail(), myForm.getPassword());
		ProductDaoImpl p_dao = new ProductDaoImpl();
		//Entreprise ent = (Entreprise)request.getAttribute("ActiveUser");
		List<Product> entprods = p_dao.getEntrepriseProducts(entreprise);
		req.setAttribute("entprods", entprods);
		if(entreprise != null){
			req.getSession().setAttribute("ActiveUser", entreprise);
			return mapping.findForward("success");
		}else{
			return mapping.findForward("failure");
		}
	}

}
