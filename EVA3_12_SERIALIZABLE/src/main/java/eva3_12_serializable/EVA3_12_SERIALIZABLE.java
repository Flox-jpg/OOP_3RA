package eva3_12_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EVA3_12_SERIALIZABLE {

    public static void main(String[] args) {
    try{
       escribirArchObj();
       leerArchObj();
    } catch(IOException | ClassNotFoundException ex){
        System.out.println("error");    
    }
    }
    
public static void leerArchObj() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream in =
        new FileInputStream("C:\\archivos de txto\\Objeto perron.poo");
            ObjectInputStream leerArch =
            new ObjectInputStream(in);
            while(true){
               Persona perso = (Persona) leerArch.readObject();
               System.out.println(perso);
            }
   }
    
    public static void escribirArchObj()throws IOException {
        FileOutputStream out =
        new FileOutputStream ("C:\\archivos de txto\\Objeto perron.poo", true);
        ObjectOutputStream guardarObj =
        new ObjectOutputStream(out);
        guardarObj.writeObject(new Persona("juan", "perez", 50));
        guardarObj.writeObject(new Persona("susana", "ramirez", 35));
        guardarObj.writeObject(new Persona("luis", "sanchez", 40));
       
         
    }

}

class Persona implements Serializable{
private String nombre;
private String apellido;
private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
@Override
    public String toString(){
        return "nombre: " + nombre + "\n" +
                "apellido: " + apellido + "\n" +
                "edad: " + edad;
    
    }

}
