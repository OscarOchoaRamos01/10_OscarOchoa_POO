/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S03_10;

/**
 *
 * @author RYZEN
 */
public class S03_10_whitch {
    public static void main(String[] args){
        String a ="Casaca";
        
        switch(a){
            case "polo":
                System.out.println("Esta agarrando polo");
                break;
            case "pantalon":
                System.out.println("Esta agarrando una casaca");
                break;
            default:
                System.out.println("No esta la prenda");
                break;
        }
    }
}
