package designPattern;

import java.util.ArrayList;

public class Empresa {
    private String cnpj;
    private ArrayList<Empregado> listaEmpregado = new ArrayList<>();

    public Empresa(String cnpj) {
        this.cnpj = cnpj;
    }

    public double calcularSalarioTotal(int dias){
        double salarioTotalEmpregados = 0;
        for (Empregado empregado: listaEmpregado){
            salarioTotalEmpregados += empregado.calcularSalario(dias);
        }
        System.out.println("Valor total a pagar de salário: " + salarioTotalEmpregados);
        return salarioTotalEmpregados;
    }

    public void addEmpregado(Empregado empregado){
        listaEmpregado.add(empregado);
    }

    public void lerEmpregado(int dias){
        for (Empregado e: listaEmpregado){
            System.out.println("Empregado: " + e.getNome()
                    + " possui salário de R$" + e.calcularSalario(dias));
        }

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Empregado> getListaEmpregado() {
        return listaEmpregado;
    }

    public void setListaEmpregado(ArrayList<Empregado> listaEmpregado) {
        this.listaEmpregado = listaEmpregado;
    }
}