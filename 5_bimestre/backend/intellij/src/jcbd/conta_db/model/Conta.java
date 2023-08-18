package jcbd.conta_db.model;

public class Conta {
    private String id;
    private String nome;
    private String numeroConta; //Tem espaços ou traços - 0000-0000-0000-0000
    private int saldo;

    public Conta(String id,
                 String nome,
                 String numeroConta,
                 int saldo) {
        this.id = id;
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
