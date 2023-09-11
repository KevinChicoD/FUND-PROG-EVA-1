/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_SALIDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. Declaracion
        String nombre;
        String apellidos;
        int semestre;
        Scanner captura = new Scanner(System.in);
        //; fin de instruccion en java
        //2. Captura de variable
        System.out.println("Introduzca su nombre:");
        nombre = captura.nextLine();
        System.out.println("Introduzca su apellido:");
        apellidos = captura.nextLine();
        System.out.println("Introduzca su semestre:");
        semestre = captura.nextInt();
        // Java es sencible a mayusculas y minusculas
        // Es decir: es diferente System que sistem
        //3. Mostrar los datos
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(semestre);
        
    }
    
}
