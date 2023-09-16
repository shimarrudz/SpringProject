package br.com.reformas.api.prestador;

import br.com.reformas.api.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPrestador(
		@NotBlank
		String nome,
		@NotBlank
		@Email
		String email,
		@NotBlank
		@Pattern(regexp = "\\d{10,11}")
		String telefone,
		@NotBlank
		@Pattern(regexp = "\\d{8,9\\/\\d{4}\\-\\d{2}")
		String cnpj,
		@NotNull
		@Valid
		Especialidade especialidade,
		DadosEndereco endereco
		
		) {

}
