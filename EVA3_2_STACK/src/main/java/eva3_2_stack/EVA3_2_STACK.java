package eva3_2_stack;

/**
 *
 * @author alexi
 */
public class EVA3_2_STACK {

    public static void main(String[] args) {
        //todo code application logic here
        System.out.println("Inicia Main");
        A();
        System.out.println("Termina Main");  
    }
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");  
    }
    public static void B(){
        System.out.println("Inicia B");
        C();
        System.out.println("Termina B");
    }
    public static void C(){
        System.out.println("Inicia B");
        int x =5, y = 0;
        int resu = x / y; //dividir entre cero
        System.out.println("Resultado: " + resu);
        System.out.println("Termina B");
    }
}
