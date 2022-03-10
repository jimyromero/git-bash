
package sixtask;



public class Persona {

    protected String nombre;
    protected String profesion;
    protected int edad;

    public Persona(String nombre, String profesion, int edad) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre ;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String presentacion(){
        return "Hola, soy una persona.";
    }

}
