package br.digutalhouse.dentist.controller;

import br.digutalhouse.dentist.domain.Dentist;
import br.digutalhouse.dentist.service.DentistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("dentists")
public class DentistController {

    private final DentistService dentistService;

    @Autowired
    public DentistController(DentistService dentistService){
        this.dentistService = dentistService;
    }

    @GetMapping
    public List<Dentist> getDentists(){
        return dentistService.dentistList();
    }
}
