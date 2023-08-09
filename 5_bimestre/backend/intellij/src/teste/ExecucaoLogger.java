package teste;

public class ExecucaoLogger {
    public static void main(String[] args) {
       /*
        Calculadora calculadora = new Calculadora(1, 3);
        int soma = calculadora.somar();
        System.out.println(soma);

        Calculadora calculadora1 = new Calculadora(1, 0);
        double divisao = calculadora1.dividir();
        System.out.println(divisao);

        Calculadora calculadora2 = new Calculadora(4, 2);
        double divisao2 = calculadora2.dividir();
        System.out.println(divisao2);*/

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
