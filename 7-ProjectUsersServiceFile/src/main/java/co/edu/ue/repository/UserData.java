package co.edu.ue.repository;

import org.springframework.stereotype.Repository; // Capa fuente de datos

import co.edu.ue.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserData {

	// 1. Declaracion de atributos
	List<User> listUsers; // Coleccion

	// 2. Metodo Constructor
	public UserData() {
		super();
		this.listUsersData();
	}

	public void listUsersData() {
		this.listUsers = new ArrayList<User>(Arrays.asList(
				new User(1, "SOFIA", "LATORRE", "SOFIA@GMAIL.COM"),
				new User(2, "MALORY", "TIQUE", "TIQUE@GMAIL.COM"), 
				new User(3, "WALDO", "LOPEZ", "LOPEZ@GMAIL.COM"),
				new User(4, "YOSED", "SANCHEZ", "SANCHEZ@GMAIL.COM"), 
				new User(5, "ZULLIE", "DIAZ", "NICOL@GMAIL.COM"),
				new User(6, "JULIAN", "GARCIA", "JULIAN@GMAIL.COM")));
	}

	public List<User> getListUser() {
		return this.listUsers;
	}

	public User getUserByMail(String email) { // Primer metodo
		for (User s : this.listUsers) {
			if (s.getMail().contains(email)) {
				return s;
			}
		}
		return null;
	}

	/*
	 * public User getUserByMail(String email) { return
	 * this.listUsers.stream().filter(i ->
	 * i.getMail().equals(email)).findFirst().orElseThrow(); }
	 */

	public User getUserById(Integer id) { // EL metodo más optimo
		return this.listUsers.stream().filter(i -> i.getId().equals(id)).findFirst().orElseThrow();
	}

	public List<User> postUser(User user) {
		boolean response = this.listUsers.add(user);
		if (response) {
			return this.listUsers;
		}
		return null;
	}

	public List<User> deleteUser(Integer id) {
		this.listUsers.removeIf(u -> u.getId().equals(id));
		return this.listUsers;
	}

	public List<User> updatedUser(Integer id, User updatedUser) {
		listUsers.replaceAll(user -> {
			if (user.getId().equals(id)) {
				user.setName(updatedUser.getName());
				user.setLastName(updatedUser.getLastName());
				user.setMail(updatedUser.getMail());
				// Actualiza aquí los demás atributos del usuario
				return user;
			}
			return user;
		});
		return listUsers;
	}
}
