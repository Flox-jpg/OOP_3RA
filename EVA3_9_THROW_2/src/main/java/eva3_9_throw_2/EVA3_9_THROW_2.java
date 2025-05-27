package eva3_9_throw_2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_9_THROW_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = null;
        try {
            perso = new Persona("Juan","Perez Jolote", -1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(perso);
    }
    
}

class Persona{
private String nombre;
private String apellido;
private int edad;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) throws Exception {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
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

    public void setEdad(int edad) throws Exception {
        if (edad < 0)
            throw new Exception("La edad no puede ser negativa!!");
        else 
            this.edad = edad;
    }


@Override
public String toString(){
return "DATOS DE LA PERSONA:" + "\n" + "Nombre: " + nombre + "\n" + "Apellido" + apellido + "\n" + "Edad: " + edad;
        }

}