package br.com.reformas.api.prestador;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestadorRepository extends JpaRepository<Prestador, Long>{

	Page<Prestador> findAllByAtivoTrue(Pageable paginacao);
	
}
