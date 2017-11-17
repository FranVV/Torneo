package torneo;

import java.util.Scanner;

public class Torneo {
    public static void main(String[] args) {
        boolean bandera1 = true;
        boolean bandera2 = true;
        boolean nuevoJuego = true;
        TecnoLand torneo= new TecnoLand(2017);
        Scanner leer = new Scanner(System.in);//Strig
        while (bandera2) {
        switch(Menu2.pintaMenu2()){
            case 1://Añadir Juego
                System.out.println("Dime un nombre para el Juego");
                torneo.añadirJuego(leer.nextLine());
             break;
            case 2://Ver juegos
                torneo.mostrarJuegos();
             break;
            case 3://select juegos
                torneo.mostrarJuegos();
                System.out.println("Dime el nombre del juego a seleccionar");
                
             break;
            case 4://Salir
                System.out.println("Has salido");
                bandera2=false;
             break;
        }
            
        }
    }
    
}
