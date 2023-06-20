package aula15_tema3;

import java.time.LocalDate;

public class ContratoMensal extends Contrato{
    private double salarioMensal;
    private Integer totalDeHoras;
    private String cargo;

    public ContratoMensal(Pessoa pessoa, Integer duracaoEmMeses, LocalDate dataInicioAtividade, boolean estaRegistradoNoMinisterio, double salarioMensal, Integer totalDeHoras, String cargo) {
        super(pessoa, duracaoEmMeses, dataInicioAtividade, estaRegistradoNoMinisterio);
        this.salarioMensal = salarioMensal;
        this.totalDeHoras = totalDeHoras;
        this.cargo = cargo;
    }

    public String isChefe(){
     if("Chefe".equals(cargo)){
         return "Possui o cargo de Chefe.";
        } else {
         return "Não é o chefe.";
     }
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public Integer getTotalDeHoras() {
        return totalDeHoras;
    }

    public void setTotalDeHoras(Integer totalDeHoras) {
        this.totalDeHoras = totalDeHoras;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
