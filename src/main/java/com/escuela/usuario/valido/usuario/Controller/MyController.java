package com.escuela.usuario.valido.usuario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.escuela.usuario.valido.usuario.DummyServise;
import com.escuela.usuario.valido.usuario.Usuario;

@Controller
public class MyController {

	@Autowired
	DummyServise service;
	@GetMapping("/login")
	public String createUsuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "login";
	}

	@PostMapping("/login")
	public String readUser(@ModelAttribute Usuario usuario, Model modelo) {
		
		if (service.getAtribute(usuario.getUser(), usuario.getPass())) {
			return "okLogin";
		} else {
			modelo.addAttribute("pepe", "Usuario y/o contraseña invalido!");
			return "btn_registro";
		}

	}
	
	@GetMapping("/okLogin")
	public String createUsuario1(Usuario usuario) {
		
		return "okLogin";
	}

	@PostMapping("/okLogin")
	public String readUser1(@ModelAttribute Usuario usuario,Model modelo) {
		if(service.registerUser(usuario.getUser(), usuario))
			return "datos";
		else{
			System.out.println("error  existe usuario");
			modelo.addAttribute("pepe", "El usuario '" + usuario.getUser() +  "' ya existe!");
			return "btn_registro";
		}
	}
	
	
	
}