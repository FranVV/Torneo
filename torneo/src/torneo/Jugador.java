package torneo;
public class Jugador {
    private String nombre;
    private int edad, puntuacion;

    public Jugador() {
        this.nombre="";
        this.edad=18;
        this.puntuacion=0;
    }

    public Jugador(String nombre, int edad, int puntuacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.puntuacion = puntuacion;
    }
    public String toString(){
        return "Nombre: "+this.getNombre()+"\n"+
                 "Edad: "+this.getEdad()+"\n"+
                 "Puntuacion: "+this.getPuntuacion()+"\n"+
                 "-------------------------------------"+"\n";
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the puntuacion
     */
    public int getPuntuacion() {
        return puntuacion;
    }

    /**
     * @param puntuacion the puntuacion to set
     */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
}
