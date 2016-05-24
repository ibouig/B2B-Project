package ma.jemla.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ma.jemla.daoimpl.CategoryDaoImpl;
import ma.jemla.model.Entreprise;

public class AddProductRedirect extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req, 
			HttpServletResponse res)throws Exception
	{
		System.out.println("in the controller ");
		Entreprise entreprise = (Entreprise) req.getSession().getAttribute("ActiveUser");
		if(entreprise != null){
			try{
				CategoryDaoImpl c_dao = new CategoryDaoImpl();
				List<String> values = new ArrayList<String>();
				values = c_dao.getCategoryNames();
//				for(String tmp:values)
//					System.out.println(tmp);
				req.setAttribute("categories", values);
			}catch(Exception e){
				e.printStackTrace();
			}
			return mapping.findForward("success");
		}else{
			return mapping.findForward("failure");
		}
	}

}
