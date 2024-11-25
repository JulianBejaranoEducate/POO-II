package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.entity.Dato;
import co.edu.ue.service.IDatoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DatoController {
	
	@Autowired
	IDatoService service;
	
	@PostMapping(value = "dato-sav")
	public List<Dato> postDato(@RequestBody Dato dato) {
		return service.addDato(dato);
	}
	
	@GetMapping(value = "dato-all")
	public List<Dato> getAllDato() {
		return service.listAll();
	}
	
	@PutMapping(value = "dato-up")
	public Dato putDato(@RequestBody Dato dato) {
		/* 
		 * 1. Buscar que el dato exista -> capa service
		 * 2. Si existe, actualizarlo
		 * 3. Actualizacion por ID
		 */
		return service.upDato(dato);
	}
	
	@GetMapping(value = "dato-id")
	public Dato findIdDato(@RequestParam ("id") int id) {
		return service.findIdDato(id);
	}
	
	@GetMapping(value = "dato-email")
	public Dato findEmailDato(@RequestParam ("email") String mail) {
		return service.findEmailDato(mail);
	}
}
