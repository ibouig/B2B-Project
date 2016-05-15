package ma.jemla.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Payement {
	@Id
	@GeneratedValue
	private long id ;

	@OneToOne
	private Order order;
	
	
}
