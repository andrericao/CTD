package br.com.digitalhouse.clinica.domain.entity;

public enum GeneroEnum {
    M("Masculino"),
    F("Feminino");

    private final String ;

    public GeneroEnum(String nome) {
        this.nome = nome;
    }
}
