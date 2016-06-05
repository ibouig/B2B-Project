package ma.jemla.model.dao;

import java.util.List;

import ma.jemla.model.Product;

public interface ProductDao {
	public boolean inserer(Product pdt);
	public List<Product> getProducts();

}
