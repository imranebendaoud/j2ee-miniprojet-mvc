package ConnectionPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import JavaBeans.Article;
import JavaBeans.Categorie;
import JavaBeans.Client;

public class DBConnection {

	public static Connection getConnection() {
		Connection conn;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection("jdbc:mysql://mysql-25533-0.cloudclusters.net:25533/miniprojet", "imrane", "password");
			return conn;
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			return null;
		}
	}

	public static void executeQuery(String query) {
		Connection conn = getConnection();
		Statement st;
		try {
			st = conn.createStatement();
			st.executeUpdate(query);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static String insertData(Client client) {
		Connection conn = getConnection();
		PreparedStatement st;
		String sql = "insert into clients(Email,Nom,Prenom,Adresse,Tel,MotPasse) values(?,?,?,?,?,?)";
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, client.getEmail());
			st.setString(2, client.getNom());
			st.setString(3, client.getPrenom());
			st.setString(4, client.getAdresse());
			st.setInt(5, client.getTel());
			st.setString(6, client.getMotpasse());
			st.executeUpdate();
			st.close();
			conn.close();
			return "inserted";

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return "not inserted";
	}

	public static boolean testLogin(Client client) {
		String sql = "select * from clients where Email = '" + client.getEmail() + "' and MotPasse='"
				+ client.getMotpasse() + "'";
		Connection conn = getConnection();
		PreparedStatement st;
		ResultSet rs;
		try {
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			if (rs.next()) {
				return true;
			} else
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	public static ArrayList<Article> getArticle(String categorie) {
		ArrayList<Article> listArticle = new ArrayList<Article>();
		Connection conn = getConnection();

		Statement st, stt;
		ResultSet rs, rss;
		String sqll = "select * from categories where RefCat = " + Integer.parseInt(categorie) + "";

		Article article;

		try {
			stt = conn.createStatement();
			rss = stt.executeQuery(sqll);
			while (rss.next()) {
				String cat = rss.getString("Cat");
				String sql = "select * from articles where Categorie = '" + cat + "'";
				st = conn.createStatement();
				rs = st.executeQuery(sql);
				while (rs.next()) {
					article = new Article(rs.getInt(1), rs.getString(2), rs.getString(5), rs.getInt(4),
							rs.getDouble(3),rs.getString(6));
					listArticle.add(article);

				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listArticle;

	}

	public static ArrayList<Categorie> listCategories() {
		ArrayList<Categorie> listCategory = new ArrayList<Categorie>();
		Connection conn = getConnection();

		String sql = "SELECT * FROM categories";
		Categorie category;

		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				int id = result.getInt("RefCat");
				String categorie = result.getString("Cat");
				category = new Categorie(id, categorie);
				listCategory.add(category);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listCategory;
	}

	public static Article getArticle2(int id) {
	      Connection conn = getConnection();
	      Statement st;
	      ResultSet rs;
	      Article article;
	      String sql = "select * from articles where CodeArticle = '"+id+"'";
	      try {		    
			    st = conn.createStatement();
			    rs = st.executeQuery(sql);
			    while(rs.next()) {
			    	article = new Article(rs.getInt(1),rs.getString(2), rs.getString(5), rs.getInt(4), rs.getDouble(3),rs.getString(6));
			    	return article;
	    	
			    	}
		    
		    
	}catch(SQLException e)	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

}
	
	public static String getClient(String email) {
		Connection conn = getConnection();
		Statement st;
		ResultSet rs;
		String sql = "select Nom from clients where Email = '"+email+"'";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				String nom = rs.getString("Nom");
				return nom;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
