package eva3_8_throw;

public class EVA3_8_THROW {

    public static void main(String[] args) {
        // TODO code application logic here
      try{  Persona perso = new Persona("Juan","Perez Jolote",-1);
        System.out.println(perso);
    }catch(RuntimeException e){
            System.out.println("Datos capturados de manera erronea");
}
     System.out.println("El programa sigue funcionando!!");      
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

    public Persona(String nombre, String apellido, int edad) {
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

    public void setEdad(int edad) {
        if (edad < 0)
            throw new RuntimeException("La edad no puede ser negativa!!");
        else 
            this.edad = edad;
    }


@Override
public String toString(){
return "DATOS DE LA PERSONA:" + "\n" + "Nombre: " + nombre + "\n" + "Apellido" + apellido + "\n" + "Edad: " + edad;
        }

}
