package aula_11;

import java.time.LocalDate;

public class ImpressoraCannon extends Impressora{


    public ImpressoraCannon(String modelo, String tipoConexo, LocalDate dataFabricacao, int folhasDisponiveis, Double porcentagemTinta) {
        super(modelo, tipoConexo, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir() {
        if (temPapel() && !precisaTinta()){
            folhasDisponiveis--;
            setPorcentagemTinta(getPorcentagemTinta() - 0.01);
            return "Imprimindo!!";
        }else if (temPapel() && precisaTinta()){
            return "Você precisa adicionar tinta!";
        }else if (!temPapel() && precisaTinta()){
            return "Você precisa de tinta e de papel!";
        }else {
            return "Você precisa de  papel!";
        }
    }


}