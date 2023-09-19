package br.digitalhouse.exericio.cars.controller;

import br.digitalhouse.exericio.cars.model.Cars;
import br.digitalhouse.exericio.cars.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarsController {

    private final CarsService carsService;

    @Autowired
    public CarsController(CarsService carsService){
        this.carsService = carsService;
    }

    @GetMapping
    public List<Cars> getCars(){
        return carsService.carsList();
    }

}
