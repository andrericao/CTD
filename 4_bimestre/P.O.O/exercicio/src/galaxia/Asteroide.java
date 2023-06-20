package galaxia;

public class Asteroide extends Objeto {

    private int dano;

    public Asteroide(int posx, int posy, char direcao, int dano) {
        super(posx, posy, direcao);
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    /*@Override
    public String irA(int x, int y, char direcao) {
        System.out.println(getPosx());
        return null;
    }*/
}
  /*  @Override
    public String imprimir() {
        if (temPapel() && !precisaTinta()){
            folhasDisponiveis--;
            setPorcentagemTinta(getPorcentagemTinta() - 0.01);
            return "Imprimindo!!";
        }else if (temPapel() && precisaTinta()){
            return "Você precisa adicionar tinta!";
        }else if (!temPapel() && precisaTinta()){
            return "Você precisa de tinta e de papel!";
        }else {
            return "Você precisa de  papel!";
        }
    }*/