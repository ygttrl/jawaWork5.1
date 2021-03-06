package eCommerceDemo.business.validates.concretes;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.DataBase.DataBaseDeneme;
import eCommerceDemo.business.validates.abstracts.ValidateService;
import eCommerceDemo.entities.concretes.User;


public class VaidateManager implements ValidateService {

	@Override
	public boolean CheckValide(String value, int legnth) {
		if (value.length()>legnth) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public boolean CheckValideEmailFormat(String value) {
		
		Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}");
		Matcher matcher = pattern.matcher(value);
		if (matcher.find()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean CheckUsedEmail(String value) {
		
		List<User> users = DataBaseDeneme.UserTable();
		for (User user :users ) {
			if (user.getEposta()==value) {
				return false;
			}
		}
		return true;
	}
	
	

}
