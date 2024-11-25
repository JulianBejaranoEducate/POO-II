package co.edu.ue.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.entity.User;
import co.edu.ue.repository.UserData;

@Service
public class UserService implements IUserService {

	/*
	 * Tipos de inyeccion: Por medio de atributos o campo, metodo setter, metodo
	 * constructor y por medio de una Interface
	 */
	
	@Value("${code}")
	double code;

	// 3. Inyeccion por constructor
	private UserData data;
	
	public UserService(UserData data) {
		this.data = data;
	}

	//private final int NUM_CODE = 100;


	@Override
	public List<User> getAllUser() {
		return data.getListUser();
	}

	/* stream */
	@Override
	public List<User> getAllUserChangeId() {
		return data.getListUser().stream().map(u -> {
			// long value = u.getId() * 100;
			// Casteo de tipos de datos numericos
			short value = (short) (u.getId() * code);
			User user = new User(value, u.getName(), u.getLastName(), u.getMail());
			return user;

		}).collect(Collectors.toList());
	}

	@Override
	public User getUserByMail(String email) {
		return data.getUserByMail(email);
	}

	@Override
	public User getById(Integer id) {
		return data.getUserById(id);
	}

	@Override
	public List<User> getSaveUser(User user) {
		return data.postUser(user);
	}

	@Override
	public List<User> deleteUserById(Integer id) {
		return data.deleteUser(id);
	}

	@Override
	public List<User> updatedUserById(Integer id, User updatedUser) {
		return data.updatedUser(id, updatedUser);
	}

}
