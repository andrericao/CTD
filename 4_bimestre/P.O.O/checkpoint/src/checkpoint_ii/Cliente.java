package checkpoint_ii;

import java.time.LocalDate;

public class Cliente extends Pessoa {

        private String cpf;
        private String tipoPessoa;

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

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    @Override public void cadastroPessoa(){
            System.out.println("Cadastro para pessoa fisica!");
        }
}