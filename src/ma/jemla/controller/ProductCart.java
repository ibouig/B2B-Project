package ma.jemla.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.daoimpl.CartDaoRemoteImpl;
import ma.jemla.model.OrderLine;
import ma.jemla.view.AddToCartForm;

public class ProductCart extends Action{
	
	public ActionForward execute(ActionMapping map, ActionForm form, HttpServletRequest req, HttpServletResponse res){
		System.err.println("/\n\n\n\n\n\n\nIn the controller \n\n\n\nfqslkfjmqsdklf\n\n");
		CartDaoRemoteImpl cat = (CartDaoRemoteImpl) req.getSession().getAttribute("cart");
		AddToCartForm myForm = (AddToCartForm) form;
		if(req.getParameter("supprimer")!=null){
			double prix =cat.getLines().get(myForm.getId()).getPrix();
			double qnt = cat.getLines().get(myForm.getId()).getQuantity();
			cat.setTotal(cat.getTotal()-(prix*qnt));
			cat.getLines().remove(myForm.getId());
		}else if(req.getParameter("plus") != null){
			cat.getLines().get(myForm.getId()).setQuantity(cat.getLines().get(myForm.getId()).getQuantity()+1);
			cat.setTotal(cat.getTotal()+ cat.getLines().get(myForm.getId()).getPrix());
		}else if(req.getParameter("moins") != null){
			//Pour réduire la quantité du produit ayant l'id passer par parametre
			if(cat.getLines().get(myForm.getId()).getQuantity() == 1){
				cat.setTotal(cat.getTotal()- cat.getLines().get(myForm.getId()).getPrix());
				cat.getLines().remove(myForm.getId());
			}
			else{
//			OrderLine order = cat.getLines().get(myForm.getId());
			System.out.println( cat.getLines().get(myForm.getId()).getQuantity());
			cat.getLines().get(myForm.getId()).setQuantity( cat.getLines().get(myForm.getId()).getQuantity()-1);
			cat.setTotal(cat.getTotal()- cat.getLines().get(myForm.getId()).getPrix());
			}
		}
		req.getSession().setAttribute("cart", cat);
		return map.findForward("success");
	}

}
