package ma.jemla.model;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;



@NamedQuery(name="findByEmail",query="select e from Entreprise e where e.email=:email1 and e.password=:pass1")
@Entity
public class Entreprise extends Account{
	

}
