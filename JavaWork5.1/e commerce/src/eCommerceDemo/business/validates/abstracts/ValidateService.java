package eCommerceDemo.business.validates.abstracts;

public interface ValidateService {

	
	boolean CheckValide(String value,int legnth);
	boolean CheckValideEmailFormat(String value);
	boolean CheckUsedEmail(String value);
}
