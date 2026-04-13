/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author crstc
 */
public class CuadradoTest {
    
    @Test
    public void testCalcularArea() {
        Cuadrado c = new Cuadrado(new Punto(0,0), 4);

        assertEquals(16, c.calcularArea());
    }

    @Test
    public void testEsUnRectangulo() {
        Cuadrado c = new Cuadrado(new Punto(0,0), 4);

        assertTrue(c instanceof Rectangulo);
    }

    @Test
    public void testLadoCorrecto() {
        Cuadrado c = new Cuadrado(new Punto(0,0), 5);

        double lado = c.getP2().getX() - c.getPosicion().getX();

        assertEquals(5, lado);
    }

    @Test
    public void testContienePunto() {
        Cuadrado c = new Cuadrado(new Punto(0,0), 4);
        Punto p = new Punto(2,2);

        assertTrue(c.contienePunto(p));
    }

    @Test
    public void testMoverCuadrado() {
        Cuadrado c = new Cuadrado(new Punto(0,0), 4);

        c.mover(3, true); 

        assertEquals(3, c.getPosicion().getX());
    }
}
