package ma.jemla.daoimpl;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ma.jemla.model.Product;
import ma.jemla.model.dao.ProductDao;;

public class ProductDaoImpl implements ProductDao{
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("B2B-Project");
	private EntityManager em = emf.createEntityManager();
	@Override
	public boolean inserer(Product pdt) {
		try{
			em.getTransaction().begin();
			em.persist(pdt);
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

}
