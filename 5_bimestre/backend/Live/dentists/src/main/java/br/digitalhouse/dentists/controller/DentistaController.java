package br.digitalhouse.dentists.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("dentistas")
public class DentistaController {

    @PostMapping
    public void criarDentista() {
        log.info("Criando dentista");
    }

    @GetMapping("{id}")
    public void buscarDentistaPorId() {
        log.info("Chamando dentista por id");
    }

    @GetMapping
    public void buscarListaDeDentistas() {
        log.info("Chamando todos os dentistas");
    }

    public void atualizarDentista() {
        log.info("Atualizando dentista");
    }

    public void excluirDentista() {
        log.info("Excluindo dentista");
    }


}