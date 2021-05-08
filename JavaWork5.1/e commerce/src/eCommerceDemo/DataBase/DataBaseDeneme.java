package eCommerceDemo.DataBase;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.entities.concretes.User;

public class DataBaseDeneme {
	//Simülasyon için oluþturulmu class
	
	public static List<User> UserTable()
	{
		List<User> users = new ArrayList<>();
		users.add(new User(1,"Mehmet","Koçan","mehmet.kocan@gmail.com","1234567"));
		users.add(new User(2,"Ayþe","Sarý","ayse.Sarý@gmail.com","12345678"));
		return users;
	}
	
}
