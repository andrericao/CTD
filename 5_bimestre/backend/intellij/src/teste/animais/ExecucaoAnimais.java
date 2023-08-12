package teste.animais;

public class ExecucaoAnimais {
    public static void main(String[] args) {
        Leao simba = new Leao("Simba", -6);
        Leao mufasa = new Leao("Mufasa", 21);

        simba.correr();
        mufasa.correr();

        simba.eMaiorQue10();
        mufasa.eMaiorQue10();

        Tigre diego = new Tigre("Diego", 5);
        Tigre tigrao = new Tigre("Tigrão", 5);

        diego.correr();
        tigrao.correr();
    }
}
