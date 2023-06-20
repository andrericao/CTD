package lampada;

public class Lampada {
    String modelo;
    int potencia;
    boolean ligada;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void mostrarEstado(){
        if(ligada){
            System.out.println("Lâmpada Ligada!");
        } else {
            System.out.println("Lâmpada desligada!");
        }
    }

    public void mudarEstado(){
        if(ligada){
            desligar();
        } else {
            ligar();
        }
    }
}
