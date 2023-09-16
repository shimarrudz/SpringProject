package br.com.reformas.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
		@NotBlank
		String logradouro,
		@NotBlank
		String bairro,
		@NotBlank
		@Pattern(regexp = "//d{8}")
		String cep,
		@NotBlank
		String cidade,
		@NotBlank
		String uf,
		@NotBlank
		String numero,
		@NotBlank
		String complemento
		) {

}
