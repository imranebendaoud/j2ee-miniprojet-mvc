package JavaBeans;

public class Categorie {
	int id;
	String categorie;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(int id, String categorie) {
		super();
		this.id = id;
		this.categorie = categorie;
	}
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", categorie=" + categorie + "]";
	}
}
