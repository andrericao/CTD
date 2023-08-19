package medicamentos_DAO.dao;

import java.util.List;

public interface IDao<E> {

    E buscarPorId(Integer is);
    E criar(E entidade);
    void exclui(Integer id);

    List<E> buscarTodos();
}
