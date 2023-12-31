package br.com.reformas.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.reformas.api.prestador.DadosAtualizacaoPrestador;
import br.com.reformas.api.prestador.DadosCadastroPrestador;
import br.com.reformas.api.prestador.DadosListagemPrestador;
import br.com.reformas.api.prestador.Prestador;
import br.com.reformas.api.prestador.PrestadorRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/prestadores")
public class PrestadorController {
	
	@Autowired
	private PrestadorRepository repository;
	
	@PostMapping
	public void cadastrar(@RequestBody @Valid DadosCadastroPrestador dados) {
		repository.save(new Prestador(dados));
	
	}
	
	@GetMapping
	public Page<DadosListagemPrestador> listar(
		@PageableDefault(size=5, sort= {"nome"}) Pageable paginacao){
		return repository.findAll(paginacao).map(DadosListagemPrestador::new);
	}
	
	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizacaoPrestador dados) {
		Prestador prestador = new Prestador();
		prestador = repository.getReferenceById(dados.id());
		prestador.atualizarInformacoes(dados);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public void excluir(@PathVariable Long id) {
		Prestador prestador = new Prestador();
		prestador = repository.getReferenceById(id);
		prestador.excluir();
	}

}
