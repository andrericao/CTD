package aula15_tema4;

import java.time.LocalDate;

public class Caminhao extends Veiculo{
    private int numeroDeEixos;
    private int capacidadeDeCargas;

    public Caminhao(Proprietario proprietario, LocalDate dataCotacaoDePreco, String marcaDoVeiculo, String patenteDoVeiculo, boolean isNacional, int numeroDeEixos, int capacidadeDeCargas) {
        super(proprietario, dataCotacaoDePreco, marcaDoVeiculo, patenteDoVeiculo, isNacional);
        this.numeroDeEixos = numeroDeEixos;
        this.capacidadeDeCargas = capacidadeDeCargas;
    }

    public int compareTo(Caminhao o){
        int comparacao = Integer.compare(this.capacidadeDeCargas, o.capacidadeDeCargas);
        String caminhaoUm = this.getPatenteDoVeiculo() + " " + this.getMarcaDoVeiculo();
        String caminhaoDois = this.getPatenteDoVeiculo() + " " + this.getMarcaDoVeiculo();

        if (comparacao < 0) {
            return -1;
        } else if (comparacao > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public String comparandoCaminhoes(Caminhao o){
        int resultadoComparacao = compareTo((o));
        String caminhaoUm = this.getPatenteDoVeiculo() + " " + this.getMarcaDoVeiculo();
        String caminhaoDois = o.getPatenteDoVeiculo() + " " + o.getMarcaDoVeiculo();

        if (resultadoComparacao < 0) {
            return "A capacidade de carga de" + " " + caminhaoUm + " é menor que a do " + caminhaoDois;
        } else if (resultadoComparacao > 0) {
            return "A capacidade de carga de" + " " + caminhaoUm + " é maior que a do " + caminhaoDois;
        } else {
            return caminhaoUm + " tem capacidade igual ao de " + caminhaoDois;
        }
    }

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }

    public void setNumeroDeEixos(int numeroDeEixos) {
        this.numeroDeEixos = numeroDeEixos;
    }

    public int getCapacidadeDeCargas() {
        return capacidadeDeCargas;
    }

    public void setCapacidadeDeCargas(int capacidadeDeCargas) {
        this.capacidadeDeCargas = capacidadeDeCargas;
    }
}




