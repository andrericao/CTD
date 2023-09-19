package live.aula_1.testDrivenDevelopmentTDD_cartaoCredito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CartaoCreditoTest {
    @Test
    public void retornarQuantidadeCaracteres() {
        // Given
        CartaoCredito cartao_1 = new CartaoCredito("André", "1225 5987 6354 8235");

        //When
        boolean com20Caracteres = cartao_1.tem20caracteres();

        //Then
        Assertions.assertTrue(com20Caracteres);
        Assertions.assertEquals(19, cartao_1.tem19caracteres()); //Inventei
    }

}