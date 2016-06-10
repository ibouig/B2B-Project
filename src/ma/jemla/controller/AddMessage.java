package ma.jemla.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.daoimpl.EntrepriseDaoImpl;
import ma.jemla.daoimpl.MessageDaoImpl;
import ma.jemla.daoimpl.ProductDaoImpl;
import ma.jemla.model.Account;
import ma.jemla.model.Entreprise;
import ma.jemla.model.Message;
import ma.jemla.view.MessageForm;

public class AddMessage extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req, 
			HttpServletResponse res)throws Exception
	{
		System.out.println("in the controller of addMessage login");
		MessageForm myForm = (MessageForm) form;
		MessageDaoImpl c_DaoImpl = new MessageDaoImpl();
		Message msg = new Message();
		msg.setMessageContent(myForm.getMessage());//essage(myForm.getMessage());
		//msg.setNom(myForm.getNom());

		if(req.getSession().getAttribute("ActiveUser") == null)
			return mapping.findForward("failure");
		Account acc = (Account) req.getSession().getAttribute("ActiveUser");
		//if(acc.getClass() == Entreprise.class){
		EntrepriseDaoImpl e_dao = new EntrepriseDaoImpl();
		List<Entreprise> ents = (List<Entreprise>)e_dao.getEntreprises();
		ProductDaoImpl p_dao = new ProductDaoImpl();
		System.out.println("the id is: "+myForm.getId());
		EntrepriseDaoImpl e_dao1 = new EntrepriseDaoImpl();
		Entreprise receiver = e_dao1.getEntreprise(myForm.getId());
		System.out.println("L'id retourné est: "+receiver.getId());
		//System.out.println("the email of the receiver is "+receiver.getEmail());
		msg.setSender((Entreprise)acc);
		msg.setReciever(receiver);
		msg.setSendDate(new Date());
//		for(Entreprise tmp: ents)
//		{
//			if(tmp.getId() == acc.getId()){
//				msg.setSender(tmp);
//				msg.setSendDate(new Date());
//				//}else if(tmp.getId() == receiver.getId())
//				//msg.setReciever(receiver);
//			}
//		}

		if(c_DaoImpl.addMessage(msg)){
			return mapping.findForward("success");
		}else{
			return mapping.findForward("failure");
		}
		//}
	}
}
