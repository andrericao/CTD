package aula15_tema2;

public class ProjetoDepartamental extends Projeto{
    private Integer numeroDeAndares;
    private Integer apartamentoPorAndar;

    protected Integer numeroDeApartamentos;

    public ProjetoDepartamental(String nomeDoProjeto, String cidadeDoProjeto, Obra obra, Integer numeroDeAndares, Integer apartamentoPorAndar) {
        super(nomeDoProjeto, cidadeDoProjeto, obra);
        this.numeroDeAndares = numeroDeAndares;
        this.apartamentoPorAndar = apartamentoPorAndar;
        this.numeroDeApartamentos = calcularNumeroDeApartamentos();
    }

    private int calcularNumeroDeApartamentos(){
        return numeroDeAndares * apartamentoPorAndar;
    }

    public Integer getNumeroDeAndares() {
        return numeroDeAndares;
    }

    public void setNumeroDeAndares(Integer numeroDeAndares) {
        this.numeroDeAndares = numeroDeAndares;
    }

    public Integer getNumeroDeApartamentos() {
        return apartamentoPorAndar;
    }

    public void setNumeroDeApartamentos(Integer numeroDeApartamentos) {
        this.apartamentoPorAndar = numeroDeApartamentos;
    }

    public String verificarTipoDePredio(){
        if (this.numeroDeAndares > 15){
            return this.getNomeDoProjeto() + " é um arranha-céu.";
        } else {
            return this.getNomeDoProjeto() + "não é um arranha-céu.";
        }
    }

    public int compareTo(ProjetoDepartamental o){
        int comparacao = Integer.compare(this.numeroDeApartamentos, o.numeroDeApartamentos);
        String departamentoUm = this.getNomeDoProjeto();
        String departamentoDois = o.getNomeDoProjeto();

        if (comparacao < 0) {
            return -1;
        } else if (comparacao > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public String comparandoDepartamentos(ProjetoDepartamental o){
        int resultadoComparacao = compareTo((o));
        String departamentoUm = this.getNomeDoProjeto();
        String departamentoDois = o.getNomeDoProjeto();

        if (resultadoComparacao < 0) {
            return "A capacidade de carga de" + " " + departamentoUm + " é menor que a do " + departamentoDois;
        } else if (resultadoComparacao > 0) {
            return "A capacidade de carga de" + " " + departamentoUm + " é maior que a do " + departamentoDois;
        } else {
            return departamentoUm + " tem capacidade igual ao de " + departamentoDois;
        }

    }

}

