package live.aula_2.chainOfResponsibilityPattern.LookingForCorrectEmailBox;

import org.junit.jupiter.api.Test;

class EmailTest {
    @Test
    public void enviarEmailAoGestor(){

        //Given
        String origem = "email@colmeia.com";
        String destino = "tecnologia@colmeia.com";
        String assunto = "Gerência";

        CheckEmail processador = new CheckEmail();
        Email email = new Email(origem, destino, assunto);
        processador.verificarEmail(email);
    }
}