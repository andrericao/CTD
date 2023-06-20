package classeAbstrata;

public abstract class Funcionario {

    String nome;
    int codigo;

    public Funcionario(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public abstract void pagamento();

    public void mostrarStatus(){
    }
}
