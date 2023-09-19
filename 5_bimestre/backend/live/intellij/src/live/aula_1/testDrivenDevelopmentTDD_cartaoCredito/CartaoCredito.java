package live.aula_1.testDrivenDevelopmentTDD_cartaoCredito;

public class CartaoCredito {
    private String nome;
    private String numero;

    public CartaoCredito(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }

    public boolean tem20caracteres(){
        int quantidadecaracteres = numero.length();
        return quantidadecaracteres == 19;
    }

    public int tem19caracteres(){ //Inventei
       int quantidadecaracteres = numero.length();
        System.out.println("tenho 19 caracteres");
        return quantidadecaracteres;
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