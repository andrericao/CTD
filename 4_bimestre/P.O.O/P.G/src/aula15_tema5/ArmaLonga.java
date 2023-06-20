package aula15_tema5;

public class ArmaLonga extends Arma{
    private boolean possuiSeloRenar;
    private String descricao;
    private int nivelDaArma;

    public ArmaLonga(Integer quantidadeDeMunicao, Integer alcanceEmMetros, String marca, double calibre, String status, boolean possuiSeloRenar, String descricao, int nivelDaArma) {
        super(quantidadeDeMunicao, alcanceEmMetros, marca, calibre, status);
        this.possuiSeloRenar = possuiSeloRenar;
        this.descricao = descricao;
        this.nivelDaArma = nivelDaArma;
    }

    public boolean isPossuiSeloRenar() {
        return possuiSeloRenar;
    }

    public void setPossuiSeloRenar(boolean possuiSeloRenar) {
        this.possuiSeloRenar = possuiSeloRenar;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNivelDaArma() {
        return nivelDaArma;
    }

    public void setNivelDaArma(int nivelDaArma) {
        this.nivelDaArma = nivelDaArma;
    }

    public int compareTo(ArmaLonga o){
        int comparacao = Integer.compare(this.nivelDaArma, o.nivelDaArma);
        String armaUm = this.getMarca();
        String armaDois = o.getMarca();

        if (comparacao < 0) {
            return -1;
        } else if (comparacao > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public String comparandoArmas(ArmaLonga o){
        int resultadoComparacao = compareTo((o));
        String armaUm = this.getMarca();
        String armaDois = o.getMarca();

        if (resultadoComparacao < 0) {
            return "A arma" + " " + armaUm + " é de nível menor que " + armaDois;
        } else if (resultadoComparacao > 0) {
            return "A arma" + " " + armaUm + " é de nível maior que a do " + armaDois;
        } else {
            return armaUm + " tem nível igual ao de " + armaDois;
        }
    }


}
