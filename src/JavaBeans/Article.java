package JavaBeans;

public class Article {
	String designation,categorie,photo;
	int stock,id;
	double prix;
	
	
	public Article(int id,String designation, String categorie, int stock, double prix, String photo) {
		super();
		this.id = id;
		this.designation = designation;
		this.categorie = categorie;
		this.stock = stock;
		this.prix = prix;
		this.photo = photo;
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
