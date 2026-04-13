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
public class RectanguloTest {
    @Test
    public void testCalcularArea() {
        Rectangulo r = new Rectangulo(new Punto(0,0), new Punto(4,5));
        assertEquals(20, r.calcularArea());
    }

    @Test
    public void testContienePunto() {
        Rectangulo r = new Rectangulo(new Punto(0,0), new Punto(4,5));
        Punto p = new Punto(2,3);

        assertTrue(r.contienePunto(p));
    }

    @Test
    public void testNoContienePunto() {
        Rectangulo r = new Rectangulo(new Punto(0,0), new Punto(4,5));
        Punto p = new Punto(10,10);

        assertFalse(r.contienePunto(p));
    }

    @Test
    public void testMoverHorizontal() {
        Rectangulo r = new Rectangulo(new Punto(0,0), new Punto(4,5));
        
        r.mover(5, true);

        assertEquals(5, r.getPosicion().getX());
    }

    @Test
    public void testEscalar() {
        Rectangulo r = new Rectangulo(new Punto(0,0), new Punto(2,2));

        r.cambiarEscala(2);

        assertEquals(16, r.calcularArea());
    }
}
