package br.com.reformas.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.reformas.api.prestador.DadosCadastroPrestador;
import br.com.reformas.api.prestador.Prestador;
import br.com.reformas.api.prestador.PrestadorRepository;

@RestController
@RequestMapping("/prestadores")
public class PrestadorController {
	
	@Autowired
	private PrestadorRepository repository;
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroPrestador dados) {
		repository.save(new Prestador(dados));
	
	}

}
