package co.edu.ue.service;

import java.util.List;
import co.edu.ue.entity.User;

// Las interface son un contrato que debe cumplir la clase que la implemente, es decir que haga uso de esta interface.
public interface IUserService {
	
	List<User> getAllUser();
	List<User> getAllUserChangeId();
	User getUserByMail(String email);
	User getById(Integer id);
	List<User> getSaveUser(User user);
	List<User> deleteUserById(Integer id);
	List<User> updatedUserById(Integer id, User updatedUser);
}
