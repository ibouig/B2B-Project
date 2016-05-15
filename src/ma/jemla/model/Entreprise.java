package ma.jemla.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@NamedQuery(name="findByEmail",query="select e from Entreprise e where e.email=:email1 and e.password=:pass1")
@Entity
public class Entreprise extends Account{
	
	private String zipCode;
	
	//@Column(table="ville")
	private String ville;
	
	//@Column(table="pays")
	private String pays;
	private String adresse;
	
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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSecteur() {
		return secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}

	public String getEntrepriseType() {
		return entrepriseType;
	}

	public void setEntrepriseType(String entrepriseType) {
		this.entrepriseType = entrepriseType;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
}