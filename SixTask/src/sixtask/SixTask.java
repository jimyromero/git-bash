
package sixtask;


public class SixTask {

    public static void main(String[] args) {
        Persona doctor = new Doctor("Cirujano", "Alberto", "Doctor", 35);
        Persona deportista = new Deportista(5, "Nadador Olimpico", "Esteban", 23);
        
        System.out.println(doctor.presentacion());
        System.out.println("");
        System.out.println(deportista.presentacion());
        
    }
}
