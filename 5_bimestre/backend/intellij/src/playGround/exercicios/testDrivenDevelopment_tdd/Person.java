package playGround.exercicios.testDrivenDevelopment_tdd;

import java.time.LocalDate;
import java.util.Locale;

/*
Sugerimos que você desenvolva um pequeno aplicativo. Para isso,
devemos gerar a classe Person, que deve ter os atributos:
Nome, Sobrenome, E-mail e Idade. Os objetivos são criar:

1- Um método que exibe o nome completo da seguinte forma: Sobrenome, Nome.
2- Um método para calcular se a pessoa tem mais de 18 anos.
3- Um teste que atesta que o nome completo está correto.
4- Um teste que ateste que a pessoa realmente tem mais de 18 anos, lembre-se que a data de hoje que vamos usar nos testes tem que ser codificada, ou seja, adicionada manualmente com a data: 21/09/2021 . Devemos comparar com esta data nos testes. Por exemplo, alguém nascido em 20/01/2015 não tem mais de 18 anos.

GIVEN / WHEN / THEN
 */
public class Person {
    private String nome;
    private String sobrenome;
    private String email;
    private int idade;
    private LocalDate dataNascimento;

    public Person(String nome, String sobrenome, String email, int idade){
        this.nome = nome.toLowerCase(Locale.ROOT);
        this.sobrenome = sobrenome;
        this.email = email;
        this.idade = idade;
    }

    public Person(String nome, String sobrenome, String email, LocalDate dataNascimento){
        this.nome = nome.toLowerCase(Locale.ROOT);
        this.sobrenome = sobrenome;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void mostrarNomeCompleto(){
        String nomeCompleto = this.sobrenome + " " + this.nome;
        System.out.println(nomeCompleto);
    }

    public boolean conferirMaiorIdade(){

        LocalDate limiteAnoNascimento = LocalDate.now().minusYears(18);

        return limiteAnoNascimento.isAfter(dataNascimento);
    }

}
