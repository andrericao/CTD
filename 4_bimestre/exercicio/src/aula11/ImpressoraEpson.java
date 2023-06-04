package aula11;

import java.time.LocalDate;

public class ImpressoraEpson extends Impressora{


    public ImpressoraEpson(String modelo, String tipoConexo, LocalDate dataFabricacao, int folhasDisponiveis, Double porcentagemTinta) {
        super(modelo, tipoConexo, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir() {
        if(temPapel() && !precisaTinta()){
            String textoImpresso = "Esse texto vai ser impresso";
            setPorcentagemTinta(getPorcentagemTinta() - 0.02);
            folhasDisponiveis--;
            System.out.println("Folhas disponíveis: " +       folhasDisponiveis);
            return "Imprimindo o seguinte texto: " + textoImpresso;
        }else if(temPapel() && precisaTinta()){
            return "Você precisa adicionar tinta!";
        }else if (!temPapel() && precisaTinta()){
            return "Você precisa adicionar papel e tinta";
        }else{
            return "Você precisa adicionar papel!";
        }
    }
}