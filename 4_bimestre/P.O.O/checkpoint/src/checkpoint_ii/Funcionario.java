package checkpoint_ii;

import java.util.Scanner;

public class Funcionario extends Pessoa {

    private String cargo;
    private Cliente locador;
    private Veiculos veiculo;

    public Funcionario (String nome, String cargo){
        super(nome);
        this.cargo = cargo;
    }

    public void atenderNovoCliente(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, muito bom dia.\nComo você se chama?\n");
        String nomeCliente = scanner.next();

        System.out.println("Digite, por favor, o número do seu CPF.\n");
        String cpfCliente = scanner.next();

        Cliente cliente = new Cliente(cpfCliente, nomeCliente);

        System.out.println("Muito obrigado " + cliente.nome + "\nQual carro gostaria de alugar?\n");

        fazerContrato();

    }

    public void fazerContrato(){

        Scanner scanner = new Scanner(System.in);

        this.locador = cliente.nome;
        this.veiculo = veiculo;
    }



    public void statusContrato(String nome, int cpf, String modelo, String cor){
        System.out.println(nome + ", CPF: " + cpf + " alugou o carro " + modelo + " " + cor);
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
