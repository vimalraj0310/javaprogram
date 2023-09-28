package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Movies_jdbc {

	public static void main(String[] args) {
try {
	Class.forName("org.postgresql.Driver");
	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/moviesdb","postgres","vimalraj0310");
	PreparedStatement ps=con.prepareStatement("insert into movie values(1,'Dharbar','rajini',2021,121)");
	PreparedStatement ps1=con.prepareStatement("insert into movie values(2,'mersal','vijay',2020,123)");
	PreparedStatement ps2=con.prepareStatement("insert into movie values(3,'vikram','kamal',2023,124)");
	PreparedStatement ps3=con.prepareStatement("insert into movie values(4,'beast','vijay',2022,130)");
	PreparedStatement ps4=con.prepareStatement("insert into movie values(5,'visvasam','ajith',2019,120)");
	PreparedStatement ps5=con.prepareStatement("insert into movie values(6,'ayan','surya',2021,129)");
	PreparedStatement ps6=con.prepareStatement("insert into movie values(7,'kaththi','vjay',2017,125)");
	PreparedStatement ps7=con.prepareStatement("insert into movie values(8,'jaibheem','surya',2022,128)");
	PreparedStatement ps8=con.prepareStatement("insert into movie values(9,'ghilli','vijay',2007,140)");
	
	
	
	
	ps.executeUpdate();
	ps1.executeUpdate();
	ps2.executeUpdate();
	ps3.executeUpdate();
	ps4.executeUpdate();
	ps5.executeUpdate();
	ps6.executeUpdate();
	ps7.executeUpdate();
	ps8.executeUpdate();
	

	PreparedStatement select = con.prepareStatement("select * from movie");
	ResultSet rst = select.executeQuery();
	
	
	
	System.out.println("id\t\tmovie_name\t\tActor\t\tyear\t\tminutes");
	while (rst.next()) {
		System.out.print(rst.getInt(1));
		System.out.print("\t\t"+rst.getString(2));
		System.out.print("\t\t"+rst.getString(3));
		System.out.print("\t\t"+rst.getInt(4));
		System.out.print("\t\t"+rst.getInt(5));
		System.out.println();
	
	}

	System.out.println("Success");
}catch(Exception e)
{
	System.out.println("please try again!!!");
}
	}

}
