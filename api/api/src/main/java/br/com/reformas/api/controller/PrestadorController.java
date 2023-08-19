package br.com.reformas.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.reformas.api.prestador.DadosCadastroPrestador;

@RestController
@RequestMapping("/prestadores")
public class PrestadorController {
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroPrestador dados) {
		System.out.println(dados);
	}

}
