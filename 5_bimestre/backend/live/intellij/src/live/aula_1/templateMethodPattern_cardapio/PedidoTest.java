package live.aula_1.templateMethodPattern_cardapio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PedidoTest{

    @Test
    public void check(){
        Menu pedidoPadrao = new MenuPadrao("Big Mack", 27.50f);

        Menu pedidoInfantilComBrinquedo = new MenuInfantil("MiniBurguer", 16.50f, "Homem de Ferro", 190f);

        Menu pedidoHappyHour = new MenuHappyHour("Burguer e Gelo", 59.90f);

        List<Menu> menus = List.of(pedidoPadrao, pedidoInfantilComBrinquedo, pedidoHappyHour);
        Pedido pedido = new Pedido(menus);

        float resultado = pedido.calcularTotal();
        Assertions.assertEquals((27.50f + 16.50f + 190f + 59.90f), resultado);

        pedido.calcularTotal();

    }
}