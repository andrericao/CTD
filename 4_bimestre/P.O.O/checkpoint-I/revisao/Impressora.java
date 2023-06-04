import java.time.LocalDate;

public class Impressora {

    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;
    private Double custoPorFolha;
    private Integer quantidadePaginasImpressas;

    public Impressora(String modelo, int folhasDisponiveis) {
        this.modelo = modelo;
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public Double alterarCustoPorFolha(Double novoValor){
        custoPorFolha = novoValor;
        return  custoPorFolha;
    }

    private boolean temPapel(){
        if(folhasDisponiveis == 0){
            return false;
        }else{
            return true;
        }
    }

    public void imprimir (String texto){
        if(temPapel()){
            System.out.println("Texto: " + texto + " impresso com sucesso");
            folhasDisponiveis -= folhasDisponiveis;
        }else{
            System.out.println("Não foi possível imprimir, abasteça com papel a impressora");
        }
    }


    //get e set
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public Integer getQuantidadePaginasImpressas() {
        return quantidadePaginasImpressas;
    }

    public void setQuantidadePaginasImpressas(Integer quantidadePaginasImpressas) {
        this.quantidadePaginasImpressas = quantidadePaginasImpressas;
    }

    public Double getCustoPorFolha() {
        return custoPorFolha;
    }
}