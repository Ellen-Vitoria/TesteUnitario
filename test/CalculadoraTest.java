import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora c = new Calculadora();

    @Test
    void testaAdicao() {
        c.setNum1(10); c.setNum2(12);
        assertEquals(22, c.adicao());
    }

    @Test
    void testaSubtracao() {
        c.setNum1(50); c.setNum2(38);
        assertEquals(12, c.subtracao());
    }

    @Test
    void testaMultiplicacao() {
        c.setNum1(11); c.setNum2(11);
        assertEquals(121, c.multiplicacao());
    }

    @Test
    void testaDivisao() {
        c.setNum1(100); c.setNum2(25);
        assertEquals(4, c.divisao());
    }

    @Test
    void testaDivisaoPorZero() {
        c.setNum1(32); c.setNum2(0);
        assertEquals(-1, c.divisao());
    }
}