

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EntTrianguloTest {
    
    /**
     * Test do método getArea method, da classe EntTriangulo.
     */
    @Test
    public void testGetArea() {
        EntTriangulo instancia = new EntTriangulo(2.0, 3.0);
        double resultadoEsperado = 3.0;
        double resulto = instancia.getArea();
        assertEquals(resultadoEsperado, resulto, 0);             
    }       
}
