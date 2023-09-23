package br.com.reformas.api.prestador;

import br.com.reformas.api.endereco.Endereco;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "prestadores")
@Entity(name = "Prestador")
public class Prestador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private String cnpj;
	private Boolean ativo;
	
	@Enumerated(EnumType.STRING)
	private Especialidade especialidade;
	
	@Embedded()
	private Endereco endereco;
	
	public Prestador() {
	}
	
	public Prestador(DadosCadastroPrestador dados) {
		this.ativo = true;
		this.nome = dados.nome();
		this.email = dados.email();
		this.telefone = dados.telefone();
		this.cnpj = dados.cnpj();
		this.especialidade = dados.especialidade();
		this.endereco = new Endereco(dados.endereco());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	
	public void atualizarInformacoes(DadosAtualizacaoPrestador dados) {
		if (dados.nome() != null) {
			this.nome = dados.nome();
		}
		if (dados.telefone() != null) {
			this.telefone = dados.telefone();
		}
		if (dados.especialidade() != null) {
			this.especialidade = dados.especialidade();
		}
		if (dados.endereco() != null) {
			this.endereco.atualizarInformacoes(dados.endereco());
		}
	}
	
	public void excluir() {
		this.ativo = false;
	}
		
}
