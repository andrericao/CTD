package aula15_tema3;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Pessoa pessoaUm = new Pessoa("Maria", "Silva","43456782",39);
        Pessoa pessoaDois = new Pessoa("Paula", "Silva", "43456783", 47);
        Pessoa pessoaTres = new Pessoa("Marcos", "Fernandes", "43456345",60);

        Pessoa pessoaQuatro = new Pessoa("Marcela", "Fernandes", "43456456",45);

        LocalDate dataInicioAtividade = LocalDate.now();

        ContratoHoritas contratoMaria = new ContratoHoritas(pessoaUm, 34, dataInicioAtividade, true, 340, 5.0);

        ContratoMensal contratoPaula = new ContratoMensal(pessoaDois, 34, LocalDate.of(2014,5,9),true, 4.500, 500, "Chefe");

        ContratoMensal contratoMarcos = new ContratoMensal(pessoaTres, 12,LocalDate.of(2022,4,5), true, 2.500, 400, "Funcionário");

        ContratoHoritas contratoMarcela = new ContratoHoritas(pessoaQuatro, 24, LocalDate.of(2023,2,5), false, 400, 10);




        System.out.println(contratoMarcela.adicionarAoTrabalho());
        System.out.println("Sua hora por mês é de: " + contratoMarcela.getHorasPorMes());
        System.out.println(contratoMaria.adicionarAoTrabalho());
        System.out.println(contratoMarcela.calcularValorContrado());
        System.out.println(contratoMarcela.compararDuracaoContrato(contratoMaria));
        System.out.println(contratoPaula.isChefe());
        System.out.println(contratoMarcos.isChefe());
    }
}