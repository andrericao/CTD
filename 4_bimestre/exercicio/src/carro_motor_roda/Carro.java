package carro_motor_roda;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carro {

    private String marcaCarro;
    private String modeloCarro;
    private LocalDate anoCarro;

    private Motor motor;

    private ArrayList<Roda> roda = new ArrayList<>();

    public Carro(String marcaCarro, String modeloCarro, LocalDate anoCarro, Motor motor, ArrayList<Roda> roda ){
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.anoCarro = anoCarro;
        this.motor = motor;
        this.roda = roda;
    }

    public void getCarro(String marcaCarro){
        this.marcaCarro = marcaCarro;
    }



}
