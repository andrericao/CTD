package checkpoint_ii;

import java.util.Scanner;

public class Funcionario extends Pessoa {

    private int idade;
    private String cargo;

    public Funcionario (String nome, String cargo){
        super(nome);
        this.cargo = cargo;
    }

    //Este é o segundo construtor onde será aplicado a sobrecaraga

    public Funcionario (String nome, String cargo, int idade){
        super(nome);
        this.cargo = cargo;
        this.idade = idade;
    }

    public Cliente cadastroNovoCliente() throws ClienteCadastroException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, muito bom dia.\nComo você se chama?");
        // aplicação do scanner
        String nomeCliente = scanner.next();

        if(nomeCliente.length() < 3){
            throw new ClienteCadastroException("O nome deve ter no mínimo 3 letras!");

        }

        System.out.println("Digite, por favor, o número do seu CPF.");
        // aplicação do scanner
        String cpfCliente = scanner.next();

        if(cpfCliente.length() < 11 || cpfCliente.length() > 11){
            throw new ClienteCadastroException("O CPF deve ter 11 algarismos");

        }

        Cliente cliente = new Cliente(cpfCliente, nomeCliente);

        System.out.println("o senhor " + cliente.getNome() + " e CFP: " + cliente.getCpf() + " foi cadastrado");

        return cliente;


    }

    public void statusContrato(String nome, String cpf, String modelo, String cor){
        System.out.println(nome + ", CPF: " + cpf + " alugou o carro " + modelo + " " + cor);
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void cadastroPessoa() {

    }
}
