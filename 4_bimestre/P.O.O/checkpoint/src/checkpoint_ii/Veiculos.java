package checkpoint_ii;

public class Veiculos {
    private String modelo;
    private String cor;
    private String placa;
    private boolean status;

    public Veiculos(String modelo, String cor, String placa, boolean status) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.status = status;
    }

    public void alugarVeiculo() {
        if (this.getStatus() == true) {
            System.out.println("Modelo: " + this.getModelo());
            System.out.println("Cor: " + this.getCor());
            System.out.println("Placa: " + this.getPlaca());
            System.out.println("O veiculo alugado com sucesso!");
        } else {
            System.out.println("O veiculo ja esta alugado! ");
            System.out.println("Modelo: " + this.getModelo());
            System.out.println("Cor: " + this.getCor());
            System.out.println("Placa: " + this.getPlaca());
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}