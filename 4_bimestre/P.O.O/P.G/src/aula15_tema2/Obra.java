package aula15_tema2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Obra {

    LocalDate dataDeInicio;
    LocalDate dataDeTerminoPrevista;
    LocalDate dataDeTerminoReal;



    public Obra(LocalDate dataDeInicio, LocalDate dataDeTerminoPrevista, LocalDate dataDeTerminoReal) {
        this.dataDeInicio = dataDeInicio;
        this.dataDeTerminoPrevista = dataDeTerminoPrevista;
        this.dataDeTerminoReal = dataDeTerminoReal;
    }



    public LocalDate getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(LocalDate dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public LocalDate getDataDeTerminoPrevista() {
        return dataDeTerminoPrevista;
    }

    public void setDataDeTerminoPrevista(LocalDate dataDeTerminoPrevista) {
        this.dataDeTerminoPrevista = dataDeTerminoPrevista;
    }

    public LocalDate getDataDeTerminoReal() {
        return dataDeTerminoReal;
    }

    public void setDataDeTerminoReal(LocalDate dataDeTerminoReal) {
        this.dataDeTerminoReal = dataDeTerminoReal;
    }
}
