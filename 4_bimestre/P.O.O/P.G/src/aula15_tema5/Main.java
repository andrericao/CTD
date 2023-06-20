package aula15_tema5;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArmaCurta armaCurta1 = new ArmaCurta(15,210, "AHuhuahs",20.0,"Em uso",true);

        ArmaCurta armaCurta2 = new ArmaCurta(20,250, "AHuhuahs2",25.0,"Em uso",false);
        ArmaLonga armaLonga1 = new ArmaLonga(60,500, "Osdojsojd",50.0,"Em uso",true, "Não conheço n-a-d-a sobre armas mas é uma arma!", 4);
        ArmaLonga armaLonga2 = new ArmaLonga(60,500, "Taurus",50.0,"Em uso",true, "Não conheço n-a-d-a sobre armas mas é uma arma!", 5);

        Policial pm = new Policial("Sandro", "Alves", 1,armaCurta1);
        Policial pm2 = new Policial("Marta", "Dias", 2, armaLonga2);

        System.out.println(armaCurta1.isAutomatica());
        System.out.println(armaCurta1.verificarCondicoes());
        System.out.println(armaCurta1.verificarDisparoDeLongaDistancia());
        System.out.println(armaLonga1.comparandoArmas(armaLonga2));
    }
}