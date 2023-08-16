
package com.mycompany.guia3.ejercicio3;


public class Guia3Ejercicio3 {

    public static void main(String[] args) {
        
        
    Auto auto = new Auto("Rojo", "ABC123");
    
    Rueda ruedaDelanteraIzquierda = auto.getRuedaDelanteraIzquierda();
    Rueda ruedaDelanteraDerecha = auto.getRuedaDelanteraDerecha();
    Rueda ruedaTraseraIzquierda = auto.getRuedaTraseraIzquierda();
    Rueda ruedaTraseraDerecha = auto.getRuedaTraseraDerecha();
    System.out.println("Rueda Delantera Izquierda");
    ruedaDelanteraIzquierda.inflar();
    System.out.println("");
    System.out.println("Rueda Delantera Derecha");
    ruedaDelanteraDerecha.desinflada();
    System.out.println("");
    System.out.println("Rueda Trasera Izquierda");
    ruedaTraseraIzquierda.pinchar();
    System.out.println("");
    System.out.println("Rueda Trasera Derecha");
    ruedaTraseraDerecha.inflar();
    System.out.println("");
    auto.avanzar(50);
    auto.retroceder(20);
    
    auto.llenarTanque();
}
        
        
}
