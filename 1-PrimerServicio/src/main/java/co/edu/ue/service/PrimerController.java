package co.edu.ue.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimerController {
	
	// endPoint "welcome"
	@GetMapping(value = "welcome", produces = MediaType.APPLICATION_JSON_VALUE)
	public String bienvenida() {
		return "Bienvenido a SpringBoot";
	}
	
	// endoPoint "welcome / personalizada (Solo nombre))"
	@GetMapping(value = "welcome/{name}")
	public String bienvenidaPersonalizada(@PathVariable("name") String nombre) {
		return "Bienvenido a SpringBoot " + nombre;
	}
	
	@RequestMapping(value = "welcomes", method = RequestMethod.GET)
	public String bienvenidaPersonalizada(@RequestParam("name") String nombre, @RequestParam("lastname") String apellido) {
		return "Welcome " + nombre + " " + apellido;
	}
}