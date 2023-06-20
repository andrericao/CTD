package aula_10;

//classe Empregado herda da classe Pessoa pelo extends. É uma classe filha, onde fica a especialização.
//Observe que a classe vazia já da erro e pede pra implementar um construtor com o super
public class Empregado extends Pessoa{

    private Double salario;
    private Double descontos;
    private String arquivo;

    //construtor

    public Empregado(String nome, String cpf, Double salario, Double descontos, String arquivo) {
        super(nome, cpf); //super é responsavel por invocar o Contrutor da classe pessoa
        this.salario = salario;
        this.descontos = descontos;
        this.arquivo = arquivo;
    }


    /* SOBRESCRITA:	A anotação "@Override" pede ao compilador para verificar se estamos realmente redefinindo um método da
    superclasse. A sobrescrita de métodos seria criar um novo método na classe filha contendo a mesma assinatura
    e mesmo tipo de retorno do método sobrescrito. (Override).
    Portanto, a sobrescrita de métodos é quando estamos trabalhando com orientação a objetos e temos uma classe
    (filha) que acaba herdando de uma outra classe (mãe ou pai). Caso a classe filha precise modificar algum
    comportamento herdado da classe mãe, podemos fazer uma sobrescrita do método diretamente da classe filha.
    Lembrando que quando realizamos a sobrescrita do método, deve ser a mesma assinatura do método original,
    ou seja, mesmo tipo de retorno, nome, quantidade de parâmetros e etc.	*/

    @Override
    public void calcularImc(Double valorImc) {
        System.out.println(getNome() + " seu IMC é:  " + peso/(altura * altura) + ". Preste atenção que o valor máximo seria  " + valorImc);
    }



    //SOBRECARGA: A sobrecarga permite métodos de mesmo nome, mas com suas assinaturas diferentes, ou seja, quantidade
    //     diferente de parametros*/

    public Double calcularSalario(Double valorHora, Double quantidadeHoras){
        return valorHora * quantidadeHoras;
    }


    public Double calcularSalario(Double valorHora){
        return valorHora * 40;
    }


    //get e set

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getDescontos() {
        return descontos;
    }

    public void setDescontos(Double descontos) {
        this.descontos = descontos;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
}