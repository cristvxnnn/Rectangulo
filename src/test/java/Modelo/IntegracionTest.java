
package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegracionTest {

    @Test
    public void testRectanguloYCuadrado() {
        Rectangulo r = new Rectangulo(new Punto(0,0), new Punto(4,5));
        Cuadrado c = new Cuadrado(new Punto(1,1), 3);

        double areaTotal = r.calcularArea() + c.calcularArea();

        assertEquals(20 + 9, areaTotal);
    }
}