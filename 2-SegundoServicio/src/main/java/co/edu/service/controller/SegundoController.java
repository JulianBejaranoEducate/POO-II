package co.edu.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SegundoController {
	
	@GetMapping(value = "suma/{num1}/{num2}")
	public double suma(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
		return num1 + num2;
	}
	
	@GetMapping(value = "resta/{num1}/{num2}")
	public double resta(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
		return num1 - num2;
	}
	
	@GetMapping(value = "multiplicacion/{num1}/{num2}")
	public double multiplicacion(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
		return num1 * num2;
	}
	
	@GetMapping(value = "division/{num1}/{num2}")
	public double division(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
		return num1 / num2;
	}
	
	@GetMapping(value = "potencia/{num1}/{num2}")
	public double potencia(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
		return Math.pow(num1, num2);
	}
}
