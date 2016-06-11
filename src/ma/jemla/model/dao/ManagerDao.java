package ma.jemla.model.dao;

import ma.jemla.model.Manager;

public interface ManagerDao {
	public boolean inserer(Manager manager);
	public Manager login(String email, String password);
}
