package pacientes;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        Paciente paciente = null;

        try {
             paciente = new Paciente("Juan","Perez","12345",
                      LocalDate.of(2022, Month.AUGUST,19));

        } catch (PacientesException e){
            System.err.println(e);
            return;
        }

        System.out.println(paciente);

        try {
            paciente.darAlta(LocalDate.of(2023,6,5));
        } catch (PacientesException e){
            System.err.println(e);
        }
    }

}
