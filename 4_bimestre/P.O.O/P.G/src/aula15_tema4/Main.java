package aula15_tema4;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Proprietario proprietarioSandra = new Proprietario("Sandra", "Silva","02938473");
        Proprietario proprietarioCarlos = new Proprietario("Alex", "Silva", "297832729");
        Proprietario proprietarioPaulo = new Proprietario("Paulo", "Silva", "297834456");

        Carro carroDoCarlos = new Carro(proprietarioCarlos, LocalDate.of(2023,6,2),"Toyota", "Corolla", true, true, 1100);
        Caminhao caminhaoDaSandra = new Caminhao(proprietarioSandra, LocalDate.of(2022,4,1), "Mercedes", "Accelo", true, 10, 1);
        Caminhao caminhaoDoPaulo = new Caminhao(proprietarioPaulo, LocalDate.of(2020,4,1), "Mercedes", "Actros", true, 30, 5);

        System.out.println(carroDoCarlos.verificarEconomia());
        System.out.println(caminhaoDaSandra.comparandoCaminhoes(caminhaoDoPaulo));
        }
    }
