package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbc {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/infodb", "postgres","vimalraj0310");
			PreparedStatement ps1 = con.prepareStatement("insert into info values('Qwerty', 25)");
			PreparedStatement ps2 = con.prepareStatement("insert into info values('Qwert', 24)");
			ps1.executeUpdate();
			ps2.executeUpdate();
			PreparedStatement ps = con.prepareStatement("select * from info");
			ResultSet rst = ps.executeQuery();
			System.out.println("name\t\tage");
			while (rst.next()) {
				System.out.print(rst.getString(1));
				System.out.print("\t\t" + rst.getInt(2));
				// System.out.print("\t\t" + rst.getInt(3));
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
