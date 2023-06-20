package aula15_tema1;

import java.time.LocalDate;

public class PacienteParticular extends Paciente {
    private String numeroRg;
    private double valorConsulta;
    /*
     * Construtor
     * */

    public PacienteParticular(LocalDate dataNascimento, String nome, String sobrenome, boolean primeiraConsulta, String numeroRg) {
        super(dataNascimento, nome, sobrenome, primeiraConsulta);
        this.numeroRg = numeroRg;
        valorConsulta = 100.00;
    }

    /*
     * Getters and Setters
     * */

    public String getNumeroRg() {
        return numeroRg;
    }

    public void setNumeroRg(String numeroRg) {
        this.numeroRg = numeroRg;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    /*
     * Métodos da Classe
     * */

    public String exibirValorConsulta(String especialidade){
        return "O valor da consulta da " + especialidade + " é: " + this.getValorConsulta();
    }

}
