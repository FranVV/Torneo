package torneo;

import java.util.Scanner;

public class Menu1 {
    public static int pintaMenu1(){
     int menu=0;
        Scanner leer = new Scanner(System.in);
        if((menu>0)||(menu<6)){
        System.out.println("***************************");
        System.out.println("1-Añadir Participante");
        System.out.println("2-Seleccionar Jugador");
        System.out.println("3-Ver Jugadores");
        System.out.println("4-Ganadores");
        System.out.println("5-Atras");
        System.out.println("***************************");
        menu=leer.nextInt();
        }
        return menu;
    }
    
    public static int pintaMenu2(){
    int menu=0;
        Scanner leer = new Scanner(System.in);
        if((menu>0)||(menu<5)){
        System.out.println("***************************");
        System.out.println("1-Añadir Juego");
        System.out.println("2-Ver Juegos");
        System.out.println("3-Selecciona Juegos");
        System.out.println("4-Salir");
        System.out.println("***************************");
        menu=leer.nextInt();
        }
        return menu;
    }
    public static int pintaMenu3(){
     int menu=0;
        Scanner leer = new Scanner(System.in);
        if((menu>0)||(menu<5)){
        System.out.println("***************************");
        System.out.println("1-Ver Puntos Jugador");
        System.out.println("2-Añadir Puntos");
        System.out.println("3-Ver Jugador");
        System.out.println("4-Atras");
        System.out.println("***************************");
        menu=leer.nextInt();
        }
        return menu;
    }
}
