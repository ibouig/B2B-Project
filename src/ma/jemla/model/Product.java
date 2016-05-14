package ma.jemla.model;

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



@Entity
public class Product {
	
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
	
	@OneToMany
	private List<OrderLine> orderLines;
	
	@ManyToOne
	private Category category;
	
	@ManyToMany
	private List<Catalogue> cataogues;
	

	@JoinColumn(name = "product")
	@ManyToOne(fetch = FetchType.LAZY)
	private Entreprise entreprise;
}
