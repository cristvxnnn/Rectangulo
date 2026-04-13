/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Modelo;

/**
 *
 * @author crstc
 */
public class Rectangulo extends Figura {

    private Punto p2;

    public Rectangulo(Punto p1, Punto p2) {
        super(p1);
        this.p2 = p2;
    }

    @Override
    public double calcularArea() {
        double base = p2.getX() - posicion.getX();
        double altura = p2.getY() - posicion.getX();
        if (base < 0) {
            base = base * -1;
        }
        if (altura < 0) {
            altura = altura * -1;
        }
        return base * altura;
    }

    public void cambiarEscala(double escala) {
        double nuevoX2 = posicion.getX() + (p2.getX() - posicion.getX()) * escala;//mantiene fijo el p1 y mueve el p2, la idea es...
        //... que si la escala es 2, el rectangulo se hace el doble de grande manteniendo p1 su posicion original
        double nuevoY2 = posicion.getY() + (p2.getY() - posicion.getY()) * escala;
        p2.setX(nuevoX2);
        p2.setY(nuevoY2);
    }

    public boolean contienePunto(Punto p) {
        double minX = posicion.getX(), maxX = p2.getX();
        double minY = posicion.getY(), maxY = p2.getY();
        if (minX > maxX) {
            double temp = minX;
            minX = maxX;
            maxX = temp;
        }
        if (minY > maxY) {
            double temp = minY;
            minY = maxY;
            maxY = temp;
        }
        return p.getX() >= minX && p.getX() <= maxX && p.getY() >= minY && p.getY() <= maxY;

    }

    public void mover(double unidades, boolean horizontal) {
        if (horizontal) {
            posicion.setX(posicion.getX() + unidades);
            p2.setX(p2.getX() + unidades);
        } else {
            posicion.setY(posicion.getY() + unidades);
            p2.setY(p2.getY() + unidades);
        }
    }
    public void mover(double unidadesX, double unidadesY){
        posicion.setX(posicion.getX()+unidadesX);
        p2.setX(p2.getX()+unidadesX);
        posicion.setY(posicion.getY()+unidadesY);
        p2.setY(p2.getY()+unidadesY);
    }
    public Punto getP2(){
        return p2;
    }
    public void setP2(Punto p2){
        this.p2=p2;
    }

    @Override
    public String toString() {
        return super.toString()+"- Recntangulo: "+posicion+"-"+ p2+ "| Area: "+ calcularArea();
    }
    

}
