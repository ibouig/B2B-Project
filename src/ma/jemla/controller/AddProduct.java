package ma.jemla.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import ma.jemla.daoimpl.CategoryDaoImpl;
import ma.jemla.daoimpl.ProductDaoImpl;
import ma.jemla.model.Category;
import ma.jemla.model.Entreprise;
import ma.jemla.model.Product;
import ma.jemla.model.Unite;
import ma.jemla.view.AddProductForm;

public class AddProduct extends Action{

	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest req, 
			HttpServletResponse res)throws Exception
	{
		final String DATA_DIRECTORY = "data";
	    final int MAX_MEMORY_SIZE = 1024 * 1024 * 2;
	    final int MAX_REQUEST_SIZE = 1024 * 1024;
		System.out.println("in the Add product controller ");
		Entreprise entreprise = (Entreprise) req.getSession().getAttribute("ActiveUser");
		if(entreprise != null){
			
			try{
				
				AddProductForm myForm = (AddProductForm) form;
				FormFile myFile = myForm.getPicture();
				String contentType = myFile.getContentType();
				String fileName  = myFile.getFileName(); 
				String filePath = getServlet().getServletContext().getRealPath("/") +"Bootstrap\\images";
				/* Save file on the server */
				if(!fileName.equals("")){  
					System.out.println("Server path:" +filePath);
					//Create file
					File fileToCreate = new File(filePath, fileName);
					//If file does not exists create file  
					if(!fileToCreate.exists()){
						FileOutputStream fileOutStream = new FileOutputStream(fileToCreate);
						fileOutStream.write(myFile.getFileData());
						fileOutStream.flush();
						fileOutStream.close();
					}
				}
				Product pdt = new Product();
				CategoryDaoImpl c_dao = new CategoryDaoImpl();
				Category cat = c_dao.getCategoryByNames(myForm.getCategorie());
				System.out.println("dhgfdhghdgjdfhgjhfjghjfghjdhg " +myForm.getCategorie());
				pdt.setCategory(cat);
				pdt.setDateAjout(new Date());
				pdt.setDelai_jours(myForm.getDelai_jours());
				pdt.setDescription(myForm.getDescription());
				pdt.setEntreprise(entreprise);
				//pdt.setImagePath(/*getServlet().getServletContext().getRealPath("") +*/"Bootstrap/images"+entreprise.getName()+"_"+fileName);
				pdt.setImagePath("Bootstrap/images/"+fileName);
				System.out.println("\n\n\n\n"+"Bootstrap/images"+fileName+"\n\n\n");
				pdt.setPrix(myForm.getPrix());
				pdt.setNom(myForm.getNom());
				pdt.setQuantite(myForm.getQuantite());
				switch (myForm.getUnite()){
					case "KG" : pdt.setUnite(Unite.KG);break;
					case "M2" : pdt.setUnite(Unite.M2);break;
					case "M" : pdt.setUnite(Unite.M);break;
					case "L" : pdt.setUnite(Unite.L);break;
					case "G" : pdt.setUnite(Unite.G);break;
				}
				System.out.println("Info: "+myForm.getCategorie()+", "+pdt.getUnite());
				
				ProductDaoImpl p_dao = new ProductDaoImpl();
				p_dao.inserer(pdt);

			}catch(Exception e){
				e.printStackTrace();
				return mapping.findForward("entreprise");
			}
			
		}else{
			return mapping.findForward("failure");
		}
		return mapping.findForward("success");
	}
}