package aula15_tema3;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String rg;
    private int idade;

    private ArrayList<Pessoa> listaDePessoas= new ArrayList<>();
    public Pessoa(String nome, String sobrenome, String rg, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.idade = idade;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
