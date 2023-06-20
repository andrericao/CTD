package aula_11;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        ImpressoraEpson impressoraEpson = new ImpressoraEpson("Epson", "USB",
                LocalDate.of(2020, 01, 30), 500, 50.0);

        ImpressoraCannon impressoraCannon = new ImpressoraCannon("Cannon", "Cabo",
                LocalDate.of(2023, 12, 10), 10, 60D);


        System.out.println(impressoraEpson.imprimir());
        System.out.println(impressoraCannon.imprimir());

    }
}