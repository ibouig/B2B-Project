package ma.jemla.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ma.jemla.model.Entreprise;
import ma.jemla.model.Product;
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
	@Override
	public Entreprise login(String email, String password) {
		Entreprise ent = new Entreprise();
		try{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByEmail");
			query.setParameter("email1", email);
			query.setParameter("pass1", password);
			ent = (Entreprise)query.getSingleResult();
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return ent;
	}
	
	public List<Entreprise> getEntreprises() {
		try{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("fetchEntreprise");
			List<Entreprise> values = query.getResultList();
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

	public Entreprise getEntreprise(long arg) {
		try{
			//em.getTransaction().begin();
			Query query = em.createNamedQuery("fetchByID");
			query.setParameter("id", arg);
			Entreprise values = (Entreprise)query.getSingleResult();
			return values;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
