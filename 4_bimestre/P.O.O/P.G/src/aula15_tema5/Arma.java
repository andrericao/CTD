package aula15_tema5;

import java.util.ArrayList;

public class Arma {
    private Integer quantidadeDeMunicao;
    private Integer alcanceEmMetros;
    private String marca;
    private double calibre;
    private String status;

    private ArrayList<Arma> listaDeArmas= new ArrayList<>();


    public Arma(Integer quantidadeDeMunicao, Integer alcanceEmMetros, String marca, double calibre, String status) {
        this.quantidadeDeMunicao = quantidadeDeMunicao;
        this.alcanceEmMetros = alcanceEmMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.status = status;
    }

    public String verificarCondicoes(){
        if (this.status.equalsIgnoreCase("EM USO") && this.calibre > 9.0){
            return ("Esta arma está em boas condições de uso.");
        } else{
            return "A arma não se encontra em boas condições de uso";
        }
    }

    public Integer getQuantidadeDeMunicao() {
        return quantidadeDeMunicao;
    }

    public void setQuantidadeDeMunicao(Integer quantidadeDeMunicao) {
        this.quantidadeDeMunicao = quantidadeDeMunicao;
    }

    public Integer getAlcanceEmMetros() {
        return alcanceEmMetros;
    }

    public void setAlcanceEmMetros(Integer alcanceEmMetros) {
        this.alcanceEmMetros = alcanceEmMetros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCalibre() {
        return calibre;
    }

    public void setCalibre(double calibre) {
        this.calibre = calibre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

