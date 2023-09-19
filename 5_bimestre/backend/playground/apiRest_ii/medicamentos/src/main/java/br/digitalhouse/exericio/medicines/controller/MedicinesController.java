package br.digitalhouse.exericio.medicines.controller;

import br.digitalhouse.exericio.medicines.service.MedicinesService;
import br.digitalhouse.exericio.medicines.dao.ConfigurationJDBC;
import br.digitalhouse.exericio.medicines.dao.Impl.MedicinesDaoImpl;
import br.digitalhouse.exericio.medicines.model.Medicines;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PutMapping("/update")
    public ResponseEntity<Medicines> update(@RequestBody Medicines medicines){
        ResponseEntity responseEntity = null;

        if(medicinesService.fetchById(medicines.getId()) == null){
            responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        } else {
            responseEntity = new ResponseEntity(medicinesService.update(medicines), HttpStatus.OK);
        }
        return responseEntity;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        ResponseEntity responseEntity = null;

        if(medicinesService.fetchById(id) == null){
            responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        } else {
            medicinesService.delete(id);
            responseEntity = new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return responseEntity;
    }
}
