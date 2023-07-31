package live.aula_1.templateMethodPattern_cardapio;

public class MenuInfantil extends Menu {

    private String nomeBrinquedo;
    private float valorAgregado;


    public MenuInfantil(String descricao, float preco, String nomeBrinquedo, float valorAgregado) {
        super(descricao, preco);
        this.nomeBrinquedo = nomeBrinquedo;
        this.valorAgregado = valorAgregado;
    }

    public MenuInfantil(String descricao, float preco) {
        super(descricao, preco);
    }

    public String getNomeBrinquedo() {
        return nomeBrinquedo;
    }

    public void setNomeBrinquedo(String nomeBrinquedo) {
        this.nomeBrinquedo = nomeBrinquedo;
    }

    public float getValorAgregado() {
        return valorAgregado;
    }

    public void setValorAgregado(float valorAgregado) {
        this.valorAgregado = valorAgregado;
    }

    @Override
    public float preparar() {
        System.out.println("Preparando menu infantil: hamburguer + brinquedo");
        return getPreco() + valorAgregado;
    }
}
