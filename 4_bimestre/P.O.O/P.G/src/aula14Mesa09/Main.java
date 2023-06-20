package aula14Mesa09;

public class Main {
    public static void main(String[] args) {

        Containers container1 = new Containers(01, "Desconhecido", "Vídeo Games", false);
        Containers container2 = new Containers(02, "EUA", "Combustível", true);
        Containers container3 = new Containers(03, "Desconhecido", "Tinta", true);
        Containers container4 = new Containers(04, "Rússia", "Munição", true);
        Containers container5 = new Containers(05, "Canadá", "Automóveis", false);
        Containers container6 = new Containers(06, "Desconhecido", "Madeira", false);
        Containers container7 = new Containers(07, "Brasil", "Munição", true);
        Porto porto = new Porto("Porto de Buenos Aires");

        porto.addContainer(container1);
        porto.addContainer(container2);
        porto.addContainer(container3);
        porto.addContainer(container4);
        porto.addContainer(container5);
        porto.addContainer(container6);
        porto.addContainer(container7);

        porto.mostrarContainersPerigosos();

        System.out.println("Existem " + porto.qtdContainersPerigososDesconhecidos() + " containeres de origem desconhecida que são perigosos.");

    }
}
