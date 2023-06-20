package aula_11;

import java.time.LocalDate;

/*Uma classe abstrata (SEMPRE É SUPERCLASSE) é abstrata pq nunca criaremos objetos dela,
serve para AGRUPAR CERTAS CLASSES SOBRE UM CRITÉRIO ESPECÍFICO para COMPARTILHAR
características e comportamentos em comum. Usado com herança.

As Classes abstratas são feitas particularmente para serem modelos de suas classes derivadas, que por via de regra,
deverão sobrescrever os métodos dessa classe abstrata para que seja possível a implementação dos mesmos.
PORTANTO SE DECLARA O MÉTODO NA SUPERCLASSE MAS ELE NÃO FAZ NADA, NA SUBCLASSE QUE ELE SERÁ SOBRESCRITO E
IMPLEMENTADO */
public abstract class Impressora {

    private String modelo;
    private String tipoConexo;
    private LocalDate dataFabricacao;
    protected int folhasDisponiveis;
    private Double porcentagemTinta;


    /*O fato de uma classe abstrata não ser instanciada não significa que ela não possa ter
        construtores ou métodos não abstratos. O objtivo é que sejam usados na reutilização de código
        quando se herda a classe abstrata*/
    public Impressora(String modelo, String tipoConexo, LocalDate dataFabricacao, int folhasDisponiveis, Double porcentagemTinta) {
        this.modelo = modelo;
        this.tipoConexo = tipoConexo;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
        this.porcentagemTinta = porcentagemTinta;
    }


    public boolean temPapel(){
        if(folhasDisponiveis > 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean precisaTinta(){
        if(porcentagemTinta > 0){
            return false;
        }else{
            return true;
        }
    }


    //O abstratc obriga a subclasse que herdar a classe Impressora a implementar esse método
    //Como o método não é implementado aqui não seu usa {}
    //Define o contrato: obrigatório sobrescre na filha
    public abstract String imprimir();


    //get e set

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexo() {
        return tipoConexo;
    }

    public void setTipoConexo(String tipoConexo) {
        this.tipoConexo = tipoConexo;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }


    public Double getPorcentagemTinta() {
        return porcentagemTinta;
    }

    public void setPorcentagemTinta(Double porcentagemTinta) {
        this.porcentagemTinta = porcentagemTinta;
    }
}