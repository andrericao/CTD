package com.aulasdepoo.aula7e8.exemplosrelacionamentos;

public class Carro {

    private int velicidadeMaxima;
    private String marca;
    private Motor motor; // 1 p 1 - cria o relacionamento com a classe Motor, nesse caso 1 pra 1
    private Roda[] rodas;  // 1 p n - cria o relacionamento com a classe Roda, nese caso 1 (carro) pra muitas Rodas

    public Carro(int velicidadeMaxima, String marca) {
        this.velicidadeMaxima = velicidadeMaxima;
        this.marca = marca;
        Motor motor = new Motor();
    }

    public void teste(Motor motor){
        System.out.println("atividade do metodo");

    }

    public Motor teste1(Roda[] qtdRodas){
        Motor motor = new Motor();
        System.out.println("atividade do metodo");
        return motor;
    }

}