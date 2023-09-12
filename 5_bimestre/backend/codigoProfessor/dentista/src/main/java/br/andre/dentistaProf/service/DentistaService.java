package br.andre.dentistaProf.service;

import br.andre.dentistaProf.model.Dentista;
import java.util.List;

public interface DentistaService {

    Dentista criarDentista(Dentista dentista);

    Dentista buscarDentistaPorId(Integer id);

    List<Dentista> buscarTodosOsDentistas();

    Dentista atualizarDentista(Dentista dentista);

    void excluirDentista(Integer id);

}
