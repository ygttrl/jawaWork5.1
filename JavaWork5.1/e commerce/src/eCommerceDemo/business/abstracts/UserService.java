package eCommerceDemo.business.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
		void Add(User user);
		void Update(User user,int id);
		void Delte(int id);
		List<User> GetAllUser();
}
