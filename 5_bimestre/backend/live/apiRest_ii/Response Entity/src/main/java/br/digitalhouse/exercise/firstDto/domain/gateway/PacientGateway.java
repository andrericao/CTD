package br.digitalhouse.exercise.firstDto.domain.gateway;

import br.digitalhouse.exercise.firstDto.domain.entity.Pacient;

import java.util.Optional;
import java.util.UUID;

public interface PacientGateway {
    Optional<Pacient> fetchById(UUID id);
    Pacient save(Pacient pacient);

    void delete(UUID id);
}
