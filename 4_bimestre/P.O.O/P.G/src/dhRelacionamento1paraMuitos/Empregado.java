package dhRelacionamento1paraMuitos;

import java.util.*;

public class Empregado implements Comparable<Empregado>{
    private String nome;
    private Date dataContratacao;
    private int idade;

   public int calcularTempoServ(){
        Date dataAtual = new Date();
        return dataAtual.getYear() - dataContratacao.getYear();
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    /*Utilizaremos a idade para ordenar*/
    @Override
    public int compareTo(Empregado e2) {

        return this.getIdade() - e2.getIdade();

    }
}