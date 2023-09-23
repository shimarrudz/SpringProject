package br.com.reformas.api.prestador;

import br.com.reformas.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPrestador(
		@NotNull
		Long id,
		String nome,
		String telefone,
		Especialidade especialidade,
		DadosEndereco endereco
		) {

}
