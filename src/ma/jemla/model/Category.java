package ma.jemla.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
@NamedQueries(
		@NamedQuery(name="fetchCategoryName", query="Select c.nom from Category c")
		)
@Entity
public class Category {
	@Id
	@GeneratedValue
	private long id;
	
	private String nom;
	private String description;
	
	@OneToMany
	private List<Product> products;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String nom, String description) {
		super();
		this.nom = nom;
		this.description = description;
	}
	

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

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
