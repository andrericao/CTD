package aula14Mesa09;

import java.util.ArrayList;
import java.util.Collections;

public class Porto {
    private String nome;

    private ArrayList <Containers> listaContainers = new ArrayList<>();


    public Porto(String nome) {
        this.nome = nome;
    }

    public void addContainer(Containers container) {
        listaContainers.add(container);
    }

    public void mostrarContainersPerigosos(){
        Collections.sort (listaContainers);
        System.out.println("A lista de containers perigosos é:");
        for (Containers container: listaContainers) {
            if (container.isMaterialPerigoso()){
                System.out.println("O container de id "+ container.getIdContainer()+ " contém material perigoso");
            }
        }

    }


    public int qtdContainersPerigososDesconhecidos(){
        int contador = 0;
        for (Containers container: listaContainers){
            if (container.isMaterialPerigoso() && (container.getPaisOrigem() == "Desconhecido")){
                contador ++;
            }
        }
        return contador;
    }
}
