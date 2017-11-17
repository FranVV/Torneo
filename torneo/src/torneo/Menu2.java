package torneo;

import java.util.Scanner;

public class Menu2 {
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
}
