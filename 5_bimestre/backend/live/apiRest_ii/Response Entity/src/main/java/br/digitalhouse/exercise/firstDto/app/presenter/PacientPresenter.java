package br.digitalhouse.exercise.firstDto.app.presenter;

import br.digitalhouse.exercise.firstDto.app.model.PacientResponse;
import br.digitalhouse.exercise.firstDto.domain.entity.Pacient;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PacientPresenter {

    private ObjectMapper mapper;
    public PacientResponse present(Pacient pacient){
     return mapper.convertValue(pacient, PacientResponse.class);
    }
}
