package br.digitalhouse.projetointegrador.clinica.domain.entity;

import lombok.Getter;

@Getter
public enum SexoEnum {
    M ("Masculino"), F ("Feminino");
    private String generoNome;

    SexoEnum(String generoNome) {
        this.generoNome = generoNome;
    }

    public String getGeneroNome() {
        return generoNome;
    }
}
