package carro_motor_roda;

import java.time.LocalDate;
import java.util.ArrayList;

public class Motor {

    private String marcaMotor;
    private int anoMotor;
    private int potencia;

    public Motor(String marcaMotor, int anoMotor, int potencia){
        this.marcaMotor = marcaMotor;
        this.anoMotor = anoMotor;
        this.potencia = potencia;

    }

    public void getAno(int ano){
        this.anoMotor = ano;
    }

}
