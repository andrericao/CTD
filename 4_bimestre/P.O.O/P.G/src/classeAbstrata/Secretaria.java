package classeAbstrata;

public class Secretaria extends Funcionario {
    public Secretaria(String nome, int codigo) {
        super(nome, codigo);
    }

    @Override
    public void pagamento() {
        System.out.println("Recebe salário de Secretária");
    }

    @Override
    public void mostrarStatus() {
        System.out.println("Secretária " + this.nome + ", código: " + this.codigo);
        pagamento();
    }

}
