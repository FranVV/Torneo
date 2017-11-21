package torneo;
public class Juego {
    private String nombre;
    private Jugador[] vParticipantes;

    public Juego() {
        this.nombre="";
        this.vParticipantes=new Jugador[6];
    }
    public Juego(String nombre) {
        this.nombre=nombre;
        this.vParticipantes=new Jugador[6];
        vParticipantes[0]=new Jugador("Juan",40,600);
        vParticipantes[1]=new Jugador("oa",20,500);
        vParticipantes[2]=new Jugador("pep",40,700);
    }

    public Juego(String nombre, Jugador[] vParticipantes) {
        this.nombre = nombre;
        this.vParticipantes = vParticipantes;
    }
    public String toString(){
        return "Nombre: "+this.nombre;
    }
    public Jugador[] ganadores() {
        Jugador vGanadores[]=new Jugador[3];
        int pMaxima=0;
        vGanadores[0]=getvParticipantes()[0];
        
        for (int i = 1; i < getvParticipantes().length; i++) {
           if ((vParticipantes[i]!=null)&&(getvParticipantes()[i].getPuntuacion()>vGanadores[0].getPuntuacion())){
               vGanadores[0]=getvParticipantes()[i];
           }
        }
        for (int i = 0; i < getvParticipantes().length; i++) {
           if ((vParticipantes[i]!=null)&&(getvParticipantes()[i].getPuntuacion()>pMaxima)&&(getvParticipantes()[i].getPuntuacion()<vGanadores[0].getPuntuacion())){
               vGanadores[1]=getvParticipantes()[i];
               pMaxima=vGanadores[1].getPuntuacion();
           }
        }
        pMaxima=0;
        for (int i = 0; i < getvParticipantes().length; i++) {
           if ((vParticipantes[i]!=null)&&(getvParticipantes()[i].getPuntuacion()>pMaxima)&&(getvParticipantes()[i].getPuntuacion()<vGanadores[1].getPuntuacion())){
               vGanadores[2]=getvParticipantes()[i];
               pMaxima=vGanadores[2].getPuntuacion();
           }
        }
        return vGanadores;
    }
    public boolean añadirParticipante(Jugador jugador ){
        for (int i = 0; i < getvParticipantes().length; i++) {
            if (this.getvParticipantes()[i]==null){
                getvParticipantes()[i]=jugador;
                return true;
            }
        }
        return false;
    }
     public boolean puntosJugador(int puntos, String nombreJugador) {
         for (int i = 0; i < getvParticipantes().length; i++) {
             if ((this.getvParticipantes()[i]!=null)&&(getvParticipantes()[i].equals(nombreJugador))){
                 this.getvParticipantes()[i].setPuntuacion(puntos);
             return true;
             }
         }
        return false;
    }
     public void verJugadores() {
         for (int i = 0; i < vParticipantes.length; i++) {
            if (vParticipantes[i]!=null) 
                System.out.println(vParticipantes[i].getNombre());
        }
    }
     public Jugador selectJugador(String nombre){
         for (int i = 0; i < vParticipantes.length; i++) {
            if((vParticipantes[i]!=null)&&(vParticipantes[i].getNombre().equalsIgnoreCase(nombre))){
                return vParticipantes[i];
            }
        }
        return null;
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
     * @return the vParticipantes
     */
    public Jugador[] getvParticipantes() {
        return vParticipantes;
    }

    /**
     * @param vParticipantes the vParticipantes to set
     */
    public void setvParticipantes(Jugador[] vParticipantes) {
        this.vParticipantes = vParticipantes;
    }
     
}
