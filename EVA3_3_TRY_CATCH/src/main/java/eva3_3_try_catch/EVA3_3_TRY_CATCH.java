package eva3_3_try_catch;

/**
 *
 * @author alexi
 */
public class EVA3_3_TRY_CATCH {

    public static void main(String[] args) {
        
       
        
        try{//bloque donde intentamos ejecutar el codigo
            //que potencialmente genera una excepción
           int x = 5, y = 0;
           int resu = x / y;
           System.out.println("Resultado = " + resu);
        }catch(ArithmeticException e){
            //aqui tenemos que resolver la excepción
           e.printStackTrace();
        }
        System.out.println("Termina el programa");
    }
}
