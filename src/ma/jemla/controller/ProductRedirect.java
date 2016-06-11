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
import ma.jemla.model.Account;
import ma.jemla.model.Entreprise;
import ma.jemla.model.Product;

public class ProductRedirect extends Action{
	
	public ActionForward execute(ActionMapping map, ActionForm form, 
			HttpServletRequest req, HttpServletResponse res)throws Exception{
		System.out.println("\nProduct redirect");
		Account account = (Account) req.getSession().getAttribute("ActiveUser");
		long id = Long.parseLong(req.getParameter("id"));
		List<Product> prods = (List<Product>)req.getSession().getAttribute("prods");
		EntrepriseDaoImpl e_dao = new EntrepriseDaoImpl();
		ProductDaoImpl p_dao = new ProductDaoImpl();
		System.out.println("l'id est: "+id);
		Entreprise receiver = p_dao.getEntreprise(id);
		System.out.println("\n\n\nThe receiver would be: "+receiver.getId());
//		for(int i=0; i<prods.size(); i++){
//			if(id==prods.get(i).getId()){
//				req.setAttribute("product", prods.get(i));
//			}
//
//		}
		req.setAttribute("idPro", id);
		req.setAttribute("owner", receiver);
		System.out.println("\n\n\n"+id+"\n\nsqdfkjj_\n"+account);
		if(account!=null)
			return map.findForward("success");
		else
			return map.findForward("unregistred");
		

	}

}
