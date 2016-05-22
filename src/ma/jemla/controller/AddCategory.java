package ma.jemla.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.daoimpl.CategoryDaoImpl;
import ma.jemla.model.Category;
import ma.jemla.model.Manager;
import ma.jemla.view.AddCategoryForm;

public class AddCategory extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req, 
			HttpServletResponse res)throws Exception
	{
		System.out.println("in the controller of Entreprise login");
		AddCategoryForm myForm = (AddCategoryForm) form;
		CategoryDaoImpl c_DaoImpl = new CategoryDaoImpl();
		Category category = new Category();
		category.setDescription(myForm.getDescription());
		category.setNom(myForm.getNom());
		boolean val = c_DaoImpl.inserer(category);
		if(req.getSession().getAttribute("ActiveUser") == null || 
				req.getSession().getAttribute("ActiveUser").getClass()!=Manager.class)
			return mapping.findForward("failure");
		
		if(val){
			//req.getSession().setAttribute("ActiveUser", entreprise);
			return mapping.findForward("success");
		}else{
			return mapping.findForward("entreprise");
		}
	}

}
