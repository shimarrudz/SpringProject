package br.com.reformas.api.prestador;

public record DadosListagemPrestador(
		Long id,
		String nome,
		String email,
		String cnpj,
		Especialidade especialidade
		) {
	
	public DadosListagemPrestador(Prestador prestador) {
		this(
				prestador.getId(),
				prestador.getNome(),
				prestador.getEmail(),
				prestador.getCnpj(),
				prestador.getEspecialidade()
				);
		
	}

}
