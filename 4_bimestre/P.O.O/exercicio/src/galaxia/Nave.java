package galaxia;

public class Nave extends Objeto{
    private double velocidade;
    private int vida;

    public Nave(int posX, int posY, char direcao, double velocidade, int vida) {
        super(posX, posY, direcao);
        this.velocidade = velocidade;
        this.vida = vida;
    }

    /*public Nave(double v, int i) {
        super();
    }*/

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

    /*@Override
    public String irA(int x, int y, char direcao) {
        return java.lang.String;
    }*/

    public void girar(char direcao){

    }

    public void restaVida(int valor){

    }

    @Override
    public String toString() {
        return  "dados da nave1 = velocidade: " + this.velocidade +
                ", vida: " + this.vida +
                ", posX: " + this.posX +
                ", posY: " + this.posY +
                ", direcao: " + this.direcao;
    }
}