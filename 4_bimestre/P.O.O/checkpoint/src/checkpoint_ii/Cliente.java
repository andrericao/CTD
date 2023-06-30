package checkpoint_ii;

public class Cliente extends Pessoa {

        private String cpf;

    public Cliente(String cpf, String nome) {
            super(nome);
            this.cpf = cpf;
        }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void cadastroPessoa(){
            System.out.println("Cadastro para pessoa fisica!");
    }
}