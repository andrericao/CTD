package br.digitalhouse.exercise.orm.service;

import java.util.List;
import java.util.Optional;

public interface IStudentService<T>{
    public List<T> findAllStudents();
    public Optional<T> findStudentById(Long id);
    public T addStudent(T t);
    public String deleteStudent(Long id);
    public String updateStudent(T t);
}
