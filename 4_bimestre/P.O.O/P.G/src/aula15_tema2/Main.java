package aula15_tema2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Obra obraUm = new Obra(
                LocalDate.of(2023, 6, 8),
                LocalDate.of(2025, 11, 30),
                null);

        Obra obraDois = new Obra(
                LocalDate.of(2023,4,10),
                LocalDate.of(2027,4,10),
                LocalDate.of(2030,10,1)
        );

        Obra obraTres = new Obra(
                LocalDate.of(2020,4,10),
                LocalDate.of(2027,4,10),
                LocalDate.of(2030,10,1)
        );

        Obra obraQuatro = new Obra(
                LocalDate.of(2024,4,10),
                LocalDate.of(2026,2,22),
                LocalDate.of(2030,9,10)
        );



       ProjetoResidencial projetoResidencialUm = new ProjetoResidencial("Casa da Maria", "Rio de Janeiro", obraUm, 100.00, 2, 4);

       ProjetoDepartamental projetoDepartamentalUm = new ProjetoDepartamental("Sky view Plaza", "Barra da Tijuca", obraDois, 16, 26);

       ProjetoDepartamental projetoDepartamentalDois = new ProjetoDepartamental("Shopping", "Tijuca", obraTres, 4, 30);


        System.out.println(projetoDepartamentalDois.indicarStatus());
        System.out.println(projetoDepartamentalUm.verificarTipoDePredio());
        System.out.println(projetoDepartamentalUm.comparandoDepartamentos(projetoDepartamentalDois));
        System.out.println(projetoResidencialUm.indicarStatus());
    }
}
