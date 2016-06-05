package ma.jemla.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.daoimpl.CartDaoRemoteImpl;
import ma.jemla.model.OrderLine;
import ma.jemla.model.Product;
import ma.jemla.view.AddToCartForm;

public class AddToCart extends Action{
	@EJB
	CartDaoRemoteImpl cat;
	public ActionForward execute(ActionMapping map, ActionForm form, 
			HttpServletRequest req, HttpServletResponse res)throws Exception{
		try{
			//System.err.println("nin the controller"+"\n\n\n\nhere");
			/**/cat=(CartDaoRemoteImpl) req.getSession().getAttribute("cart");
			AddToCartForm myform = (AddToCartForm) form;
			List<Product> prods = (List<Product>)req.getSession().getAttribute("prods");
			Product prod = null;
			System.out.println(myform.getId()+"");
			System.out.println("\n\n\n the products are: ");
			for(int i=0; i<prods.size(); i++){
				if(myform.getId()==prods.get(i).getId()){
					System.out.println("product "+i+": "+prods.get(i).getId()+"\n");
					prod = prods.get(i);
				}
					
			}
			System.out.println("\n\n\n_lfhgkjlsdfhglskdjfghlksjdghlkjdfhgldkjf"
					+ "dsfgsdkjfghjlkdfsghlkjsdfghlkdsjghjlkdsgf\n"
					+ "dfgjkmldfhgkjdfhglkjdfhgkjsdfhgkljhdsflg\n"
					+ "sdfgkjldsfgkjfhsgjkhsdfkgjldskjfg\n"
					+ "dsfgkljdsfgkjlsdflkmgjmsldkjfgmlkdsjfg\n"
					+ "hello there my name is Hamza Kasry, I'm a student from ensa marrakech"
					+ "annnnnnnnd yeah ALahmdollah"
					+ "product id: "+prod.getId());
			//System.err.println("\n\n\n\nin the controller"+prod+"\n\n\n\nhere");
			if(cat == null){
				System.out.println("Product: "+prod.getPrix()+"\n");
				OrderLine order_line = new OrderLine();
				order_line.setProduct(prod);
				order_line.setPrix(prod.getPrix());
				//order_line.setQuantity(quantity);
				cat.getLines().put(myform.getId(), order_line);
				//req.getSession().setAttribute("cart", cat);
			}else{
				long new_q = cat.getLines().get(myform.getId()).getQuantity() /*+ myform.getQuatity()*/;
				/**/cat.getOrderLine().get(myform.getId()).setQuantity(new_q);
			}
			PrintWriter out = res.getWriter();
			out.print("Cart("+cat.getLines().size()+")");
			System.out.println(cat.getLines().size());
			req.getSession().setAttribute("cart", cat);
			//System.err.println("\n\n\n\n\n In the ajax method t add to cart\n\n\nsqdf\n");
		}catch(Exception e){
			e.printStackTrace();
		}
		return map.findForward("success");
	}

}
