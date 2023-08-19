package br.com.reformas.api.prestador;

import br.com.reformas.api.endereco.DadosEndereco;

public record DadosCadastroPrestador(
		String nome,
		String email,
		String telefone,
		String cnpj,
		Especialidade especialidade,
		DadosEndereco endereco
		
		) {

}
