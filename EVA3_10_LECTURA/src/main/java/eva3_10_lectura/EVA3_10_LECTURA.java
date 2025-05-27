package eva3_10_lectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author alexi
 */
public class EVA3_10_LECTURA {

    public static void main(String[] args) {
       
        String ruta = "C:\\archivos de txto\\lololo.txt";
        try{
        readUsingFiles(ruta);//Files: recomendado para leer archivos pequeños, lle todo el archivo de golpe
        readUsingScanner(ruta);//scanner: recomendado cuando necesitemos leer tokens()
        readUsingBufferedReader(ruta);//lee a travez de streams, recomendable con multitarea
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


public static void readUsingFiles(String ruta) throws IOException{
    System.out.println("Lectura de archivos usando files");
    Path path = Paths.get(ruta);
    String cade = Files.readString(path);
    System.out.println(cade);

}

public static void readUsingScanner(String ruta) throws FileNotFoundException{
    System.out.println("lectura de archivos usando scanner");
    File source = new File(ruta);
    Scanner leerArch = new Scanner(source);
    String cade;
    while(leerArch.hasNextLine()){//inidca si llegamos al final del archivo
       cade =leerArch.nextLine();//lee la linea actual y nos mueve a la siguiente
       System.out.println(cade);
}
leerArch.close();
}

public static void readUsingBufferedReader(String ruta) throws FileNotFoundException, IOException{
   System.out.println("lectura de archivos usando buffered");
   File file = new File(ruta);
   FileInputStream inStream = new FileInputStream(file); 
   InputStreamReader in = new InputStreamReader(inStream);
   BufferedReader leerTxt = new BufferedReader(in);
   String cade;
   //asigno el contenido del archivos a cade, luego evaluo cade !=null
   while((cade = leerTxt.readLine()) != null){
       System.out.println(cade);
   }
leerTxt.close();
}


































}