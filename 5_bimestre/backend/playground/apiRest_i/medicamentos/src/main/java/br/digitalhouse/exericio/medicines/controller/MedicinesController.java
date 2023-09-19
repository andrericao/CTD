package br.digitalhouse.exericio.medicines.controller;

import br.digitalhouse.exericio.medicines.service.MedicinesService;
import br.digitalhouse.exericio.medicines.dao.ConfigurationJDBC;
import br.digitalhouse.exericio.medicines.dao.Impl.MedicinesDaoImpl;
import br.digitalhouse.exericio.medicines.model.Medicines;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicines")
public class MedicinesController {
    private MedicinesService medicinesService =
            new MedicinesService(
                    new MedicinesDaoImpl(
                            new ConfigurationJDBC()));

    @PostMapping("/save")
    public Medicines save(@RequestBody Medicines medicines){
        return medicinesService.save(medicines);
    }

    @GetMapping("{id}")
    public Medicines fetchById(@PathVariable Integer id){
        return medicinesService.fetchById(id);
    }
}
