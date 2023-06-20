package galaxya;

import java.time.LocalDate;

public class Nave extends Objeto{
    private Double velocidade;
    private int vida;

    public Nave(String modelo, String tipoConexo, LocalDate dataFabricacao, int folhasDisponiveis, double porcentagemTinta, double velocidade, int vida) {
        super(modelo, tipoConexo, dataFabricacao, folhasDisponiveis, porcentagemTinta);
        this.velocidade = velocidade;
        this.vida = vida;
    }

    public Nave(int posx, double v, int i) {
        super(posx);
        this.velocidade = v;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

   /* @Override
    public String irA(int x, int y, char direcao) {
        return java.lang.String;
    }*/

    public void girar(char direcao){

    }

    public void restaVida(int valor){

    }

    @Override
    public String toString() {
        return "Nave{" +
                "velocidade=" + velocidade +
                ", vida=" + vida +
                ", posX=" + getPosx() +
                ", posY=" + getPosy() +
                ", direcao=" + getDirecao() +
                '}';
    }
}