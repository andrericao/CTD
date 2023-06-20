package aula15_tema4;

public class Proprietario {
    private String nome;
    private String sobrenome;
    private String numeroCateiraDeTrabalho;

    public Proprietario(String nome, String sobrenome, String numeroCateiraDeTrabalho) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroCateiraDeTrabalho = numeroCateiraDeTrabalho;
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

    public String getNumeroCateiraDeTrabalho() {
        return numeroCateiraDeTrabalho;
    }

    public void setNumeroCateiraDeTrabalho(String numeroCateiraDeTrabalho) {
        this.numeroCateiraDeTrabalho = numeroCateiraDeTrabalho;
    }
}
