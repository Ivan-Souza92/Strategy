import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaTest {

    @Test
    void CalculoDescontoSimples(){

        Loja loja = new Loja();
        loja.descontoSimples(140.0f);
        assertEquals(133.0f, loja.getValor());
    }

    @Test
    void CalculoDescontoPremium(){

        Loja loja = new Loja();
        loja.descontoPremium(540.0f);
        assertEquals(432.0f, loja.getValor());
    }


}