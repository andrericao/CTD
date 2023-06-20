package aula15_tema4;

import java.time.LocalDate;

public class Carro extends Veiculo{
    private boolean isGas;
    private int cilindrada;

    public Carro(Proprietario proprietario, LocalDate dataCotacaoDePreco, String marcaDoVeiculo, String patenteDoVeiculo, boolean isNacional, boolean isGas, int cilindrada) {
        super(proprietario, dataCotacaoDePreco, marcaDoVeiculo, patenteDoVeiculo, isNacional);
        this.isGas = isGas;
        this.cilindrada = cilindrada;
    }

    public String verificarEconomia(){
        if(isGas || this.cilindrada < 1200){
            return "Este veículo é econômico.";
        }else{
        return "Este veículo não é econômico.";
        }
    }

    public boolean isGas() {
        return isGas;
    }

    public void setGas(boolean gas) {
        isGas = gas;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
