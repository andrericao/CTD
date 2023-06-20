package aula_14;

import java.util.ArrayList;
import java.util.Collections;

public class Equipe {

    private String nome;

    private ArrayList<Jogador> listaJogadores = new ArrayList<>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void addJogador(Jogador jogador){
        listaJogadores.add(jogador);
    }

    public void mostrarJogadoresTitulares(){
        Collections.sort(listaJogadores); // ordena a list em ordem crescente, caso decrescete seria .reverseorder()

        //Para cada jogador da listaJogadores ele adiciona na variável jogador
        for (Jogador jogador: listaJogadores ) {
            if (jogador.isTitular()){
                System.out.println("Nome: " + jogador.getNome() + " Número camisa: " +
                        jogador.getNumeroCamisa());
            }
        }
    }

    public int getQuantidadeJogadoresLesionados(){
        int contador = 0;
        for (Jogador jogador: listaJogadores) {
            if (jogador.isLesionado() && jogador.isTitular()){
                contador++;
            }
        }
        return contador;
    }
}
