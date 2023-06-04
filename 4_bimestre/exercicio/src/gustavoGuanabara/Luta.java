package gustavoGuanabara;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    // Métodos Públicos

    public void marcarLuta(Lutador lutador1, Lutador  lutador2) {
        if(lutador1.getCategoria() == lutador2.getCategoria() && lutador1 != lutador2 ) {
            this.aprovado = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }

    public void lutar() {
        if(this.aprovado == true ){

            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 1, 2, 3

            switch(vencedor) {

                case 0:
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1:
                    System.out.println(this.desafiado + "venceu a luta!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2:
                    System.out.println(this.desafiante + "venceu a luta!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }

        } else {
            System.out.println("Luta não pode acontecer!");
        }
    }


    // Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}