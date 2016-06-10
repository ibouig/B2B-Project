package ma.jemla.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.daoimpl.ProductDaoImpl;
import ma.jemla.model.Product;

public class CategoryRedirect extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req, 
			HttpServletResponse res)throws Exception
	{
		ProductDaoImpl p_dao = new ProductDaoImpl();
		//
		String catName = (String) req.getParameter("name");
		System.err.println("Nom de la categorie " + catName);
		List<Product> cats = p_dao.getCatProducts(catName);
		req.setAttribute("prodsCat", cats);
		for( int i=0 ; i<cats.size();i++){
			System.err.println(cats.get(i).getNom());
		}
		return mapping.findForward("success");
		
	}
}
