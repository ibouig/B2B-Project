package ma.jemla.model.dao;

import ma.jemla.model.Entreprise;

public interface EntrepriseDao {
	public boolean inserer(Entreprise ent);
	public Entreprise login(String email, String password);

}
