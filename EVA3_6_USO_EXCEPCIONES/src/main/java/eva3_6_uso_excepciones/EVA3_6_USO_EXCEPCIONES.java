package eva3_6_uso_excepciones;

import java.util.Scanner;

public class EVA3_6_USO_EXCEPCIONES {

    public static void main(String[] args) {
        int nume;
        Scanner captu = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce un número: ");
            if (captu.hasNextInt()) {
                nume = captu.nextInt();
                System.out.println("Número capturado: " + nume);
                break;
            } else {
                System.out.println("Eso no es un número, intenta de nuevo.");
                captu.next();
            }
        }

        captu.close();
    }
}

