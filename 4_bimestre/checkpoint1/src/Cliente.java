import java.time.LocalDate;

public class Cliente extends Pessoa {

        private int cpf;
        private String tipoPessoa;
        public Cliente(int cpf, String nome) {
            super(nome);
            this.cpf = cpf;
        }


        public int getCpf() {
            return cpf;
        }
        public void setCpf(int cpf) {
            this.cpf = cpf;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getFone() {
            return fone;
        }
        public void setFone(String fone) {
            this.fone = fone;
        }
        public String getEndereco() {
            return endereco;
        }
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        @Override public void cadastroPessoa(){
            System.out.println("Cadastro para pessoa fisica!");
        }
}