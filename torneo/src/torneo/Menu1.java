package torneo;

import java.util.Scanner;

public class Menu1 {
    public static int pintaMenu1(){
     int menu=0;
        Scanner leer = new Scanner(System.in);
        if((menu>0)||(menu<6)){
        System.out.println("***************************");
        System.out.println("1-Añadir Participante");
        System.out.println("2-Ver Puntos Jugador");
        System.out.println("3-Ver Jugadores");
        System.out.println("4-Ganadores");
        System.out.println("5-Salir");
        System.out.println("***************************");
        menu=leer.nextInt();
        }
        return menu;
    }
}
