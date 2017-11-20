package torneo;

import java.util.Scanner;

public class Torneo {
    public static void main(String[] args) {
        boolean bandera1 = true;
        boolean bandera2 = true;
        boolean nuevoJuego = true;
        TecnoLand torneo= new TecnoLand(2017);
        Scanner leer = new Scanner(System.in);//Strig
        Scanner leer2 = new Scanner(System.in);//INT
        while (bandera2) {
        switch(Menu1.pintaMenu2()){
            case 1://Añadir Juego
                System.out.println("Dime un nombre para el Juego");
                torneo.añadirJuego(leer.nextLine());
             break;
            case 2://Ver juegos
                torneo.mostrarJuegos();
             break;
            case 3://Select juegos
                String nombreJuego;
                boolean banderaS = true;
                torneo.mostrarJuegos();
                System.out.println("Dime el nombre del juego a seleccionar");
                nombreJuego=leer.nextLine();
                Juego juegoSeleccionado = torneo.seleccionarJuego(nombreJuego);
                if (juegoSeleccionado!=null){
                    while(banderaS){
                        switch(Menu1.pintaMenu1()){
                            case 1://Añadir Participante
                                String participante;
                                int edadParticipante;
                                System.out.println("Dime el nombre del participante");
                                participante=leer.nextLine(); 
                                System.out.println("Dime la edad del participante");
                                edadParticipante=leer2.nextInt(); 
                                Jugador player = new Jugador(participante, edadParticipante);
                                if (juegoSeleccionado.añadirParticipante(player)){
                                    System.out.println("Añadido sin problemas");
                                }else{
                                    System.out.println("No se a podido añadir");
                                }      
                             break;
                            case 2://select Jugador
                                String nombreJugador;
                                boolean banderaJ=true;
                                System.out.println("Dime el nombre del jugador");
                                nombreJugador=leer.nextLine();
                                Jugador jugadorSeleccionado = juegoSeleccionado.selectJugador(nombreJugador);
                                if(jugadorSeleccionado!=null){
                                    while(banderaJ){
                                       switch(Menu1.pintaMenu3()){
                                          case 1://Ver Puntos Jugador
                                              System.out.println(jugadorSeleccionado.getPuntuacion());
                                            break; 
                                          case 2://Añadir Puntos
                                              int puntos;
                                              System.out.println("punto a añadir");
                                              puntos=leer2.nextInt();
                                              jugadorSeleccionado.setPuntuacion(puntos);
                                            break; 
                                          case 3://Ver Jugador                                             
                                              System.out.println(jugadorSeleccionado.toString());
                                            break; 
                                          case 4://Atras
                                               banderaJ=false;
                                            break; 
                                        }
                                    }
                                }else{
                                    System.out.println("El nombre dle jugador no esta en el sistema");
                                }
                             break;
                            case 3://Ver Jugadores
                                juegoSeleccionado.verJugadores();
                             break;
                            case 4://Ganadores
                                Jugador vGanadores[]=juegoSeleccionado.ganadores();
                                for (int i = 0; i < vGanadores.length; i++) {
                                    if (vGanadores[i]!=null){
                                        System.out.println(vGanadores[i]);
                                    }
                                }
                             break;
                            case 5://Atras
                                banderaS=false;
                             break;
                        }
                    }
                }else{
                    System.out.println("El nombre introducido no esta en el sistema");
                }
             break;
            case 4://Salir
                System.out.println("Has salido");
                bandera2=false;
             break;
        }
            
        }
    }
    
}