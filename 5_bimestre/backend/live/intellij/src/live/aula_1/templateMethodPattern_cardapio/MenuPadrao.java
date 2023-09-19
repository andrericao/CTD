package live.aula_1.templateMethodPattern_cardapio;

public class MenuPadrao extends Menu{

    public MenuPadrao(String descricao, float preco) {
        super(descricao, preco);
    }

    @Override
    public float preparar() {
        System.out.println("Preparando menu padrão");
        return getPreco();
    }
}
