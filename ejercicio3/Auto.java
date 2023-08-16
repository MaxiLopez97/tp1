
package com.mycompany.guia3.ejercicio3;
public class Auto {
    private String color;
    private String patente;
    private double combustible;
    private Rueda ruedaDelanteraIzquierda;
    private Rueda ruedaDelanteraDerecha;
    private Rueda ruedaTraseraIzquierda;
    private Rueda ruedaTraseraDerecha;

    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
        this.combustible = 50.0;
        this.ruedaDelanteraIzquierda = new Rueda();
        this.ruedaDelanteraDerecha = new Rueda();
        this.ruedaTraseraIzquierda = new Rueda();
        this.ruedaTraseraDerecha = new Rueda();
    }

    // Getters y setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public Rueda getRuedaDelanteraIzquierda() {
        return ruedaDelanteraIzquierda;
    }

    public void setRuedaDelanteraIzquierda(Rueda ruedaDelanteraIzquierda) {
        this.ruedaDelanteraIzquierda = ruedaDelanteraIzquierda;
    }

    public Rueda getRuedaDelanteraDerecha() {
        return ruedaDelanteraDerecha;
    }

    public void setRuedaDelanteraDerecha(Rueda ruedaDelanteraDerecha) {
        this.ruedaDelanteraDerecha = ruedaDelanteraDerecha;
    }

    public Rueda getRuedaTraseraIzquierda() {
        return ruedaTraseraIzquierda;
    }

    public void setRuedaTraseraIzquierda(Rueda ruedaTraseraIzquierda) {
        this.ruedaTraseraIzquierda = ruedaTraseraIzquierda;
    }

    public Rueda getRuedaTraseraDerecha() {
        return ruedaTraseraDerecha;
    }

    public void setRuedaTraseraDerecha(Rueda ruedaTraseraDerecha) {
        this.ruedaTraseraDerecha = ruedaTraseraDerecha;
    }
    
    public void avanzar(int metros) {
        double combustibleConsumido = 0.1 * metros ;
        if (combustible >= combustibleConsumido) {
            combustible -= combustibleConsumido;
            System.out.println("El auto ha avanzado " + metros + " metros.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar esa distancia.");
        }
    }

    public void retroceder(int metros) {
        double combustibleConsumido = 0.1 * metros ;
        if (combustible >= combustibleConsumido) {
            combustible -= combustibleConsumido;
            System.out.println("El auto ha retrocedido " + metros + " metros.");
        } else {
            System.out.println("No hay suficiente combustible para retroceder esa distancia.");
        }
    }

    public void llenarTanque() {
        combustible = 50.0;
        System.out.println("Se ha llenado el tanque del auto con un total de: "+combustible);
    }
    
    
    
}