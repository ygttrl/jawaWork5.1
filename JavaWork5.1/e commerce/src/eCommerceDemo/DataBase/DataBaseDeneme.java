package eCommerceDemo.DataBase;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.entities.concretes.User;

public class DataBaseDeneme {
	//Sim�lasyon i�in olu�turulmu class
	
	public static List<User> UserTable()
	{
		List<User> users = new ArrayList<>();
		users.add(new User(1,"Mehmet","Ko�an","mehmet.kocan@gmail.com","1234567"));
		users.add(new User(2,"Ay�e","Sar�","ayse.Sar�@gmail.com","12345678"));
		return users;
	}
	
}
