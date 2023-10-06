package br.com.digitalhouse.projetointegrador.domain.entity;

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
