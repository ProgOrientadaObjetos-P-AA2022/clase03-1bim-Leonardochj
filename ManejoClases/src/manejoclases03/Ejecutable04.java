/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

/**
 *
 * @author reroes
 */
public class Ejecutable04 {
    
    public static void main(String[] args) {
    
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
        //Hospital h4 = new Hospital();
        
        double valor1 = 10000;
        double valor2 = 20000;
        double valor3 = 30000;
        int numeroCamas1 = 40;
        int numeroCamas2 = 50;
        int numeroCamas3 = 50;
        
        h1.establecerPresupuesto(valor1);
        h2.establecerPresupuesto(valor2);
        h3.establecerPresupuesto(valor3);
        
        h1.establecerNumeroCamas(numeroCamas1);
        h2.establecerNumeroCamas(numeroCamas2);
        h3.establecerNumeroCamas(numeroCamas3);
        
        double suma = h1.obtenerPresupuesto() + h2.obtenerPresupuesto() +
                h3.obtenerPresupuesto();
        
        int sumaCamas = h1.obtenerNumeroCamas() + h2.obtenerNumeroCamas() + 
                h3.obtenerNumeroCamas();
        
        System.out.printf("La suma de presupuestos es %.2f\nEl suma de camas "
                + "es %d\n", suma, sumaCamas);
        
        
    }
}
