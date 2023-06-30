package checkpoint_ii;

import java.util.ArrayList;

public class Locadora {

    private String nome;
    private ArrayList<Veiculo> listaVeiculo = new ArrayList<>();
    private ArrayList<Cliente> listaCliente = new ArrayList<>();

    public Locadora(String nome){
        this.nome = nome;
    }

    public void addVeiculo(Veiculo veiculo){
        listaVeiculo.add(veiculo);
    }

    public void lerVeiculo(){

        System.out.println("=================== Lista de veículos ====================\n ");
        for (Veiculo v: listaVeiculo){
            System.out.println("Modelo: " + v.getModelo()
                    + ", cor: " + v.getCor());
        }

        System.out.println("=================== Fim da Lista ====================\n");

    }

    public void addCliente(Cliente cliente){
        listaCliente.add(cliente);
    }

    public void lerCliente(Cliente cliente) {

        System.out.println("=================== Lista de clientes ====================\n");
        for (Cliente c: listaCliente){
            System.out.println("Cliente: " + c.getNome()
                    + ", CPF: " + c.getCpf());
        }

        System.out.println("=================== Fim da Lista ====================\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Veiculo> getListaVeiculo() {
        return listaVeiculo;
    }

    public void setListaVeiculo(ArrayList<Veiculo> listaVeiculo) {
        this.listaVeiculo = listaVeiculo;
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
}
