package ma.jemla.view;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

import ma.jemla.model.Category;

public class AddProductForm extends ActionForm{
	private String nom;
	private String description;
	private double prix;
	private String unite;
	private long quantite;
	private long delai_jours;
	private String imagePath;
	private String ref;
	private Category category;
	private FormFile picture;
	
	
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public FormFile getPicture() {
		return picture;
	}
	public void setPicture(FormFile picture) {
		this.picture = picture;
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
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getUnite() {
		return unite;
	}
	public void setUnite(String unite) {
		this.unite = unite;
	}
	public long getQuantite() {
		return quantite;
	}
	public void setQuantite(long quantite) {
		this.quantite = quantite;
	}
	public long getDelai_jours() {
		return delai_jours;
	}
	public void setDelai_jours(long delai_jours) {
		this.delai_jours = delai_jours;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	
	
	
	

}
