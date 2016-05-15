package ma.jemla.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Catalogue {
	@Id
	@GeneratedValue
	private long id;
	
	private String description;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date date_ajout ;
	
	@ManyToMany
	private List<Product> products;
	
	
}
