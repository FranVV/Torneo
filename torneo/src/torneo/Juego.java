package torneo;
public class Juego {
    private String nombre;
    private Jugador[] vParticipantes;

    public Juego() {
        this.nombre="";
        this.vParticipantes=new Jugador[6];
    }

    public Juego(String nombre, Jugador[] vParticipantes) {
        this.nombre = nombre;
        this.vParticipantes = vParticipantes;
    }
    public Jugador[] ganadores() {
        Jugador vGanadores[]=new Jugador[3];
        for (int i = 0; i < vParticipantes.length; i++) {
            for (int j = 0; j < 10; j++) {
                
            }
        }
        
        
        return vGanadores;
    }
    public boolean añadirParticipante(Jugador jugador ){
        for (int i = 0; i < vParticipantes.length; i++) {
            if (this.vParticipantes[i]==null){
                vParticipantes[i]=jugador;
                return true;
            }
        }
        return false;
    }
     public boolean puntosJugador(int puntos, String nombreJugador) {
         for (int i = 0; i < vParticipantes.length; i++) {
             if ((this.vParticipantes[i]!=null)&&(vParticipantes[i].equals(nombreJugador))){
                 this.vParticipantes[i].setPuntuacion(puntos);
             return true;
             }
         }
        return false;
    }
     public String verJugadores() {
         return vParticipantes.toString();
    }
}
