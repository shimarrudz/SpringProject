package br.com.reformas.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.reformas.api.cliente.DadosCadastroCliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroCliente dados) {
		System.out.println(dados);
	}
}
