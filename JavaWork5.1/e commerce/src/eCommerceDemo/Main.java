package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.business.validates.concretes.VaidateManager;
import eCommerceDemo.dataAccess.concrete.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"Yiðit","Tirali","mehmet.kocan@gmail.com","12356785685679679");
		
		UserService service =new UserManager(new HibernateUserDao(),new VaidateManager());
		service.Add(user);
		
	}

}
