package torneo;
public class TecnoLand {
    private int edicion;
    private Juego[] vJuegos;
    
    public TecnoLand() {
     edicion=2017;
     vJuegos= new Juego[5];

    }

    public TecnoLand(int edicion, Juego[] vJuegos) {
        this.edicion = edicion;
        this.vJuegos = vJuegos;
    }
    
    

    /**
     * @return the edicion
     */
    public int getEdicion() {
        return edicion;
    }

    /**
     * @param edicion the edicion to set
     */
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    /**
     * @return the vJuegos
     */
    public Juego[] getvJuegos() {
        return vJuegos;
    }

    /**
     * @param vJuegos the vJuegos to set
     */
    public void setvJuegos(Juego[] vJuegos) {
        this.vJuegos = vJuegos;
    }
    
}
