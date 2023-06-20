package checkpoint_ii;

public class LocarVeiculo {

    public static void main(String[] args) {
        /*

        Cliente cliente1 = new Cliente(12233441, "André");

        cliente1.setFone("6284306136");
        cliente1.setEndereco("Av. X");


        Cliente cliente2 = new Cliente(2223332, "Joaozinho");

        Veiculos v1 = new Veiculos("Gol","Branco","NLT 6666",true);
        Veiculos v2 = new Veiculos("Celta","Preto","NNN 4458",false);
        Veiculos v3 = new Veiculos("Clio","Vermelho","OLT 0000",true);
        Veiculos v4 = new Veiculos("Palio","Prata","OOO 0101",true);

        System.out.println("============Dados Cliente==============");

        System.out.println("Nome: " + cliente1.getNome() + "\n"
                         + "Fone: " + cliente1.getFone() + "\n"
                         + "Endereço: " + cliente1.getEndereco() + "\n"
                         + "CPF: " + cliente1.getCpf());


        System.out.println("=============Dados Veiculo===============");

        v2.alugarVeiculo();

        System.out.println("=============Dados Veiculo===============");

        v3.alugarVeiculo();

        System.out.println("=============Status Contrato===============");

        Funcionario atendente1 = new Funcionario("atendente1", "locador");

        atendente1.fazerContrato(cliente1, v1);
        atendente1.statusContrato(cliente1.getNome(), cliente1.getCpf(), v1.getModelo(), v1.getCor());
        */

        Funcionario recepcionista = new Funcionario("Marcos", "locador");

        recepcionista.atenderNovoCliente();


    }
}