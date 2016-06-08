package ma.jemla.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries({
		@NamedQuery(name="fetchByCategorie", query="select p from Product p where p.category=:cat"),
		@NamedQuery(name="fetchProducts", query="select p from Product p where p.validate = TRUE"),
		@NamedQuery(name="fetchInvalid", query="select p from Product p where p.validate = FALSE"),
		@NamedQuery(name="updateValid", query="UPDATE Product p set p.validate = TRUE where p.id=:id"), 
		@NamedQuery(name="deleteById", query="DELETE FROM Product p where p.id=:id")
})

@Entity
public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;

	private String nom;
	private String description;
	private double prix;
	
	@Enumerated(EnumType.STRING)
	private Unite unite;
	private long quantite;
	private long delai_jours;
	private String imagePath;
	private String ref;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dateAjout;
	
	private boolean validate;
	
	@OneToMany
	private List<OrderLine> orderLines;
	
	@ManyToOne
	private Category category;
	
	@ManyToMany
	private List<Catalogue> cataogues;
	

	@JoinColumn(name = "product")
	@ManyToOne(fetch = FetchType.LAZY)
	private Entreprise entreprise;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public Unite getUnite() {
		return unite;
	}


	public void setUnite(Unite unite) {
		this.unite = unite;
	}


	public long getQuantite() {
		return quantite;
	}


	public void setQuantite(long quantite) {
		this.quantite = quantite;
	}


	public long getDelai_jours() {
		return delai_jours;
	}


	public void setDelai_jours(long delai_jours) {
		this.delai_jours = delai_jours;
	}


	public String getImagePath() {
		return imagePath;
	}


	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}


	public String getRef() {
		return ref;
	}


	public void setRef(String ref) {
		this.ref = ref;
	}


	public Date getDateAjout() {
		return dateAjout;
	}


	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}


	public List<OrderLine> getOrderLines() {
		return orderLines;
	}


	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public List<Catalogue> getCataogues() {
		return cataogues;
	}


	public void setCataogues(List<Catalogue> cataogues) {
		this.cataogues = cataogues;
	}


	public Entreprise getEntreprise() {
		return entreprise;
	}


	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}


	public boolean isValidate() {
		return validate;
	}


	public void setValidate(boolean validate) {
		this.validate = validate;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
