package eCommerceDemo.GoogleAccount;
import eCommerceDemo.entities.concretes.User;

public class Account {
	public void GoogleAccount(User user) 
	{
		System.out.println("Account is conform! "+user.getAd() +" "+user.getSoyad()+" "+user.getEposta());
	}
}
