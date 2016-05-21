package ma.jemla.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ma.jemla.model.Category;
import ma.jemla.model.dao.CategoryDao;

public class CategoryDaoImpl implements CategoryDao{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("B2B-Project");
	EntityManager em = emf.createEntityManager();
	@Override
	public boolean inserer(Category category) {
		try{
		em.getTransaction().begin();
		em.persist(category);
		em.getTransaction().commit();
		em.close();
	}catch(Exception exp){
		exp.printStackTrace();
		return false;
	}
	
	return true;
	}

}
