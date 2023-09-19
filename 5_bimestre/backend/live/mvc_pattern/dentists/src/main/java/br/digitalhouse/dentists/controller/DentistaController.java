package br.digitalhouse.dentists.controller;

import br.digitalhouse.dentists.model.Dentista;
import br.digitalhouse.dentists.service.DentistaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("dentistas")
public class DentistaController {

    private DentistaService dentistaService;
    //O Controller instacia um SERVICO pq ele verifica o que é pedido
    //pela view e seleciona o serço adequado

    @Autowired
    public DentistaController(DentistaService dentistaService) {
        this.dentistaService = dentistaService;
    }


    //@RequestBody é necessário quando há o envio de dados
    // Neste caso há envio do objeto DENTISTA como payload
    @PostMapping
    public Dentista criarDentista(@RequestBody Dentista dentista ) {
        log.info("Criando dentista");
        return dentistaService.criarDentista(dentista);
    }

    //@PathVariable acontece quando há o necessidade de achar objeto por id e dado específico deste
    @GetMapping("{id}")
    public Dentista buscarDentistaPorId(@PathVariable Integer id) {
        log.info("Chamando dentista por id: " + id);
        return dentistaService.buscarDentistaPorId(id);
    }

    @GetMapping
    public List<Dentista> buscarListaDeDentistas() {
        log.info("Chamando todos os dentistas");
        return dentistaService.buscarTodosOsDentistas();
    }

    //@RequestBody é necessário quando há o envio de dados
    // Neste caso há envio do objeto DENTISTA como payload para atualização dos dados
    @PutMapping("{id}")
    public Dentista atualizarDentista(@PathVariable Integer id, @RequestBody Dentista dentista) {
        log.info("Buscando dentista por id: " + id);
        dentista.setId(id);

        log.info("Agora que achou está atualizando dentista: " +
         id);
        return dentistaService.atualizarDentista(dentista);
    }

    @DeleteMapping("{id}")
    public void excluirDentista(@PathVariable Integer id) {
        log.info("Excluindo dentista");
        dentistaService.excluirDentista(id);
    }


}