package live.aula_2.chainOfResponsibilityPattern.LookingForCorrectEmailBox;

public class GerenciadorGerencia extends Gerenciador{
    @Override
    public void verificar(Email email){
        boolean eGerencia  = "Gerência".equals(email.getAssunto());
        boolean emailDestinoEGerencia = "gerencia@colmeia.com".equals(email.getDestino());

        if(eGerencia || emailDestinoEGerencia) {
            System.out.println("Olá, estou enviando esse email para a gerência");
        } else {
            this.gerenciadorSeguinte.verificar(email);
        }
    }
}
