package br.com.digitalhouse.projetointegrador.domain.repository;

import br.com.digitalhouse.projetointegrador.domain.entity.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, UUID> {
}
