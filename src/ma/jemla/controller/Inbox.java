package ma.jemla.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.daoimpl.EntrepriseDaoImpl;
import ma.jemla.daoimpl.MessageDaoImpl;
import ma.jemla.model.Entreprise;
import ma.jemla.model.Message;
import ma.jemla.model.MessageStatus;

public class Inbox extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req, 
			HttpServletResponse res)throws Exception
	{
		System.out.println("in the controller : inbox.java");
		EntrepriseDaoImpl e_DaoImpl = new EntrepriseDaoImpl();
		MessageDaoImpl messageDaoImpl =  new MessageDaoImpl();
		
		Entreprise entreprise = (Entreprise) req.getSession().getAttribute("ActiveUser");
		if(entreprise != null){
			
			
			
			
			
			
			List<Message> receivedMessages = messageDaoImpl.findMessageByReceiver(entreprise);
			List<Message> sentMessages = messageDaoImpl.findMessageBySender(entreprise);
			List<Message> unreadMessages = messageDaoImpl.findMessageByStatus(MessageStatus.nonlu);
			req.getSession().setAttribute("receivedMessages", receivedMessages);
			req.getSession().setAttribute("receivedMessages", receivedMessages);
			req.getSession().setAttribute("unreadMessages", unreadMessages);
			System.err.println(receivedMessages.size());
			
			return mapping.findForward("success");
		}else{
			return mapping.findForward("failure");
		}
	}
}
