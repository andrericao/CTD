package aula14Mesa09;

public class Containers implements Comparable<Containers>{
    private int idContainer;
    private String paisOrigem;
    private String descricao;
    private boolean materialPerigoso;

    public Containers(int idContainer, String paisOrigem, String descricao, boolean materialPerigoso) {
        this.idContainer = idContainer;
        this.paisOrigem = paisOrigem;
        this.descricao = descricao;
        this.materialPerigoso = materialPerigoso;
    }

    @Override
    public int compareTo(Containers o) {
        if(this.idContainer == o.idContainer) {
            return 0;
        } else if (this.idContainer < o.idContainer) {
            return -1;
        } else {
            return 1;
        }
    }


    public int getIdContainer() {
        return idContainer;
    }

    public void setIdContainer(int idContainer) {
        this.idContainer = idContainer;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isMaterialPerigoso() {
        return materialPerigoso;
    }

    public void setMaterialPerigoso(boolean materialPerigoso) {
        this.materialPerigoso = materialPerigoso;
    }


}
