package galaxya;

public class Main {
    public static void main(String[] args) {

        Nave nostromo = new Nave(100.0, 1000){

        nostromo.setPosx(10);// = 10;
        nostromo.setPosy(20);// = 20;
        nostromo.setDirecao('N');// = 'N';
        //nostromo.getPosy();

        System.out.println(nostromo.toString());
    }

}