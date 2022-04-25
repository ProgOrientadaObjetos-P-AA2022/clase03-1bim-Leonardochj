/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;


public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        
        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro Ayora";
        hospital.numeroCamas = 200;
        hospital.presupuesto = 752310.43;
        hospital.tipoHospital = "Público";
   
        Hospital hospital2 = new Hospital();
        hospital2.nombre = "Medilab";
        hospital2.numeroCamas = 300;
        hospital2.presupuesto = 768237.52;
        hospital2.tipoHospital = "Privado";
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f - %s\n%s - %d - %.2f - %s\n", 
                hospital.nombre, hospital.numeroCamas, hospital.presupuesto, 
                hospital.tipoHospital, hospital2.nombre, hospital2.numeroCamas,
                hospital2.presupuesto, hospital2.tipoHospital);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
    }
}
