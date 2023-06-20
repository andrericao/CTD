package aula15_tema5;

import java.util.ArrayList;

public class Policial {
    private String nome;
    private String sobrenome;
    private int codigo;
    private Arma arma;

    private ArrayList<Policial> listaDePoliciais= new ArrayList<>();

    public Policial(String nome, String sobrenome, int codigo, Arma arma) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigo = codigo;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
