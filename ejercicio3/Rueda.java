
package com.mycompany.guia3.ejercicio3;


public class Rueda {

    private String marca;
    private double presion;

    public Rueda() {
        this.presion = 28.0;
    }

    // Getters y setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }
    
    public void inflar() {
        presion = 28.0;
        System.out.println("La rueda ha sido inflada. Presión: " + presion + " PSI");
    }

    public void pinchar() {
        presion = 0;
        System.out.println("La rueda ha sido pinchada. Presión: " + presion + " PSI");
    }

    public void desinflada() {
        presion = -0.5;
        System.out.println("La rueda ha sido desinflada. Presión: " + presion + " PSI");
    }
    
}