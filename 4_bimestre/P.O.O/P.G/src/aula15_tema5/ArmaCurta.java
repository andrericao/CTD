package aula15_tema5;

public class ArmaCurta extends Arma{
    private boolean isAutomatica;

    public ArmaCurta(Integer quantidadeDeMunicao, Integer alcanceEmMetros, String marca, double calibre, String status, boolean isAutomatica) {
        super(quantidadeDeMunicao, alcanceEmMetros, marca, calibre, status);
        this.isAutomatica = isAutomatica;
    }

    public String isAutomatica() {
        if (isAutomatica) {
            return "Esta arma é automática.";
        } else {
            return "Não é uma arma automática";
        }
    }

    public void setAutomatica(boolean automatica) {
        isAutomatica = automatica;
    }

    public String verificarDisparoDeLongaDistancia(){
        if(this.getAlcanceEmMetros() > 200){
            return "O alcance é de longa distância.";
        } else {
            return "O alcancé de curta distância.";
        }
    }

}
