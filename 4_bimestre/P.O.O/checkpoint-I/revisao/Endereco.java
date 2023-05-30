public class Endereco {

    //atributos
    private String rua;
    private String numero;
    private String cidade;
    private String bairro;
    private String estado;
    private Integer cep;

    //Construtor
    //botão direito - generate - construtor - seleciona ops campos desejados - ok
    public Endereco(String rua, String numero, String cidade, Integer cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    }

    //metodo ou função
    public Integer modificarCep(Integer novoCep){
        this.cep = novoCep;
        return this.cep;
    }

    //get e set
    //botão direito - generate - getters and setters - seleciona ops campos desejados - ok
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }


}