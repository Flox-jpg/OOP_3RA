/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eva3_5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA3_5_TRY_CATCH {

    public static void main(String[] args) {
        
        try{
            int[] datos = new int[5];
            datos[7] = 0;
            int x = 7, y = 0;
            int resu = x / y;
            
            Scanner captu = new Scanner (System.in);
            System.out.println("introduce un número: ");
            int nume = captu.nextInt();
        }catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch(ArithmeticException e) {
            e.printStackTrace();
        }catch(InputMismatchException e){
        }
            
    }
}
