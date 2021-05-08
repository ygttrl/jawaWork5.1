package eCommerceDemo.business.concretes;
import java.util.List;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.validates.abstracts.ValidateService;
import eCommerceDemo.core.GoogleService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;



public class UserManager implements UserService {
	
	private UserDao userDao;
	private ValidateService validateService ;
	private GoogleService googleService;
	
	public UserManager(UserDao userDao,ValidateService validateService,GoogleService googleService) {
		this.userDao = userDao;
		this.validateService = validateService;
		this.googleService=googleService;
	}

	@Override
	public void Add(User user) {
		 if (validateService.CheckValide(user.getAd(), 2)==false) {
			System.out.println("Ad en az iki(2) karakter olmalýdýr.");
		}else if (validateService.CheckValide(user.getSoyad(), 2)==false) {
			System.out.println("Soyad en az iki(2) karakter olmalýdýr.");
		}else if (validateService.CheckValide(user.getParola(), 6)==false) {
			System.out.println("Parola en az altý(6) karakter olmalýdýr.");
		}else if(validateService.CheckValideEmailFormat(user.getEposta())==false)
		{
			System.out.println("E-mail formatý yanlýþ lütfen dogru formatta giriniz.");
		}else if(validateService.CheckUsedEmail(user.getEposta())==false)
		{
			System.out.println("Bu e-mail kullanýlmaktadýr.");
		}else {
			googleService.IsConform(user);
			userDao.add(user);
		}
	}

	@Override
	public void Update(User user, int id) {
		userDao.update(user, id);
	}

	@Override
	public void Delte(int id) {
		userDao.delete(id);
	}

	@Override
	public List<User> GetAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
