package com.bolsadeideas.springboot.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bolsadeideas.springboot.app.models.entity.Cliente;
import com.bolsadeideas.springboot.app.models.entity.Factura;
import com.bolsadeideas.springboot.app.models.service.IClienteService;

@Controller
@RequestMapping("/factura")
@SessionAttributes(names = "factura")
public class FacturaController {
	
	@Autowired
	private IClienteService clienteService;
	
	@RequestMapping("/form/{clienteId}")
	public String crear(@PathVariable(value = "clienteId") Long clienteId, Map<String, Object> model, RedirectAttributes flash) {
		
		Cliente cliente = clienteService.findOne(clienteId);
		
		if(cliente == null) {
			flash.addFlashAttribute("error", "Cliente no encontrado en la BD");
			
			return "redirect:/listar";
		}
		//Creando Factura
		Factura factura = new Factura();
		//Asociando Factura con el cliente
		factura.setCliente(cliente);
		
		model.put("factura", factura);
		model.put("titulo", "Creando Factura");
		
		return "factura/form";
	}
}
