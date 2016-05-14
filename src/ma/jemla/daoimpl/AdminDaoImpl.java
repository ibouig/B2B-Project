package ma.jemla.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ma.jemla.model.Admin;
import ma.jemla.model.dao.AdminDao;

public class AdminDaoImpl implements AdminDao{
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("B2B-Project");
	private EntityManager em = emf.createEntityManager();
	@Override
	public boolean inserer(Admin admin) {
		try{
			em.getTransaction().begin();
			em.persist(admin);
			em.getTransaction().commit();
			em.close();
		}catch(Exception exp){
			exp.printStackTrace();
			return false;
		}
		
		return true;
	}
}
