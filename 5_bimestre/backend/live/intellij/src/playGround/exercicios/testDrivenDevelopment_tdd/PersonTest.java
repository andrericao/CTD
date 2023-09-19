package playGround.exercicios.testDrivenDevelopment_tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

class PersonTest {

    @Test
    @DisplayName("Teste co pessoa menor de idade => DEVE RETORNAR FALSE")
    public void conferirMaiorIdadeSendoMenor() {

        // GIVEN
        LocalDate dataNascimento = LocalDate.of(2020, Month.JUNE, 6);
        Person noah = new Person("Noah".toLowerCase(Locale.ROOT), "Paulo", "noahpp@gmail.com", dataNascimento);

        // WHEN
        boolean conferirMaiorIdade = noah.conferirMaiorIdade();

        // THEN
        Assertions.assertFalse(conferirMaiorIdade);
        Assertions.assertEquals(dataNascimento, noah.getDataNascimento());
    }

    @Test
    @DisplayName("Teste com pessoa maior de idade => DEVE RETORNAR TRUE")
    public void conferirMaiorIdadeSendoMaior() {

        // GIVEN
        LocalDate dataNascimento = LocalDate.of(1996, Month.MAY, 11);
        String nome = "Nathalia";
        Person nathalia = new Person(nome, "Paulo", "nathaliamp@gmail.com", dataNascimento);

        // WHEN
        boolean conferirMaiorIdade = nathalia.conferirMaiorIdade();

        // THEN
        Assertions.assertTrue(conferirMaiorIdade);

        Assertions.assertEquals(nome.toLowerCase(Locale.ROOT), nathalia.getNome());
        Assertions.assertEquals(dataNascimento, nathalia.getDataNascimento());
    }
}