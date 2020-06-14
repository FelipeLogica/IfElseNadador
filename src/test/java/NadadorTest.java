import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 21:10
 * @category Test
 */
class NadadorTest {

    Nadador nadador = new Nadador();

    @org.junit.jupiter.api.Test
    void verificarIdade() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    /**
     * Testa o metodo verificarIdade()
     */
    @Test
    public void testarVerificarIdade() {
        nadador.setIdade(7);
        assertEquals("Muito novo para nadar.", nadador.verificarIdade());

        nadador.setIdade(9);
        assertEquals("Apto para natação infantil.", nadador.verificarIdade());

        nadador.setIdade(13);
        assertEquals("Apto para natação juvenil.", nadador.verificarIdade());

        nadador.setIdade(18);
        assertEquals("Apto para natação adulta.", nadador.verificarIdade());

        nadador.setIdade(110);
        assertEquals("Idade inválida.", nadador.verificarIdade());

    }

    /**
     * Testa o metodo tostring()
     */
    @Test
    public void testarToString() {
        nadador.setNome("Daniel Teles");
        nadador.setIdade(18);
        assertEquals("\nNome do nadador: Daniel Teles\nIdade do nadador: 18\nSituação: Apto para natação adulta.", nadador.toString());
    }
}