
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

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
    
    @Test
    public void testEntTriangulo() {
        EntTriangulo instancia = new EntTriangulo();
        assertTrue((instancia.getAltura()==0 && instancia.getBase() == 0));
    }
}
