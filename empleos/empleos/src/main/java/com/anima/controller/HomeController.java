package com.anima.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.anima.model.Vacante;

@Controller
public class HomeController {
	

	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Vacante vacante= new Vacante();
		vacante.setNombre("Ingeniero de Comunicaciones");
		vacante.setDescripcion("Se solicita ingeniero de soporte para intranet");
		vacante.setFecha(new Date());
		vacante.setSalario(9000.0);
		
		model.addAttribute("vacante",vacante);
		
		return "detalle";
	}
	
	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("Ingeniero de Sistemas");
		lista.add("Auxiliar de Contabilidad");
		lista.add("Vendedor");
		lista.add("Arquitecto");
		
		model.addAttribute("lista",lista);
		
		return "listado";
	}
	@GetMapping("/")
	public String mostrarHome(Model model) {
		// metodo para mostrar pagina inicial, aqui se agregan atributos que se pueden ocupar en el HTML
//		model.addAttribute("mensaje","Bienvenidos a Empleos Anima");
//		model.addAttribute("fecha",new Date()); 
		String nombre="Auxiliar de Contabilidad";
		Date fechaPub= new Date();
		double salario= 9000.0;
		boolean vigente= true;
		
		model.addAttribute("nombre",nombre);
		model.addAttribute("fechaPub",fechaPub);
		model.addAttribute("salario",salario);
		model.addAttribute("vigente",vigente);
		return "home";
	}
}
