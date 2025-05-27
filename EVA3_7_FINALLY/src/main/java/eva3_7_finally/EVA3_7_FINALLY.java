/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eva3_7_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA3_7_FINALLY {

    public static void main(String[] args) {
        try{
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce un valor entero: ");
        int valor = captu.nextInt();
        System.out.println("El valor capturado es: " + valor);
    }catch(InputMismatchException e){
        System.out.println("El valor introduciodo no es un entero");
}finally{
    
   System.out.println("esta linea siempre se va a ejecutar");
        
    }
System.out.println("Fin del programa");
}
}
