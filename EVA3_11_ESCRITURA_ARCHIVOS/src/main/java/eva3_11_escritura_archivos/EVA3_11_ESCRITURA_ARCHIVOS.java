package eva3_11_escritura_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EVA3_11_ESCRITURA_ARCHIVOS {


    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "c:\\archivos de txto\\";
        try {
            writeUsingFiles(ruta, "Hola mundo! \n Escribiendo archivos con FILES!!");
            writeUsingFileWriter(ruta, "Hello World! \n Escribiendo archivos con FILES!!");
            writeUsingBufferedwriter(ruta);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void writeUsingFiles(String ruta, String texto) throws IOException{
        System.out.println("ESCRIBIR USANDO FILES");
        Path path = Paths.get(ruta + "files.txt");
        Files.write(path, texto.getBytes()); //el texto se guarda
        
    }
    public static void writeUsingFileWriter(String ruta, String texto) throws IOException{
        System.out.println("ESCRIBIRUSANDO FILEWRITER");
        File file = new File(ruta + "filewriter.txt");
        FileWriter escArch = new FileWriter(file);
        escArch.write(texto);
        escArch.close();       
    }
    
    public static void writeUsingBufferedwriter(String ruta) throws IOException{
        System.out.println("escribiendo con buffered writer");
        File file = new File(ruta + "bufferedwriter.txt");
        FileWriter out = new FileWriter(file);
        BufferedWriter escArch = new BufferedWriter(out);
        for (int i = 0; i < 10; i++ ){
            escArch.write("escritura usando buffered writer");
            escArch.write("\n");
        }
        escArch.close();
    }
}