package torneo;
public class TecnoLand {
    private int edicion;
    private Juego[] vJuegos;
    
    public TecnoLand() {
     edicion=2017;
     vJuegos= new Juego[5];

    }

    public TecnoLand(int edicion) {
        this.edicion = edicion;
        this.vJuegos =new Juego[5];
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
    
    public boolean añadirJuego(String nombreJuego){
        for (int i = 0; i < vJuegos.length; i++) {
            if(vJuegos[i]==null){
                vJuegos[i] = new Juego(nombreJuego);
                return true;
            }  
        }
        return false;
    }
    public void mostrarJuegos(){
        for (int i = 0; i < vJuegos.length; i++) {
            if (vJuegos[i]!=null) 
                System.out.println(vJuegos[i].getNombre());
        }   
    }
    
    public Juego seleccionarJuego(String nombre){
        for (int i = 0; i < vJuegos.length; i++) {
            if((vJuegos[i]!=null)&&(vJuegos[i].getNombre().equalsIgnoreCase(nombre))){
                return vJuegos[i];
            }
        }
        return null;
    }
}
