package medicamentos_DAO.model;

public class Medicamentos {
    private Integer id;
    private String nome;
    private TipoLaboratorio laboratorio;
    private int quantidade;
    private double preco;

    public Medicamentos(Integer id,
                        String nome,
                        TipoLaboratorio laboratorio,
                        Integer quantidade,
                        Double preco) {
        this.id = id;
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoLaboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(TipoLaboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Medicamentos{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", laboratorio=" + laboratorio +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
