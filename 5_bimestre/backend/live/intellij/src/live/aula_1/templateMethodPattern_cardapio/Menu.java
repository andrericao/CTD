package live.aula_1.templateMethodPattern_cardapio;

public abstract class Menu {

    private float preco;
    private String descricao;

    public Menu(String descricao, float preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract float preparar();
}
