package ma.jemla.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
	@Override
	public List<String> getCategoryNames() {
		try{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("fetchCategoryName");
			List<String> values = new ArrayList<String>();
			values = query.getResultList();
			return values;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
