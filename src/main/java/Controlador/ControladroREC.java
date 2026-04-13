package Controlador;

import Modelo.*;

public class ControladroREC {

    private Rectangulo rectangulo;

    public ControladroREC() {
        this.rectangulo = null;
    }

    public String crearRectangulo(double x1, double y1, double x2, double y2) {
        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto(x2, y2);
        rectangulo = new Rectangulo(p1, p2);
        return "Rectangulo creado!\n    P1: " + p1.toString() + " P2: " + p2.toString();
    }

    public String calcularArea() {
        if (rectangulo == null) {
            return "Primero crea un rectangulo";
        }
        return "Area: " + rectangulo.calcularArea();

    }

    public String aplicarEscala(double escala) {
        if (rectangulo == null) {
            return "Primero crea un rectangulo!";
        }
        rectangulo.cambiarEscala(escala);
        return "Escala aplicadan\n" + rectangulo.toString();
    }

    public String moverHorizontal(double unidades) {
        if (rectangulo == null) {
            return "Primero crea un rectangulo!";
        }
        rectangulo.mover(unidades, true); // 👈 falta esto
        return "Rectangulo movido\n" + rectangulo.toString();
    }

    public String moverVertical(double unidades) {
        if (rectangulo == null) {
            return "Primero crea un rectangulo!";
        }
        rectangulo.mover(unidades, false); // 👈 falta esto
        return "Rectangulo movido\n" + rectangulo.toString();
    }

    public String contienePunto(double x, double y) {
        if (rectangulo == null) {
            return "Primero crea un rectángulo!";
        }
        Punto p = new Punto(x, y);
        boolean contiene = rectangulo.contienePunto(p);
        return contiene ? "El punto SI está dentro del rectángulo" : "El punto NO está dentro del rectángulo";
    }
}
