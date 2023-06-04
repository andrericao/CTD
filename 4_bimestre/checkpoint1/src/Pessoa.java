public abstract class Pessoa {
    protected String nome;
    protected String fone;
    protected String endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }


    public void cadastroPessoa(){
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
}