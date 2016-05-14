package ma.jemla.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ma.jemla.model.Manager;
import ma.jemla.model.dao.ManagerDao;

public class ManagerDaoImpl implements ManagerDao{
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("B2B-Project");
	private EntityManager em = emf.createEntityManager();
	@Override
	public boolean inserer(Manager manager) {
		try{
			em.getTransaction().begin();
			em.persist(manager);
			em.getTransaction().commit();
			em.close();
		}catch(Exception exp){
			exp.printStackTrace();
			return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("B2B-Project");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(new Manager());
		em.getTransaction().commit();
		em.close();
	}

}
