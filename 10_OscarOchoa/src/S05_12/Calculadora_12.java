/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S05_12;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab4
 */
public class Calculadora_12 {
    
    //atributos (Caracteristica)
    int num1;
    int num2;
    int suma;
    int resta;
    
    //metodos (acciones)
    
    public void  sumar (){
        suma = num1 + num2;
    }
    public void  restar (){
        resta = num1 - num2;
    }
    public void ingresarDatos(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo numero: "));
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "la suma es " + suma + "\n La resta es" + resta);
    }
}
//}@
