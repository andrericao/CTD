package clienteException;

public class ClienteOriginal {

    private String nome;
    private String sobrenome;
    private String rg;
    private double saldoEmConta;
    private double limite;

    public ClienteOriginal(String nome, String sobrenome, String rg, double limite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.limite= limite;
        saldoEmConta=0;

    }
    public void comprar(double valor) {
        saldoEmConta+=valor;
    }
    public void pagarDivida(double valor) {
        saldoEmConta-=valor;
    }

    /*O método toString retorna uma representação string de um objeto. Na classe Object,
    este método está escrito de maneira a retornar o nome da classe da qual o objeto é
    instância, o sinal de arroba “@”, e a representação hexadecimal do código hash (
     uma sequência de bits que tem como objetivo identificar um arquivo) do objeto.*/
    @Override
    public String toString() {
        return "Cliente{" +
                nome + ' ' +
                sobrenome + ' ' +
                ", seu saldo é=" + saldoEmConta + "R$ }";
    }
}
