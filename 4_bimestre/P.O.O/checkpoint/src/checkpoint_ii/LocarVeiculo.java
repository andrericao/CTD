package checkpoint_ii;

public class LocarVeiculo {

    private static Cliente cliente;

    public static void main(String[] args) throws ClienteCadastroException {


        Locadora digitalCar = new Locadora ("Locadora Digital Car");

        // Criação de veículos
        Veiculo fiat = new Veiculo("fiesta", "branco", "DHPL - 2023");

        Veiculo honda = new Veiculo("civic", "preto", "VAMO - 2021");

        // Adicionando veículo na listaVeiculo
        digitalCar.addVeiculo(fiat);
        digitalCar.addVeiculo(honda);

        // Lendo listaVeiculo
        digitalCar.lerVeiculo();

        //Criando funcionário
        Funcionario recepcionista = new Funcionario("Marcos", "locador");
        
        // Uso de sobrecaraga criando funcionário mirim (jovem aprendiz)
        Funcionario recepcionistaMirim = new Funcionario ("Matheus", "jovem Aprendiz", 16);

        // a locadora já cria o cliente o adicionando na listaCliente
        // esta chamada do construtor usa o scanner
        digitalCar.addCliente(recepcionista.cadastroNovoCliente());
        digitalCar.addCliente(recepcionista.cadastroNovoCliente());
        digitalCar.addCliente(recepcionista.cadastroNovoCliente());


        // um chamado de método
        digitalCar.lerCliente(cliente);

    }
}