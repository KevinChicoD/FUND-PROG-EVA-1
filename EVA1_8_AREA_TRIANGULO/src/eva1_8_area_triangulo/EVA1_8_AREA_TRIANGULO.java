/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_8_AREA_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double area; //double numeros con punto decimal
        double altura;
        double base;
        Scanner captura = new Scanner(System.in);
        System.out.println("Escribe la altura de el triangulo:");
        altura = captura.nextDouble();
        System.out.println("Escribe la base de el triangulo:");
        base = captura.nextDouble();
        System.out.println("El area del triangulo es:");
        area = (base*altura)/2;
        System.out.println(area);
        
    }
    
} 