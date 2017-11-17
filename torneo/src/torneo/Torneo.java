package torneo;

import java.util.Scanner;

public class Torneo {
    public static void main(String[] args) {
        boolean bandera1 = true;
        boolean bandera2 = true;
        boolean nuevoJuego;
        TecnoLand juego1;
        Scanner leer = new Scanner(System.in);
        while (bandera2) {
        switch(Menu2.pintaMenu2()){
            case 1://Añqdir Juego
                juego1.getvJuegos();
             break;
            case 2://Ir a juegos
                
             break;
            case 3://Salir
                System.out.println("Has salido");
                bandera2=false;
             break;
        }
            
        }
    }
    
}
