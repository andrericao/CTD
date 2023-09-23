package br.digitalhouse.projetointegrador.dao;

import java.util.List;
import java.util.Optional;

public interface IDao<T> {
    T criar(T entidade);

    Optional<T> buscarPorId(Integer id);

    List<T> buscarTodos();

    T atualizar(T clinica);

    void excluir(Integer id);
}
