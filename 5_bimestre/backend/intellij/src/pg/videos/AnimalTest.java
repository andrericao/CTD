package pg.videos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    public void ClassificarAnimal(){
        Animal cavalo = new Animal ("Cavalo", "Grande", 750);
        Animal cachorro = new Animal ("Cachorro", "Pequeno", 8);

        boolean pesarCachorro = cachorro.pesarAnimal();

        assertEquals(true, cavalo.pesarAnimal());
        assertFalse(pesarCachorro);
    }
}