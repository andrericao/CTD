package br.digitalhouse.exercise.firstDto.domain.usecase.create;

import br.digitalhouse.exercise.firstDto.domain.entity.Pacient;

public interface CreateAndValidatePacientUseCase {
    Pacient execute(CreatePacientInput input);
}
