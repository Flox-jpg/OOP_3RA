package eva3_1_unchecked_ex;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA3_1_UNCHECKED_EX {

    public static void main(String[] args) {
        
       //ARITMETIC EXCEPTION DIVISION ENTRE CERO 
       /* int x = 5, y = 0;
        int resu = x / y;
        System.out.println("Resultado = " + resu);*/
        
    
        
        //NULL POINTER EXCEPTION
        
       /* Prueba prueba = null;
        prueba.toString();*/
        

        
        //INDEXOUTOFBOUNDS EXCEPTION
        //ARREGLOS: LEER UNA POSICIÓN QUE NO EXISTE
        /*int[] arreglo = new int[5];//0, 1, 2, 3, 4
        System.out.println(arreglo[10]);*/
        
        //INPUTMISMATCH EXCEPTION
        //PIDEN UN DATO DE UN TIPO Y LES MANDAN OTRO DIFERENTE
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce un número entero: ");
        int valor = captu.nextInt();
        
        System.out.println("valor: " + valor);
        
    
    
        System.out.println("fin del programa¡¡");
    }
}

class prueba{}


