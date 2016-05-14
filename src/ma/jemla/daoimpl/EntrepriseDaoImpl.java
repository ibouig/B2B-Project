package ma.jemla.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ma.jemla.model.Entreprise;
import ma.jemla.model.dao.EntrepriseDao;

public class EntrepriseDaoImpl implements EntrepriseDao{
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("B2B-Project");
	private EntityManager em = emf.createEntityManager();
	@Override
	public boolean inserer(Entreprise entreprise) {
		try{
			em.getTransaction().begin();
			em.persist(entreprise);
			em.getTransaction().commit();
			em.close();
		}catch(Exception exp){
			exp.printStackTrace();
			return false;
		}
		
		return true;
	}

}
