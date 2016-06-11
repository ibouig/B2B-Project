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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	
}
