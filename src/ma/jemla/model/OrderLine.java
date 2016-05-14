package ma.jemla.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderLine {
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	private Order order;
	
	@ManyToOne
	private Product product;
	
	private long quantity;
	
	private double prix;

	public OrderLine(Order order, Product product, long quantity, double prix) {
		super();
		this.order = order;
		this.product = product;
		this.quantity = quantity;
		this.prix = prix;
	}

	public OrderLine() {
		super();
		// TODO Auto-generated constructor stub
	}

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
