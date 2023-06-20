package exemplorevisaocheckpoinII;

public interface AcaoImpressora {

    public Double alterarCustoPorFolha(Double novoValor);
    public boolean temPapel() ;
    public void imprimir (String texto) throws Exception;

}
