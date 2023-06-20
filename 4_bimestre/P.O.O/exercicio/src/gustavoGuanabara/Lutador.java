package gustavoGuanabara;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private char categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
    }

    // Métodos Públicos
    public void apresentar() {
        System.out.println("_________________________________");
        System.out.println("Chegou a hora de apresentarmos o lutador: " + this.getNome());
        System.out.println(", Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " de altura");
        System.out.println("pesando " + this.getPeso() + "kg");
        System.out.println("Ganhou: " + this.getVitorias() + " lutas");
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("e teve " + this.getEmpates() + " lutas empatadas");
    }

    public void statusLutador() {
        System.out.println(this.getNome() + "é um peso" + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + "vezes");
        System.out.println("Perdeu " + this.getDerrotas() + "vezes");
        System.out.println("Empatou"+ this.getEmpates() + "vezes");
    }

    //

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria((char) peso);
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
        if (peso < 50.2) {
            categoria = 'I';
        } else if (peso <= 70.3){
            categoria = 'L';
        } else if (peso <= 89.9) {
            categoria = 'M';
        } else if (peso <= 120){
            categoria = 'P';
        } else categoria = 'I';
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }

}
