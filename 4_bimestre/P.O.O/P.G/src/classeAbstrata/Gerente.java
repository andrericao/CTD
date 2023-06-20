package classeAbstrata;

public class Gerente extends Funcionario {

    public Gerente(String nome, int codigo) {
        super(nome, codigo);
    }

    @Override
    public void pagamento() {
        System.out.println("Recebe salário de Gerente");
    }

    @Override
    public void mostrarStatus() {
        System.out.println("Gerente " + this.nome + ", código: " + this.codigo);
        pagamento();
    }
}
