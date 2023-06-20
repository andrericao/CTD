package aula15_tema3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private Pessoa pessoa;
    private Integer duracaoEmMeses;
    private LocalDate dataInicioAtividade;
    private boolean estaRegistradoNoMinisterio;
    private ArrayList<Contrato> listaDeContratos= new ArrayList<>();

    public Contrato(Pessoa pessoa, Integer duracaoEmMeses, LocalDate dataInicioAtividade, boolean estaRegistradoNoMinisterio) {
        this.pessoa = pessoa;
        this.duracaoEmMeses = duracaoEmMeses;
        this.dataInicioAtividade = dataInicioAtividade;
        this.estaRegistradoNoMinisterio = estaRegistradoNoMinisterio;
    }

    public String adicionarAoTrabalho(){
        if (this.estaRegistradoNoMinisterio){
            return (getPessoa().getNome() + " " + getPessoa().getSobrenome() + " pode ser adicionade ao trabalho.");
        }
        return (getPessoa().getNome() + " " + getPessoa().getSobrenome() + "não pode ser adicionade ao trabalho.");
        }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Integer getDuracaoEmMeses() {
        return duracaoEmMeses;
    }

    public void setDuracaoEmMeses(Integer duracaoEmMeses) {
        this.duracaoEmMeses = duracaoEmMeses;
    }

    public LocalDate getDataInicioAtividade() {
        return dataInicioAtividade;
    }

    public void setDataInicioAtividade(LocalDate dataInicioAtividade) {
        this.dataInicioAtividade = dataInicioAtividade;
    }

    public boolean isEstaRegistradoNoMinisterio() {
        return estaRegistradoNoMinisterio;
    }

    public void setEstaRegistradoNoMinisterio(boolean estaRegistradoNoMinisterio) {
        this.estaRegistradoNoMinisterio = estaRegistradoNoMinisterio;
    }
}
