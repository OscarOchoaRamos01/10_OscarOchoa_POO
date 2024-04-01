/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S05_12;

/**
 *
 * @author Lab4
 */
public class Main_S05_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //crear calculadora
        
        Calculadora_12 obj1 = new Calculadora_12();
        
        obj1.ingresarDatos();
        obj1.sumar();
        obj1.restar();
        obj1.mostrarDatos();
        
                
        
        /*
        Persona_12 persona2 = new Persona_12();
        
        persona2.altura = 1.90;
        persona2.apellido = "canales";
        persona2.dni = 98998989;
        persona2.edad = 22;
        persona2.nombre = "jesus";
        persona2.saludar();
        */
    }
    
}
