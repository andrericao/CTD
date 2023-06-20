package classeAbstrata;

public class Vendedor extends Funcionario{

    public Vendedor(String nome, int codigo) {
        super(nome, codigo);
    }

    @Override
    public void pagamento() {
        System.out.println("Recebe salário de Vendedor");
    }
}
