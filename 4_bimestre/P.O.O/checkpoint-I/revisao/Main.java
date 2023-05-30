public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Ronaldo", "0265895256", new Endereco("Rua Conceição", "00A", "Santos", 12548936));

        Impressora impressora1 = new Impressora("HP", 1000);
        Impressora impressora2 = new Impressora("Lenovo", 1000);
        Impressora impressora3 = new Impressora("Epson", 0);

        Endereco endereco1 = new Endereco("Roa Margarida", "01", "Ribeirão Preto", 14021569);
        Endereco endereco2 = new Endereco("Roa Rosa", "02", "Santo", 14025698);

        Cliente clientePadariaPao = new Cliente("Padaria Pão", "08562514598", endereco1);
        Cliente clienteSupermercadoOi = new Cliente("Supermercado Oi", "0102502/001/40", endereco2);

        SetorAlocacao setorRh = new SetorAlocacao("RH", "Maria");
        SetorAlocacao setorTi = new SetorAlocacao("TI", "João");


        setorTi.adicionarImpressora(impressora1);
        setorTi.adicionarImpressora(impressora2);
        setorRh.adicionarImpressora(impressora3);

        clientePadariaPao.adicionarSetor(setorRh);
        clienteSupermercadoOi.adicionarSetor(setorTi);


        impressora1.imprimir("To com fome!");
        impressora2.imprimir("To com sono!");
        impressora3.imprimir("Hello Word!");

        clientePadariaPao.exibirSetoresImpressoras(); // vai retornar null

        impressora1.alterarCustoPorFolha(0.10);
        impressora2.alterarCustoPorFolha(0.39);
        impressora3.alterarCustoPorFolha(0.50);

        clientePadariaPao.exibirSetoresImpressoras();

        clienteSupermercadoOi.modificarEndereco(new Endereco("Rua Alma", "03", "Tiradentes", 14523698));

        System.out.println(clientePadariaPao.getCpfCnpj());
        clientePadariaPao.modificarCadastro(null, "0256982536", null, null);
        System.out.println(clientePadariaPao.getCpfCnpj());
    }
}