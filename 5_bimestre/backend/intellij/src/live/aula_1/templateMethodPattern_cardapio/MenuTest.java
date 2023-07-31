package live.aula_1.templateMethodPattern_cardapio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

class MenuTest {

    @Test
    public void calcularPrecoPedidoPadrao(){

        // GIVEN
        float totalASerPago = 0;
        Menu padrao = new MenuPadrao("Hamburguer", 27.50f);
        Menu infantil = new MenuInfantil("Mini-Burguer", 16.50f);
        Menu happyHour = new MenuHappyHour("Rodízio Hamburguer", 59.90f);

        // WHEN
        totalASerPago += padrao.preparar();       // pegar produto e devolver valor
        totalASerPago += infantil.preparar();     //
        totalASerPago += happyHour.preparar();   //

        // THEN
        Assertions.assertEquals(totalASerPago, 103.90f);
    }

    @Test
    public void calcularPrecoPedidoInfatilComBrinquedo(){

        // GIVEN
        float totalASerPago = 0;
        Menu padrao = new MenuPadrao("Hamburguer", 27.50f);
        Menu infantil = new MenuInfantil("Mini-Burguer", 16.50f, "Mickey", 190f);
        Menu happyHour = new MenuHappyHour("Rodízio Hamburguer", 59.90f);

        // WHEN
        totalASerPago += padrao.preparar();       // pegar produto e devolver valor
        totalASerPago += infantil.preparar();     //
        totalASerPago += happyHour.preparar();   //

        // THEN
        Assertions.assertEquals(totalASerPago, (27.50f + 16.50f + 190f + 59.90f));
    }

    public void calcularPrecoPedidoHappyHour(){

        // GIVEN
        float totalASerPago = 0;
        Menu padrao = new MenuPadrao("Hamburguer", 27.50f);
        Menu infantil = new MenuInfantil("Mini-Burguer", 16.50f);
        Menu happyHour = new MenuHappyHour("Rodízio Hamburguer", 59.90f);

        // WHEN
        totalASerPago += padrao.preparar();       // pegar produto e devolver valor
        totalASerPago += infantil.preparar();     //
        totalASerPago += happyHour.preparar();   //

        // THEN
        Assertions.assertEquals(totalASerPago, (27.50f + 16.50f + 190f + 59.90f));
    }

    @Test
    public void ValorPedidoApenasInfatilComBrinquedo(){

        //Given
        float valorAPagar = 16.50f + 190f;
        Menu pedidoInfantilComBrinquedo = new MenuInfantil("MiniBurguer", 16.50f, "Homem de Ferro", 190f);

        // When
        float totalAPagar = pedidoInfantilComBrinquedo.preparar();

        //Then
        Assertions.assertEquals(totalAPagar, valorAPagar);

    }

    @Test
    public void ValorPedidoPadrao(){

        //Given
        float valorAPAgar = 27.50f;
        Menu pedidoPadrao = new MenuPadrao("Big Mack", 27.50f);

        //When
        float totalAPagar = pedidoPadrao.preparar();

        // Then
        Assertions.assertEquals(valorAPAgar, totalAPagar);

    }

    @Test
    public void ValorPedidoHappyHour(){

        //Given
        float valorAPAgar = 59.9f;
        DayOfWeek diaDaSemana = LocalDate.now().getDayOfWeek();
        if(diaDaSemana == DayOfWeek.MONDAY){
            valorAPAgar *= 0.8f;
        }
        Menu pedidoHappyHour = new MenuHappyHour("Burguer e Gelo", 59.90f);

        //When
        float totalAPagar = pedidoHappyHour.preparar();

        // Then
        Assertions.assertEquals(valorAPAgar, totalAPagar);

    }

}