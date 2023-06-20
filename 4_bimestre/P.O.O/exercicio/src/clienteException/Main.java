package clienteException;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Leila", "Sales", "12345", 5000000);

        System.out.println(cliente); //toString

        try {
            cliente.comprar(60000);
            cliente.pagarDivida(100);
        }catch (ClienteException e){
            System.err.println(e);
        }

    }
}