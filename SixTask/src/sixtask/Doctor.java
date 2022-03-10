
package sixtask;


public class Doctor extends Persona {

    protected String especialidad;

    public Doctor(String especialidad, String nombre, String profesion, int edad) {
        super(nombre, profesion, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String presentacion() {
        return "Hola, soy " + profesion
                + ", me llamo " + nombre
                + ", tengo " + edad
                + " anos de edad y me especializo en "+especialidad ;
    }

}
