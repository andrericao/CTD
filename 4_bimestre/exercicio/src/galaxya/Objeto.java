package galaxya;

import java.time.LocalDate;

public abstract class Objeto {
    private int posx;
    private int posy;
    private char direcao;

    public Objeto(int posx, int posy, char direcao) {
        this.posx = posx;
        this.posy = posy;
        this.direcao = direcao;
    }

    public Objeto(String modelo, String tipoConexo, LocalDate dataFabricacao, int folhasDisponiveis, double porcentagemTinta) {
    }

    // public abstract String irA();

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }


    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    //public String irA(int posx, int posy, char direcao) {
    //}
}