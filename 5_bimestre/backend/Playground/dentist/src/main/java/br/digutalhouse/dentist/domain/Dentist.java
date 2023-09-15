package br.digutalhouse.dentist.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dentist {
    private String name;

    public Dentist(String name){
        this.name = name;
    }
}
