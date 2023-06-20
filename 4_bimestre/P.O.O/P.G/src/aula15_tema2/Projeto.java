package aula15_tema2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Projeto {

    private static int proximoNumero = 1;
    private static int proximoNumeroDaObra = 1;
    private Integer numeroDaObra;
    private Integer numeroDoProjeto;
    private String nomeDoProjeto;
    private String cidadeDoProjeto;
    private String statusDoProjeto;
    private ProjetoResidencial projetoResidencial;
    private ProjetoDepartamental projetoDepartamental;
    private Obra obra;
    private List<Obra> obras;
    private ArrayList<Projeto> listaDeProjetos= new ArrayList<>();

    public Projeto(String nomeDoProjeto, String cidadeDoProjeto, Obra obra) {
        this.numeroDaObra = proximoNumeroDaObra++;
        this.numeroDoProjeto = proximoNumero++;
        this.nomeDoProjeto = nomeDoProjeto;
        this.cidadeDoProjeto = cidadeDoProjeto;
        this.obra = obra;
        this.obras = new LinkedList<>();
        this.obras.add(obra);
    }

    public void addObra(Obra obra) {
        obras.add(obra);
    }

    public Integer getNumeroDaObra() {
        return numeroDaObra;
    }

    public void setNumeroDaObra(Integer numeroDaObra) {
        this.numeroDaObra = numeroDaObra;
    }

    String indicarStatus() {
        LocalDate currentDate = LocalDate.now();

        for (Obra obra : obras) {
            LocalDate dataDeInicio = obra.getDataDeInicio();
            LocalDate dataDeTerminoReal = obra.getDataDeTerminoReal();

            if (dataDeInicio.isAfter(currentDate)) {
                return "Status: Calculando...";
            } else if (dataDeInicio.isBefore(currentDate) || dataDeInicio.isEqual(currentDate)) {
                if (dataDeTerminoReal != null && dataDeTerminoReal.isBefore(currentDate)) {
                    return "Status: Acabado.";
                } else {
                    return "Status: Em construção.";
                }
            }
        }
        return "Status: Calculando...";
    }

    public static int getProximoNumero() {
        return proximoNumero;
    }

    public static void setProximoNumero(int proximoNumero) {
        Projeto.proximoNumero = proximoNumero;
    }

    public static int getProximoNumeroDaObra() {
        return proximoNumeroDaObra;
    }

    public static void setProximoNumeroDaObra(int proximoNumeroDaObra) {
        Projeto.proximoNumeroDaObra = proximoNumeroDaObra;
    }

    public Integer getNumeroDoProjeto() {
        return numeroDoProjeto;
    }

    public void setNumeroDoProjeto(Integer numeroDoProjeto) {
        this.numeroDoProjeto = numeroDoProjeto;
    }

    public String getNomeDoProjeto() {
        return nomeDoProjeto;
    }

    public void setNomeDoProjeto(String nomeDoProjeto) {
        this.nomeDoProjeto = nomeDoProjeto;
    }

    public String getCidadeDoProjeto() {
        return cidadeDoProjeto;
    }

    public void setCidadeDoProjeto(String cidadeDoProjeto) {
        this.cidadeDoProjeto = cidadeDoProjeto;
    }

    public String getStatusDoProjeto() {
        return statusDoProjeto;
    }

    public void setStatusDoProjeto(String statusDoProjeto) {
        this.statusDoProjeto = statusDoProjeto;
    }

    public ProjetoResidencial getProjetoResidencial() {
        return projetoResidencial;
    }

    public void setProjetoResidencial(ProjetoResidencial projetoResidencial) {
        this.projetoResidencial = projetoResidencial;
    }

    public ProjetoDepartamental getProjetoDepartamental() {
        return projetoDepartamental;
    }

    public void setProjetoDepartamental(ProjetoDepartamental projetoDepartamental) {
        this.projetoDepartamental = projetoDepartamental;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public List<Obra> getObras() {
        return obras;
    }

    public void setObras(List<Obra> obras) {
        this.obras = obras;
    }
}


