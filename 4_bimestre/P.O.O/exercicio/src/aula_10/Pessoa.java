package aula_10;

/* Herança: é uma ordenação entre classes, relacionamento do tipo É UM. Na herança define-se carcterísticas e ações
 comuns em classes mais gerais e adiciona-se características e ações em classes mais especificas.

 OBS: 	Herança multipla: uma classe herda de várias outras classes, nesse caso o filho herda carcateristicas de
 diferentes pais. O uso de herança multipla requer cuidado em relação a sobrepopsição de atributos e
 responsabilidade. NÃO É PERMITIDA EM JAVA, não é uma boa prática. */


import java.time.LocalDate;

//Generalização : essa é a classe pai, onde ficaram os atributos e métodos comuns a tods os filhos
public class Pessoa {

    private String nome;
    protected String cpf; // protected permite acesso dos filhos sem get e set

    protected Double altura;
    protected Double peso;


    //construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //métodos
    public void calcularImc(Double valorImc){
        System.out.println(nome + " seu IMC é:  " + valorImc );
    }

    public int  calcularIdade (LocalDate dataNascimento){
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }


    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}