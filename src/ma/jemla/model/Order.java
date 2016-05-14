package ma.jemla.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Order {
	@Id
	@GeneratedValue
	private long id ;
	
	@ManyToOne
	private Entreprise entreprise;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	
	
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;
	
	@OneToMany
	private List<OrderLine> lines ;
	
	private double prixTotal;
	
	@OneToOne
	private Payement payement;
	
	
	
	
	
	
	
}
