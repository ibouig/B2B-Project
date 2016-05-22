package ma.jemla.model.dao;

import java.util.List;

import ma.jemla.model.Category;

public interface CategoryDao {
	public boolean inserer(Category category);
	public List<String> getCategoryNames();
}
