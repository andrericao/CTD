package classeAbstrata;

public class Main {
    public static void main(String[] args) {
        Funcionario secretaria = new Secretaria("Nathalia", 123);
        secretaria.mostrarStatus();

        Funcionario gerente = new Gerente("Marco",  7611);
        gerente.mostrarStatus();
    }
}
