package aula_1;

public class CartaoCredito {
    private String nome;
    private Long numero;

    public CartaoCredito(String nome, Long numero){
        this.nome = nome;
        this.numero = numero;
    }

    public boolean tem20caracteres(){
        int quantidadecaracteres = numero.toString().length();
        return quantidadecaracteres == 16;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }
}
