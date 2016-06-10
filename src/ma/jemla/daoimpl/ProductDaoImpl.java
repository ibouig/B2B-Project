package ma.jemla.daoimpl;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ma.jemla.model.Entreprise;
import ma.jemla.model.Product;
import ma.jemla.model.dao.ProductDao;;

public class ProductDaoImpl implements ProductDao{
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("B2B-Project");
	private EntityManager em = emf.createEntityManager();
	
	public boolean validate(Long pdt) {
		try{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateValid");
			query.setParameter("id", pdt);
			query.executeUpdate();
			em.getTransaction().commit();
			
		}catch(Exception exp){
			exp.printStackTrace();
			return false;
		}
		return true;
	}
	@Override
	public boolean inserer(Product pdt) {
		try{
			System.err.println("Dans DAOImp de Produit "+pdt.getCategory().getNom());
			em.getTransaction().begin();
			em.persist(pdt);
			em.getTransaction().commit();
			
		}catch(Exception exp){
			exp.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public boolean delete(Product pdt) {
		try{
			em.getTransaction().begin();
			em.remove(pdt);
			em.getTransaction().commit();
			
		}catch(Exception exp){
			exp.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean delete(Long pdt) {
		try{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteById");
			query.setParameter("id", pdt);
			query.executeUpdate();
			em.getTransaction().commit();
			
		}catch(Exception exp){
			exp.printStackTrace();
			return false;
		}
		return true;
	}
	@Override
	public List<Product> getProducts() {
		try{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("fetchProducts");
			List<Product> values = query.getResultList();
			/*System.out.println("In the fetchProducts query"+values.size()+"\n\n\n\n");
			
			for(Product tmp:values)
				System.out.println(tmp.getNom());*/
			values = query.getResultList();
			return values;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public Entreprise getEntreprise(long id){
		try{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("getEntreprise");
			query.setParameter("id", id);
			Entreprise value = (Entreprise) query.getSingleResult();
			return value;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Product> getInvalidProducts() {
		try{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("fetchInvalid");
			List<Product> values = query.getResultList();
			/*System.out.println("In the fetchProducts query"+values.size()+"\n\n\n\n");
			
			for(Product tmp:values)
				System.out.println(tmp.getNom());*/
			values = query.getResultList();
			return values;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Product> getNotValidProducts() {
		try{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("fetchValid");
			List<Product> values = query.getResultList();
			/*System.out.println("In the fetchProducts query"+values.size()+"\n\n\n\n");
			
			for(Product tmp:values)
				System.out.println(tmp.getNom());*/
			values = query.getResultList();
			return values;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public List<Product> getEntrepriseProducts(long ese){
		try{
			System.out.println("In the ProductDaoImpl getEntrepriseProducts\n\n");
			em.getTransaction().begin();
			Query query = em.createNamedQuery("fetchByEntreprise");
			query.setParameter("entreprise", ese);
			List<Product> value = (List<Product>) query.getResultList();
			for( Product tmp:value)
				System.out.println(tmp.getId());
			return value;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Product> getEntrepriseProducts(Entreprise ese){
		try{
			System.out.println("In the ProductDaoImpl getEntrepriseProducts\n\n");
			em.getTransaction().begin();
			Query query = em.createNamedQuery("fetchByEntreprise");
			query.setParameter("entreprise", ese.getId());
			List<Product> value = (List<Product>) query.getResultList();
			for( Product tmp:value)
				System.out.println(tmp.getId());
			return value;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Product> getCatProducts(String cat){
		try{
			System.out.println("In the ProductDaoImpl getCatProducts\n\n");
			em.getTransaction().begin();
			Query query = em.createNamedQuery("fetchByCategory");
			query.setParameter("cat", cat);
			List<Product> value = (List<Product>) query.getResultList();
			for( Product tmp:value)
				System.out.println(tmp.getId());
			return value;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
