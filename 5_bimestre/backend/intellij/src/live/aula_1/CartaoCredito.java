package live.aula_1;

public class CartaoCredito {
    private String nome;
    private String numero;

    public CartaoCredito(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }

    public boolean tem20caracteres(){
        int quantidadecaracteres = numero.length();
        return quantidadecaracteres == 16;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
