package br.digitalhouse.testehibernate.service;

import br.digitalhouse.testehibernate.repository.StudentRepository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
}
