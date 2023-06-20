package aula15_tema3;

import java.time.LocalDate;

public class ContratoHoritas extends Contrato implements Comparable<ContratoHoritas>{
    private Integer horasPorMes;
    private double valorPorHora;
    private double valorTotal;

    public ContratoHoritas(Pessoa pessoa, Integer duracaoEmMeses, LocalDate dataInicioAtividade, boolean estaRegistradoNoMinisterio, Integer horasPorMes, double valorPorHora) {
        super(pessoa, duracaoEmMeses, dataInicioAtividade, estaRegistradoNoMinisterio);
        this.horasPorMes = horasPorMes;
        this.valorPorHora = valorPorHora;
    }

    public String calcularValorContrado(){
        valorTotal = this.horasPorMes * this.valorPorHora;
        return ("O valor total é pelas horas trabalhadas no mês é de: " + valorTotal);
    }
    public Integer getHorasPorMes() {
        return horasPorMes;
    }

    public void setHorasPorMes(Integer horasPorMes) {
        this.horasPorMes = horasPorMes;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    @Override
    public int compareTo(ContratoHoritas o) {
        int comparacao = Integer.compare(this.horasPorMes, o.horasPorMes);
        String nomeContratoUm = this.getPessoa().getNome() + this.getPessoa().getSobrenome();
        String nomeContratoDois = o.getPessoa().getNome() + o.getPessoa().getSobrenome();

        if (comparacao < 0) {
            return -1;
        } else if (comparacao > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public String compararDuracaoContrato(ContratoHoritas o){
        int resultadoComparacao = compareTo(o);
        String nomeContratoUm = this.getPessoa().getNome() + " " + this.getPessoa().getSobrenome();
        String nomeContratoDois = o.getPessoa().getNome() + " " + o.getPessoa().getSobrenome();

        if (resultadoComparacao < 0) {
            return "O contrado de " + nomeContratoUm + " tem duração menor que " + nomeContratoDois;
        } else if (resultadoComparacao > 0) {
            return "O contrado de " + nomeContratoUm + " tem duração maior que " + nomeContratoDois;
        } else {
            return nomeContratoUm + " tem duração igual ao de " + nomeContratoDois;
        }
    }
}
