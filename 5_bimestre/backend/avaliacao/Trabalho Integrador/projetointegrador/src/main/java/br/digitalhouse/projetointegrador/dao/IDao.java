package br.digitalhouse.projetointegrador.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IDao<T> {
    T criar(T entidade);

    Optional<T> buscarPorId(UUID id);

    List<T> buscarTodos();

    T atualizar(T clinica);

    void excluir(UUID id);
}
