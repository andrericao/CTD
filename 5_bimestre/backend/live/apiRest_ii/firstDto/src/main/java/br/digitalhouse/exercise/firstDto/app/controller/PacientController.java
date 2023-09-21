package br.digitalhouse.exercise.firstDto.app.controller;

import br.digitalhouse.exercise.firstDto.app.model.PacientRequest;
import br.digitalhouse.exercise.firstDto.app.model.PacientResponse;
import br.digitalhouse.exercise.firstDto.app.presenter.PacientPresenter;
import br.digitalhouse.exercise.firstDto.domain.entity.Pacient;
import br.digitalhouse.exercise.firstDto.domain.usecase.create.CreateAndValidatePacientUseCase;
import br.digitalhouse.exercise.firstDto.domain.usecase.create.CreatePacientInput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PacientController {

    CreateAndValidatePacientUseCase useCase;
    PacientPresenter pacientPresenter;
    ResponseEntity<?> createPacient(PacientRequest request){
        CreatePacientInput input = null;
        Pacient pacient = useCase.execute(input);
        PacientResponse response = pacientPresenter.present(pacient);
        return ResponseEntity.ok().build();
    }
}
