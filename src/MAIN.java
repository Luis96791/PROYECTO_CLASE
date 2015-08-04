
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        Player_Maintenance inst = new Player_Maintenance();
        
        int escojer;
        
        do{
            System.out.println("\n\t1- LOG IN\n\t2- CREAR USUARIO\n\t3- SALIR\n");
            System.out.print("Escoja una Opcion:    ");
            escojer = sc.nextInt();
            if(escojer == 3)
                System.out.println("    Adios...");
            
            switch(escojer){
                case 1 :
                    inst.print();
                    break;
                case 2 :
                    System.out.print("Ingrese Username: ");
                    String username = sc.next();
                    System.out.print("Ingrese Contrasenia:    ");
                    String contrasena = sc.next();
                    inst.crearJugador(username, contrasena, 0);
                    break;
            }
        }while(escojer != 3);
    }
}
