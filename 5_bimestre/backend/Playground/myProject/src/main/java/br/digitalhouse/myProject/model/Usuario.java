package br.digitalhouse.myProject.model;

import lombok.Getter;
import lombok.Setter;

// ============ PRIMEIRA CLASSE CRIADA ============
@Getter
@Setter
public class Usuario {
    private String name;
    private int age;

    public Usuario(String name, int age){
        this.name = name;
        this.age =age;
    }
}
