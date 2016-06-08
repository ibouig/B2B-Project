package ma.jemla.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.daoimpl.ProductDaoImpl;
import ma.jemla.model.Manager;
import ma.jemla.view.AddToCartForm;

public class ValidateProduct extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req, 
			HttpServletResponse res)throws Exception
	{
		System.out.println("in the controller of update login");
		AddToCartForm myForm = (AddToCartForm) form;
		if(req.getSession().getAttribute("ActiveUser") == null || req.getSession().getAttribute("ActiveUser").getClass()!=Manager.class)
			return mapping.findForward("failure");
		
		if(req.getParameter("supprimer")!=null){
			ProductDaoImpl p_dao = new ProductDaoImpl();
			p_dao.delete(myForm.getId());
			//req.getSession().setAttribute("ActiveUser", entreprise);
			return mapping.findForward("success");
		}else if(req.getParameter("valider")!=null){
			ProductDaoImpl p_dao = new ProductDaoImpl();
			p_dao.validate(myForm.getId());
			return mapping.findForward("success");
		}
		return mapping.findForward("failure");
	}

}
