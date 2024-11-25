package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.entity.User;
//import co.edu.ue.repository.UserData;
import co.edu.ue.service.IUserService;

@RestController
@RequestMapping(value = "api")
public class UserController {
	
	// UserData data = new UserData(); // Fuente de datos a traves de instanciacion
	
	// Inyeccion por Interface
	@Autowired
	IUserService service;
	
	/*
	 * Validaciones con expresiones regulares
	 */
	
	// Retorna todos los usuarios
	@GetMapping(value = "users")
	public List<User> getAllUsers() {
		return service.getAllUser();
	}
	
	// Retorna todos los usuarios con el Id modificado
	@GetMapping(value = "users-id")
	public List<User> getAllUsersIdChange() {
		return service.getAllUserChangeId();
	}
	
	// Retorna un usuario por correo
	@GetMapping(value = "user-mail")
	public User getMethodName(@RequestParam("email") String correo) {
		return service.getUserByMail(correo);
	}
	
	// Retorna un usuario por id
	@GetMapping(value = "user-id")
	public User getUserId(@RequestParam("id") Integer id) {
		return service.getById(id);
	}
	
	// Retorna un usuario nuevo "agregar un usuario nuevo"
	@PostMapping(value = "user-add")
	public List<User> postUser(@RequestBody User user) {
		return service.getSaveUser(user);
	}
	
	// Metodo eliminar el usuario
	@DeleteMapping(value = "user-delete")
	public List<User> deleteUser(@RequestParam("id") Integer id) {
		return service.deleteUserById(id);
	}
	
	// Metodo actualizar
	@PutMapping(value = "user-updated/{id}")
	public List<User> updatedUser(@PathVariable("id") Integer id, @RequestBody User updatedUser) {
	    return service.updatedUserById(id, updatedUser);
	}
}
