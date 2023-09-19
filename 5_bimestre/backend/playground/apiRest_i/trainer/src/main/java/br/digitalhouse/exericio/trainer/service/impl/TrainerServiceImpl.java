package br.digitalhouse.exericio.trainer.service.impl;

import br.digitalhouse.exericio.trainer.domain.Trainer;
import br.digitalhouse.exericio.trainer.service.TrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {

    @Override
    public List<Trainer> trainerList(){
        return Arrays.asList(new Trainer("Marcos"), new Trainer("Ana"));
    }
}
