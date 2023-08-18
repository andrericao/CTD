package teste.numerosLogger;

public class ExecucaoNumeros {
    public static void main(String[] args) {

        MediaMaxMin mediaMaxMin = new MediaMaxMin("lista1");

        ListaNumeros n1 = new ListaNumeros(141);
        ListaNumeros n2 = new ListaNumeros(32);
        ListaNumeros n3 = new ListaNumeros(55);
        ListaNumeros n4 = new ListaNumeros(17);
        ListaNumeros n5 = new ListaNumeros(803);
        ListaNumeros n6 = new ListaNumeros(169);

        mediaMaxMin.adicionarNumero(n1);
        mediaMaxMin.adicionarNumero(n2);
        mediaMaxMin.adicionarNumero(n3);
        mediaMaxMin.adicionarNumero(n4);
        mediaMaxMin.adicionarNumero(n5);
        mediaMaxMin.adicionarNumero(n6);

        mediaMaxMin.mostraNumeros();


    }
}