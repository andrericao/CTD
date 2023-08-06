package live.aula_2.chainOfResponsibilityPattern.LookingForCorrectEmailBox;

public class CheckEmail{

    Gerenciador gerenciador;

    public CheckEmail() {
        gerenciador = new GerenciadorGerencia();

        Gerenciador comercial = new GerenciadorComercial();
        gerenciador.setGerenciadorSeguinte(comercial);
        //gerenciador.setGerenciadorSeguinte("PRÉXIMO GERENCIADOR, VAI ESTAR AQUI!!!");
    }

    public void verificar(Email email){
        gerenciador.verificar(email);
    }
}
