package clienteException;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String rg;
    private double saldoEmConta;
    private double limite;
    private double divida;

    public Cliente(String nome, String sobrenome, String rg, double limite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.limite = limite;
        this.divida = 0;
        saldoEmConta = 0;

    }
    public void comprar(double valor) throws ClienteException {
        if ((saldoEmConta + limite) < valor){
            /*new foi utilizado, visto que a exceção é um novo objeto que deve ser criado
             na memória. Isso se faz necessário para que a exceção possa ser lançada por
             toda a pilha de execução até que seja devidamente tratada ou acarrete no
             término da aplicação.*/
            throw new ClienteException("Saldo insuficiente!!");
        }else{
            saldoEmConta-=valor;
        }
    }

    public void pagarDivida(double valor) throws ClienteException {
        if(divida <= 0){
            throw new ClienteException("Você não tem divida!!");
        }else {
            divida-=valor;
        }


    }

    /*O método toString retorna uma representação string de um objeto. Na classe Object,
    este método está escrito de maneira a retornar o nome da classe da qual o objeto é
    instância, o sinal de arroba “@”, e a representação hexadecimal do código hash (
     uma sequência de bits que tem como objetivo identificar um arquivo) do objeto.*/
    /*@Override
    public String toString() {
        return "Cliente{" +
                nome + ' ' +
                sobrenome + ' ' +
                ", seu saldo é=" + saldoEmConta + "R$ }";
    }*/


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

    public double getSaldoEmConta() {
        return saldoEmConta;
    }

    public void setSaldoEmConta(double saldoEmConta) {
        this.saldoEmConta = saldoEmConta;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }
}
