package br.digitalhouse.projetointegrador.controller;

import br.digitalhouse.projetointegrador.model.Clinica;
import br.digitalhouse.projetointegrador.service.ClinicaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping
public class ClinicaController {
    private ClinicaService clinicaService;

    @Autowired
    public ClinicaController(ClinicaService clinicaService) {
        this.clinicaService = clinicaService;
    }

    @PostMapping
    public Clinica criarClinica(@RequestBody Clinica clinica) {
        return clinicaService.criarClinica(clinica);
    }

    @GetMapping("{id}")
    public Clinica buscarClinicaPorId(@PathVariable Integer id) {
        return clinicaService.buscarClinicaPorId(id);
    }

    @GetMapping
    public List<Clinica> buscarsListaClinica() {
        return clinicaService.buscarTodasClinicas();
    }

    @PutMapping
    public Clinica atualizarClinica(@PathVariable Integer id, @RequestBody Clinica clinica){
        clinica.setId(id);
        return clinicaService.atualizarClinica(clinica);
    }

    @DeleteMapping("{id}")
    public void excluirClinica(@PathVariable Integer id) {
        clinicaService.excluirClinica(id);
    }
}
