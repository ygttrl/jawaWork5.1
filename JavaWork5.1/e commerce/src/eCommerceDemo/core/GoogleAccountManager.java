package eCommerceDemo.core;
import eCommerceDemo.GoogleAccount.Account;
import eCommerceDemo.entities.concretes.User;

public class GoogleAccountManager implements GoogleService  {

	@Override
	public void IsConform(User user) {
		Account account = new Account();
		
		account.GoogleAccount(user);
	}

	

}
