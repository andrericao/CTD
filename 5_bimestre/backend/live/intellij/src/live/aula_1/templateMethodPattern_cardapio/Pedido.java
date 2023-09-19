package live.aula_1.templateMethodPattern_cardapio;

import java.util.List;

public class Pedido {
    List<Menu> menus;

    public Pedido(List<Menu> menus) {
        this.menus = menus;
    }

    public float calcularTotal(){
        float resultado = 0;
        for(Menu menu: this.menus){

            if (menu instanceof MenuPadrao){
                System.out.println("Menu padrão selecionado, será adicionado a compra co seguinte valor: " + menu.preparar());
            }
            if (menu instanceof MenuHappyHour){
                MenuHappyHour happyHour = (MenuHappyHour) menu; // casting
                System.out.println("Menu Happy Hour selecionado!");
                System.out.println("Hoje é: " + happyHour.diaDaSemana());
                System.out.println("O Menu Happy Hour selecionado, será adicionado a compra com seguinte valor: " + menu.getPreco());
            }
            if (menu instanceof MenuInfantil menuInfantil){
                menuInfantil.getNomeBrinquedo();
                System.out.println("Menu Infantilselecionado!");
                System.out.println("Nome do brinuqedo adquirido: " + menuInfantil.getNomeBrinquedo());
                System.out.println("Preço unitário do brinquedo: " + menuInfantil.getValorAgregado());
                System.out.println("Será adicionado a compra o seguinte valor: " + menu.preparar());
            }
            System.out.println("======================================================");
            resultado += menu.preparar();
            System.out.println("======================================================");
        }
        return resultado;
    }
}
