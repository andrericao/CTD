package live.aula_2.chainOfResponsibilityPattern.LookingForCorrectEmailBox;

public class GerenciadorComercial extends Gerenciador{
    @Override
    public void verificar(Email email){
        boolean eGerencia = "Gerencia".equals(email.getAssunto());
    }
}
