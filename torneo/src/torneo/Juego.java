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
        
        vGanadores[0]=getvParticipantes()[0];
        
        for (int i = 1; i < getvParticipantes().length; i++) {
           if (getvParticipantes()[i].getPuntuacion()>vGanadores[0].getPuntuacion()){
               vGanadores[0]=getvParticipantes()[i];
           }
        }
        for (int i = 1; i < getvParticipantes().length; i++) {
           if ((getvParticipantes()[i].getPuntuacion()>getvParticipantes()[0].getPuntuacion())&&(getvParticipantes()[i].getPuntuacion()!=vGanadores[0].getPuntuacion())){
               vGanadores[1]=getvParticipantes()[i];
           }
        }
        for (int i = 1; i < getvParticipantes().length; i++) {
           if ((getvParticipantes()[i].getPuntuacion()>getvParticipantes()[0].getPuntuacion())&&(getvParticipantes()[i]!=vGanadores[0])&&(getvParticipantes()[i]!=vGanadores[1])){
               vGanadores[2]=getvParticipantes()[i];
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
     public String verJugadores() {
         return getvParticipantes().toString();
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
