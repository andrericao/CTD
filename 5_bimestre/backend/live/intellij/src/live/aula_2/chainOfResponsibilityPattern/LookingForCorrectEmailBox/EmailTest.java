package live.aula_2.chainOfResponsibilityPattern.LookingForCorrectEmailBox;

import org.junit.jupiter.api.Test;

class EmailTest {
    @Test
    public void enviarEmailAoGestor(){

        //Given
        String origem = "gerencia@colmeia.com";
        String destino = "tecnologia@colmeia.com";
        String assunto = "Gerência";

        CheckEmail processador = new CheckEmail();
        Email email = new Email(origem, destino, assunto);
        processador.verificar(email);
    }

    @Test
    public void enviarEmailAoComercial(){

        //Given
        String origem = "email@colmeia.com";
        String destino = "comercial@colmeia.com";
        String assunto = "COMERCIAL";

        CheckEmail processador = new CheckEmail();
        Email email = new Email(origem, destino, assunto);
        processador.verificar(email);
    }
}