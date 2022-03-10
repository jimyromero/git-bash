
package sixtask;


public class Deportista extends Persona{
    protected int trofeo;

    public Deportista(int trofeo, String nombre, String profesion, int edad) {
        super(nombre, profesion, edad);
        this.trofeo = trofeo;
    }

    public int getTrofeo() {
        return trofeo;
    }

    public void setTrofeo(int trofeo) {
        this.trofeo = trofeo;
    }
    
    @Override
    public String presentacion(){
        return "Hola, soy "+profesion
                +", me llamo "+nombre
                +" tengo "+edad
                +" anos de dad y cuento con "+trofeo
                +" reconocimientos.";
    }
    
}
