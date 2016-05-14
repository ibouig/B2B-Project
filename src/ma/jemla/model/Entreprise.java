package ma.jemla.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;



@NamedQuery(name="findByEmail",query="select e from Entreprise e where e.email=:email1 and e.password=:pass1")
@Entity
public class Entreprise extends Account{
	private String street;
	
	private String zipCode;
	
	//@Column(table="ville")
	private String ville;
	
	//@Column(table="pays")
	private String pays;
	
	private String phone;
	
	//@Column(table="secteur")
	private String secteur;
	
	//@Column(table="entrepriseType")
	private String entrepriseType;
	
	private String nomEntreprise;
	
	private String raisonSociale;
	
	private String description;
	
	@OneToMany(mappedBy = "entreprise")
	private List<Product> products;
	
	
	
}
