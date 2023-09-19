package br.digitalhouse.exericio.medicines.dao;

public interface IDao <T>{
    public T save(T t);
    public T fetchById(Integer id);
    public T update(T t);
    public void delete(Integer id);
}
