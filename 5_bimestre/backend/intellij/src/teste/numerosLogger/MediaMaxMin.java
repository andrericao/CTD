package teste.numerosLogger;

import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.Collections;

public class MediaMaxMin{
    private static final Logger log = Logger.getLogger(MediaMaxMin.class);
    private String nome;

    private ArrayList<ListaNumeros> listaNumero = new ArrayList<>();

    public MediaMaxMin(String nome) {
        this.nome = nome;
    }

    public void adicionarNumero(ListaNumeros numeros) {
        listaNumero.add(numeros);
    }


    public void mostraNumeros() {
        ListaNumeros menor = Collections.min(listaNumero);
        ListaNumeros maior = Collections.max(listaNumero);
        int tamanho = listaNumero.size();

        log.info("O menor número é " + menor + ", o maior número é " + maior + " e o tamanho da lista é de " + tamanho + " numeros");
    }
    /*public int calcularMedia(){
        int i;
        int soma = 0;
        for(i = 0; i < listaNumero.size(); i++) {
            soma += listaNumero.get(i);
        }
        int media = soma / listaNumero.size();
        return media;
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<ListaNumeros> getListaNumero() {
        return listaNumero;
    }

    public void setListaNumero(ArrayList<ListaNumeros> listaNumero) {
        this.listaNumero = listaNumero;
    }
}
