package br.digitalhouse.exericio.cars.service.impl;

import br.digitalhouse.exericio.cars.model.Cars;
import br.digitalhouse.exericio.cars.service.CarsService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarsServiceImpl implements CarsService {
    @Override
    public List<Cars> carsList(){
        return Arrays.asList(new Cars("Fiat", "Branco"), new Cars("Ferrari", "Vermelha"));
    }
}
