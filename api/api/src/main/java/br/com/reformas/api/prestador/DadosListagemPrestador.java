package br.com.reformas.api.prestador;

public record DadosListagemPrestador(
		String nome,
		String email,
		String cnpj,
		Especialidade especialidade
		) {
	
	public DadosListagemPrestador(Prestador prestador) {
		this(
				prestador.getNome(),
				prestador.getEmail(),
				prestador.getCnpj(),
				prestador.getEspecialidade()
				);
		
	}

}
