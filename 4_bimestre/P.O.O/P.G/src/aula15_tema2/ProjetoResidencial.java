package aula15_tema2;

public class ProjetoResidencial extends Projeto{

    private double tamanhoDoTerreno;
    private Integer numeroDeBanheiros;
    private Integer numeroDeQuartos;

    public ProjetoResidencial(String nomeDoProjeto, String cidadeDoProjeto, Obra obra, double tamanhoDoTerreno, Integer numeroDeBanheiros, Integer numeroDeQuartos) {
        super(nomeDoProjeto, cidadeDoProjeto, obra);
        this.tamanhoDoTerreno = tamanhoDoTerreno;
        this.numeroDeBanheiros = numeroDeBanheiros;
        this.numeroDeQuartos = numeroDeQuartos;
    }


    public double getTamanhoDoTerreno() {
        return tamanhoDoTerreno;
    }

    public void setTamanhoDoTerreno(double tamanhoDoTerreno) {
        this.tamanhoDoTerreno = tamanhoDoTerreno;
    }

    public Integer getNumeroDeBanheiros() {
        return numeroDeBanheiros;
    }

    public void setNumeroDeBanheiros(Integer numeroDeBanheiros) {
        this.numeroDeBanheiros = numeroDeBanheiros;
    }

    public Integer getNumeroDeQuartos() {
        return numeroDeQuartos;
    }

    public void setNumeroDeQuartos(Integer numeroDeQuartos) {
        this.numeroDeQuartos = numeroDeQuartos;
    }


}
