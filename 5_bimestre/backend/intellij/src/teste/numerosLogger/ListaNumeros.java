package teste.numerosLogger;

public class ListaNumeros implements Comparable<ListaNumeros> {
    private int numero;

    public ListaNumeros(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(ListaNumeros n) {
        if (this.numero == n.numero) {
            return 0;
        } else if (this.numero > n.numero) {
            return 1;
        } else {
            return -1;
        }
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
