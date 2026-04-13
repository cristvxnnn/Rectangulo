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
public class FiguraTest {
    

    @Test
    public void testGetX() {
        Punto p = new Punto(3,4);
        assertEquals(3, p.getX());
    }

    @Test
    public void testSetX() {
        Punto p = new Punto(3,4);
        p.setX(10);

        assertEquals(10, p.getX());
    }
}
