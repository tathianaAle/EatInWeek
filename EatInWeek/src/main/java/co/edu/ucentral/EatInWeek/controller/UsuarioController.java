package co.edu.ucentral.EatInWeek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.edu.ucentral.EatInWeek.model.Usuario;
import co.edu.ucentral.EatInWeek.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usService;
	
	@RequestMapping(value = "/inicio", method = RequestMethod.POST)
	public String iniciarSesion(Model model,Usuario usuario) {
		Usuario us=usService.inciarSesion(usuario);
		System.out.println(us.toString());
		return "redirect:/";
	}
}

