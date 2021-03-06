package com.bilgeadam.boost.java.course01.lesson42;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class CategoryName2Employee {
	
	public static void main(String[] args) {
		
		DatabaseHelper dbH = DatabaseHelper.getInstance();
		DatabaseHelper dbH1 = DatabaseHelper.getInstance();
		
		String select = "SELECT categoryid, categoryname, description FROM categories ORDER BY categoryname;";
		
		BAUtils.header("Sipariş Şikayet");
		
		HashMap<Integer, String> categories = new HashMap<>();
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbH.getURL());
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(select);
			while (rs.next()) {
				int key = rs.getInt(1);
				String value = rs.getString(2) + " (" + rs.getString(3) + ")";
				categories.put(key, value);
			}
		} catch (SQLException ex1) {
			ex1.printStackTrace();
		}
		
		boolean cont = true;
		
		while (cont) {
			int categoryId = BAUtils.menu(categories);
			// int categoryId = BAUtils.readInt("Siparişiniz hangi kategoride idi?");
			findEmployee(con, categoryId);
			cont = BAUtils.wantToEnd("Devam etmek isityor musunuz (evet/hayır)?", "hayır");
		}
		BAUtils.footer();
	}
	
	private static void findEmployee(Connection con, int id) {
		
		String select = "SELECT DISTINCT firstname, lastname "
				+ "FROM categories a, products p, order_details c, orders b, employees d "
				+ "WHERE a.categoryid=p.categoryid AND " + "p.productid=c.productid AND "
				+ "c.orderid=b.orderid AND b.employeeid=d.employeeid " + "AND a.categoryid=? " + "ORDER BY firstname;";
		
		try (PreparedStatement pStmt = con.prepareStatement(select);) {
			pStmt.setInt(1, id);
			ResultSet ordersResultSet = pStmt.executeQuery();
			
			int i = 1;
			while (ordersResultSet.next()) {
				System.out.println(i++ + " - " + ordersResultSet.getString(1) + " " + ordersResultSet.getString(2));
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}
}

/*
 * do {
 * listCategorie = sqlConnect.getListCategoriegs();
 * int ichoose = ConsoleHelper.getInstance().showMenu("Kategori Seç: ",
 * listCategorie.stream()
 * .collect(Collectors.toMap(Categorie::getCategoryid,
 * Categorie::getCategoryname)));
 * chooseCategorieg(ichoose, sqlConnect);
 * } while (ConsoleHelper.getInstance().readInteger("\nÇıkış Yap ... [0]") !=
 * 0);
 */
