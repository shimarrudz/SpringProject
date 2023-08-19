package br.com.reformas.api.cliente;

import br.com.reformas.api.endereco.DadosEndereco;

public record DadosCadastroCliente(
		
		String nome,
		String email,
		String telefone,
		String cpf,
		DadosEndereco endereco
		) {

}

