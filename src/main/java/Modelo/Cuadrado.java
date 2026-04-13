/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author crstc
 */
public class Cuadrado extends Rectangulo {
    private double lado;
    public Cuadrado(Punto p1, double lado){
        super(p1, new Punto(p1.getX()+ lado, p1.getY()+lado));
        this.lado=lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
    public double getLado(){
        return lado;
    }

    @Override
    public String toString() {
        return super.toString()+"[Cuadrado, lado: "+ lado +"]"; 
    }

    
}
