package br.com.dh.dentistas3.controller;

import br.com.dh.dentistas3.domain.Dentista;
import br.com.dh.dentistas3.service.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dentistas")
public class DentistaController {
    private final DentistaService dentistaService;

    @Autowired
    public DentistaController(DentistaService dentistaService){
        this.dentistaService = dentistaService;
    }

    @GetMapping
    public List<Dentista> getDentistas(){
        return dentistaService.listaDentistas();
    }
}
