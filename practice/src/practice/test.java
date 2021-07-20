package practice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		Connection con;
		try {
			Class.forName(null);
			Statement stmt = con.createStatement(0, 0);
			ResultSet rs = stmt.executeQuery("Select empid from emp");
			while (rs.next()) {
				rs.getInt(0);
			}
		} catch (Exception SQLException) {

		} finally {
			con.close();
		}
		
		Account acc = new Account();
		acc.setAccountName("ABC");
	}
}
