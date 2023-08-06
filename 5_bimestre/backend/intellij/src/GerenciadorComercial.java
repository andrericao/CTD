import live.aula_2.chainOfResponsibilityPattern.LookingForCorrectEmailBox.Email;
import live.aula_2.chainOfResponsibilityPattern.LookingForCorrectEmailBox.Gerenciador;

public class GerenciadorComercial extends Gerenciador {

    @Override
    public void verificar(Email email) {
        boolean eComercial = "Comercial".equals(email.getAssunto());
        boolean emailDestinoComercial = "comercial@colmeia.com".equals(email.getDestino());

        if (eComercial || emailDestinoComercial) {
            System.out.println("Olá, estou enviando esse email para o comercial");
        } else {
            this.gerenciadorSeguinte.verificar(email);
        }
    }
}
