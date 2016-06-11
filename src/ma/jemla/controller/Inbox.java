package ma.jemla.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.daoimpl.MessageDaoImpl;
import ma.jemla.model.Account;
import ma.jemla.model.Entreprise;
import ma.jemla.model.Message;

public class Inbox extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req, 
			HttpServletResponse res)throws Exception
	{
		MessageDaoImpl m_dao = new MessageDaoImpl();
		List<Message> messages = m_dao.findMessageByReceiver((Account)req.getSession().getAttribute("ActiveUser"));
		System.out.println("To get the messages ");
		for(Message tmp:messages)
			System.out.println(tmp.getId());
		req.setAttribute("msgs", messages);
		Entreprise entreprise = (Entreprise) req.getSession().getAttribute("ActiveUser");
		if(entreprise != null){
			return mapping.findForward("success");
		}else{
			return mapping.findForward("failure");
		}
	}
}
