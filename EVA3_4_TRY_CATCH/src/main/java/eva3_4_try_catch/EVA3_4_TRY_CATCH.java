package eva3_4_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA3_4_TRY_CATCH {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        try{
        System.out.println("intruduce un valor entero: ");
        int valor = captu.nextInt();
        System.out.print("El valor es = " + valor);
      }catch(InputMismatchException e){
          e.printStackTrace();
      }
       System.out.println("fin del programa");
      }
}

