package ma.jemla.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;




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
