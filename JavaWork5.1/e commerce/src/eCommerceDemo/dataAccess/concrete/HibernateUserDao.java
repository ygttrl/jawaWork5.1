package eCommerceDemo.dataAccess.concrete;
import java.util.List;

import eCommerceDemo.DataBase.DataBaseDeneme;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao
{

	@Override
	public void add(User user) {
		System.out.println("Hibernate ekleme yap?ld?."+user.getAd());
		
	}

	@Override
	public void update(User user, int id) {
		System.out.println("Hibernate g?ncelleme yap?ld?. :"+user.getAd()+" id: "+id);
		
	}

	@Override
	public void delete(int id) {
		System.out.println("Hibernate silme yap?ld?. id:"+id);
		
	}

	@Override
	public List<User> getAll() {
		List<User> users = DataBaseDeneme.UserTable();
		return users;
	}

}
