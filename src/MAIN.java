
import java.util.InputMismatchException;
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
        
        int escojer; boolean cerrar = true, salir = false;
        
        do{
            System.out.println("\n\t1- LOG IN\n\t2- CREAR USUARIO\n\t3- SALIR\n");
            try{
            System.out.print("Escoja una Opcion:    ");
            escojer = sc.nextInt();
            cerrar = false;
            
            switch(escojer){
                case 1 :
                    System.out.print("Ingrese Username: ");
                    String user=sc.next();
                    System.out.print("Ingrese Password: ");
                    String pass=sc.next();
                    inst.buscarJugador(user, pass);
                    //inst.print();
                    break;
                case 2 :
                    System.out.print("Ingrese Username: ");
                    String username = sc.next();
                    System.out.print("Ingrese Contrasenia:    ");
                    String contrasena = sc.next();
                    inst.crearJugador(username, contrasena, 0);
                    break;
                case 3 : System.out.println("   Adios..."); salir = true;break;
            }
            }catch(InputMismatchException ime){
                //cerrar = true;
                System.err.println("\tPor favor Ingrese un Numero");
                sc.nextLine();
            }
            cerrar = true;
            if (salir == true) {// Una jugada bastante rara
                cerrar = false;
            }
        }while(cerrar);
    }
}
