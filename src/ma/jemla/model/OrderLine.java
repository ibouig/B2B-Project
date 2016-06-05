package ma.jemla.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderLine implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;
	
//	@ManyToOne
//	private Order order;
//	
	@ManyToOne
	private Product product;
	
	private long quantity;
	
	private double prix;

	public OrderLine(Product product, long quantity) {
		super();
		//this.order = order;
		this.product = product;
		this.quantity = quantity;
		this.prix = product.getPrix()*quantity;
	}

	public OrderLine() {
		prix = 0;
		quantity = 0;
		product = null;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	
	
	
}
