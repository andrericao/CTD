package br.digitalhouse.exericio.medicines.dao;

public interface IDao <T>{
    public T save(T t);
    public T fetchById(Integer id);
}
