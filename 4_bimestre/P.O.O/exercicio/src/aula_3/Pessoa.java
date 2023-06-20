package aula_3;

import java.time.LocalDate;

/* Uma classe é um modelo ou molde ABSTRATO onde são programados um conjunto de objetos
 com características afins, que possuem atributos (características) e métodos
 (comportamentos) comuns.*/
public class Pessoa {

    /*atributos: características distintas de um objeto.
     Estrutura: modificador de acesso + tipo de dado + nome escolhido*/
    private String nome;
    private float altura;
    private Double peso;
    private LocalDate dataNascimento;
    private byte idade;
    private String nacionalidade;



    //Botão direito - generate - constructor - selecionar os campos - ok
    public Pessoa(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    // public Pessoa() { // exemplo de construtor vazio
    //}


    /*Método ou função: determina as ações ou responsabiliadades do objeto.
     Estrutura: modificador de acesso + tipo de retorno + nome escolhido: deve iniciar
     com um verbo*/

    //exemplo sem retorno
    public void andar(Double distancia){
        if(distancia <= 10){
            System.out.println("PODEMOS IR ANDANDO");
        }else{
            System.out.println("MUITO LONGE. VÁ DE CARRO");
        }
    }

    //EXEMPLO DE MÉTODO COM RETORNO
    public Double dormir(){
        return 12.0;
    }

    public Double dormir1(){
        double horaAcordar = 12D;
        return horaAcordar;
    }

    //get de carregar e set de modificar

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}