package com.bilgeadam.boost.java.course01.lesson41;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class onemlipreparedstatement {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen kategori adı giriniz");
		String categoryname = klavye.nextLine();
		
		String url = "jdbc:postgresql://localhost:5433/northwind?user=sercanboost&password=root";
		
		String orderSelect = "select DISTINCT employees.firstname,employees.lastname  from  products \r\n"
				+ "inner join categories on products.categoryid = categories.categoryid \r\n"
				+ "inner join order_details  on products.productid = order_details.productid\r\n"
				+ "inner join orders on order_details.orderid = orders.orderid\r\n"
				+ "inner join employees on orders.employeeid = employees.employeeid\r\n"
				+ "where categories.categoryname=?; ";
		
		try (Connection con = DriverManager.getConnection(url); Statement stmt = con.createStatement();) {
			
			PreparedStatement pStmt = con.prepareStatement(orderSelect);
			
			pStmt.setString(1, categoryname);
			ResultSet ordersResultSet = pStmt.executeQuery();
			
			while (ordersResultSet.next()) {
				System.out.println("\t\t--> | " + ordersResultSet.getString(1) + " " + ordersResultSet.getString(2));
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	
}