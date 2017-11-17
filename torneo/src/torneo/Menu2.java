package torneo;

import java.util.Scanner;

public class Menu2 {
    public static int pintaMenu2(){
    int menu=0;
        Scanner leer = new Scanner(System.in);
        if((menu>0)||(menu<5)){
        System.out.println("***************************");
        System.out.println("1-Añadir Juego");
        System.out.println("2-Ir a Juegos");
        System.out.println("3-Salir");
        System.out.println("***************************");
        menu=leer.nextInt();
        }
        return menu;
    }
}
