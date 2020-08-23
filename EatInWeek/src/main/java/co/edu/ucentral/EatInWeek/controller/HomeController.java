package co.edu.ucentral.EatInWeek.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.edu.ucentral.EatInWeek.model.Usuario;



@Controller
public class HomeController {
	
	@GetMapping("/")
	public String verHome(Model model) {
		return "home";
	}
	
	@GetMapping("/login")
	public String iniciarSesion(Model model, Usuario usuario) {
		return "login";
	}
	
	@GetMapping("/colab")
	public String verColaboradores(Model model) {
		return "colaboradores";
	}
	
	@GetMapping("/unirse")
	public String inscribirse(Model model) {
		return "form";
	}
	
}