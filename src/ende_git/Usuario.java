package refactorizacion3;

/**
 *
 * @author Vanesa
 */
public class Usuario extends Persona{
    private byte edad;
    private static byte contUsuarios=0;

    public Usuario(byte edad, short id, String nombre, String apellidos) {
        super(id, nombre, apellidos);
        this.edad = edad;
        contUsuarios++;
    }
    //Metodo para devolver edad
    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
    
    //@Override
    public void getInfo() {
        System.out.print("El usuario: "+this.nombre+" "+this.apellidos+" con id: "+this.id
        +" tiene "+edad+" años");
    }
    
    public String toString(){
        return "El usuario: "+this.nombre+" "+this.apellidos+" con id: "+this.id
        +" tiene "+edad+" años";
    }

}


        

