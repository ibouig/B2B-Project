package ma.jemla.daoimpl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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

}
