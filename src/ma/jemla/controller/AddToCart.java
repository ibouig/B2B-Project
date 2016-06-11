package ma.jemla.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.daoimpl.CartDaoRemoteImpl;
import ma.jemla.model.Entreprise;
import ma.jemla.model.OrderLine;
import ma.jemla.model.Product;
import ma.jemla.view.AddToCartForm;

public class AddToCart extends Action{
	//@EJB
	CartDaoRemoteImpl cat;
	public ActionForward execute(ActionMapping map, ActionForm form, 
			HttpServletRequest req, HttpServletResponse res)throws Exception{
		System.out.println("\n\n\n\n\n\n\nadd to cart\n\n\n\n");
		Entreprise entreprise = (Entreprise) req.getSession().getAttribute("ActiveUser");
		String id = req.getParameter("id");
		req.setAttribute("idPro", id);
		try{
			cat=(CartDaoRemoteImpl) req.getSession().getAttribute("cart");
			AddToCartForm myform = (AddToCartForm) form;
			List<Product> prods = (List<Product>)req.getSession().getAttribute("prods");
			Product prod = null;
			for(int i=0; i<prods.size(); i++){
				if(myform.getId()==prods.get(i).getId()){
					prod = prods.get(i);
				}

			}
			/*First time adding the product to the session */
			if(cat == null){
				cat = new CartDaoRemoteImpl();
				OrderLine order_line = new OrderLine();
				order_line.setProduct(prod);
				order_line.setPrix(prod.getPrix());
				order_line.setQuantity(1);
				//System.out.println(order_line.getPrix());
				cat.getLines().put(myform.getId(), order_line);
				cat.setTotal(prod.getPrix());
				System.err.println("La taille du HshMapest: "+cat.getLines().size());
				//req.getSession().setAttribute("cart", cat);
			}else{
				OrderLine order_line =cat.getLines().get(myform.getId());
				if(order_line!=null){
					System.err.println("elese :"+cat.getLines().get(myform.getId()));
					long new_q = cat.getLines().get(myform.getId()).getQuantity()+1 /*+ myform.getQuatity()*/;
					System.err.println("\n\n\n\n\n"+"The quantity is :"+new_q+"\n"+myform.getId());
					order_line.setQuantity(new_q);
					double total = new_q * order_line.getPrix();
					cat.getLines().put(myform.getId(), order_line);
					cat.setTotal(cat.getTotal()+total);
				}else{
					order_line = new OrderLine();
					order_line.setProduct(prod);
					order_line.setPrix(prod.getPrix());
					order_line.setQuantity(1);
					System.err.println("Le prix est: "+order_line.getPrix());
					cat.getLines().put(myform.getId(), order_line);
					cat.setTotal(cat.getTotal()+order_line.getPrix());
				}
			}
			//				PrintWriter out = res.getWriter();
			//				out.p+rint("Cart("+cat.getLines().size()+")");
			System.out.println("Le nombre de produits est: "+cat.getLines().size());
			req.getSession().setAttribute("cart", cat);
			//System.err.println("\n\n\n\n\n In the ajax method t add to cart\n\n\nsqdf\n");
		}catch(Exception e){
			e.printStackTrace();
		}
		return map.findForward("success");
		/*}else{
			return map.findForward("failure");
		}*/

	}

}
