package refactorizacion3;

/**
 *
 * @author Vanesa
 */
abstract public class  Persona {
    protected short id;
    public String nombre;
    public String apellidos;

    public Persona(short id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }
 
    
    //public abstract void getInfo();
    
}
