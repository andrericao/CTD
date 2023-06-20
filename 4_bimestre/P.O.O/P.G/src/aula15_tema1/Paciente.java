package aula15_tema1;

import java.time.LocalDate;

public class Paciente {

    private LocalDate dataNascimento;
    private String nome;
    private String sobrenome;
    private boolean primeiraConsulta;

    /*
     * Construtor
     * */
    public Paciente(LocalDate dataNascimento, String nome, String sobrenome, boolean primeiraConsulta) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.primeiraConsulta = primeiraConsulta;
    }

    /*
     * Getters and Setters
     * */

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public boolean isPrimeiraConsulta() {
        return primeiraConsulta;
    }

    public void setPrimeiraConsulta(boolean primeiraConsulta) {
        this.primeiraConsulta = primeiraConsulta;
    }

}
