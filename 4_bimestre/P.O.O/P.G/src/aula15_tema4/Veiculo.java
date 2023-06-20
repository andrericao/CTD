package aula15_tema4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Veiculo {
    private Proprietario proprietario;
    private LocalDate dataCotacaoDePreco;
    private String marcaDoVeiculo;
    private String patenteDoVeiculo;
    private boolean isNacional;

    private ArrayList<Veiculo> listaDeVeiculos= new ArrayList<>();

    public Veiculo(Proprietario proprietario, LocalDate dataCotacaoDePreco, String marcaDoVeiculo, String patenteDoVeiculo, boolean isNacional) {
        this.proprietario = proprietario;
        this.dataCotacaoDePreco = dataCotacaoDePreco;
        this.marcaDoVeiculo = marcaDoVeiculo;
        this.patenteDoVeiculo = patenteDoVeiculo;
        this.isNacional = isNacional;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public LocalDate getDataCotacaoDePreco() {
        return dataCotacaoDePreco;
    }

    public void setDataCotacaoDePreco(LocalDate dataCotacaoDePreco) {
        this.dataCotacaoDePreco = dataCotacaoDePreco;
    }

    public String getMarcaDoVeiculo() {
        return marcaDoVeiculo;
    }

    public void setMarcaDoVeiculo(String marcaDoVeiculo) {
        this.marcaDoVeiculo = marcaDoVeiculo;
    }

    public String getPatenteDoVeiculo() {
        return patenteDoVeiculo;
    }

    public void setPatenteDoVeiculo(String patenteDoVeiculo) {
        this.patenteDoVeiculo = patenteDoVeiculo;
    }

    public boolean isNacional() {
        return isNacional;
    }

    public void setNacional(boolean nacional) {
        isNacional = nacional;
    }

    public String verificarNacionalidade(){
        if(isNacional){
            return (this.marcaDoVeiculo + " " + " é nacional.");
        }else{
            return (this.marcaDoVeiculo + " " + " é importado.");
        }
    }
}
