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
    public Rectangulo(Punto p1, Punto p2){
        super(p1);
        this.p2=p2;
    }

    @Override
    public double calcularArea() {
        double base = p2.getX()-posicion.getX();
        double altura= p2.getY()-posicion.getX();
        if(base<0)base=base*-1;
        if(altura<0)altura=altura*-1;
        return base * altura;
    }
    
    

}
