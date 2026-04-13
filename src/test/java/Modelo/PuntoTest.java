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
public class PuntoTest {
    
    @Test
    public void testAreaCuadrado() {
        Cuadrado c = new Cuadrado(new Punto(0,0), 4);

        assertEquals(16, c.calcularArea());
    }

    @Test
    public void testHerenciaRectangulo() {
        Cuadrado c = new Cuadrado(new Punto(0,0), 4);

        assertTrue(c instanceof Rectangulo);
    }
}
