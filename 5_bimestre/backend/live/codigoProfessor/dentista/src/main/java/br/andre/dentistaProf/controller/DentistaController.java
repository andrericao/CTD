package br.andre.dentistaProf.controller;

import br.andre.dentistaProf.service.DentistaService;
import br.andre.dentistaProf.model.Dentista;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("dentistas")
public class DentistaController {
    private DentistaService dentistaService;

    @Autowired
    public DentistaController(DentistaService dentistaService) {
        this.dentistaService = dentistaService;
    }

    @PostMapping
    public Dentista criarDentista(@RequestBody Dentista dentista) {
        log.info("chamando criar dentista");
        return dentistaService.criarDentista(dentista);
    }

    @GetMapping("{id}")
    public Dentista buscarDentistaPorId(@PathVariable Integer id) {
        log.info("chamando buscar dentista por id: " + id);
        return dentistaService.buscarDentistaPorId(id);
    }

    @GetMapping
    public List<Dentista> buscarListaDeDentistas() {
        log.info("Chamando dentistas");
        return dentistaService.buscarTodosOsDentistas();
    }

    @PutMapping("{id}")
    public Dentista atualizarDentista(@PathVariable Integer id, @RequestBody Dentista dentista) {
        log.info("Chamando atualizar dentista");
        dentista.setId(id);
        return dentistaService.atualizarDentista(dentista);
    }

    @DeleteMapping("{id}")
    public void excluirDentista(@PathVariable Integer id) {
        log.info("chamando excluir dentista");
        dentistaService.excluirDentista(id);
    }


}