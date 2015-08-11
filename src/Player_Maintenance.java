
import java.util.ArrayList;
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
public class Player_Maintenance {
    Scanner sc = new Scanner(System.in);
    ArrayList<Player> plays = new ArrayList<>();
    String notificar = "Proximamente estara disponible";
    
    Player crearJugador(String us, String p, int cont){
        for (int i = 0; i < plays.size(); i++) {
            if (plays.get(i).getPassword().length()>5 && plays.get(i).getPassword().length()<5) {
                System.out.println("Contrasenia debe ser igual a 5 caracteres !");
                return null;
            }
            
            if(plays.get(i).getUsername().equals(us)){
                System.out.println("No se agrego Jugador");
                return null;
            }
        }
        plays.add(new Player(us,p,cont=0));
        System.out.println("Jugador Agregado");
        return null;
    }
    
    Player buscarJugador(String us, String p){
        for (int i = 0; i < plays.size(); i++) {
            if(plays.get(i).getUsername().equals(us)){
                if (plays.get(i).getPassword().equals(p)) {
                    System.out.println("Bienvenido  "+plays.get(i).getUsername()+" !");
                    menuPrincipal();
                    return null;
                }
            }
        }
        System.out.println("Usuario y/o contrasenia invalidos...");
        return null;
    }
    
    void menuPrincipal(){
        int opc;
        do {
            System.out.println("\n\t** Menu Principal **\n\n\t1.- Jugar Ajedrez\n\t2.- Mi Perfil\n\t3.- Reportes\n\t4.- Cerrar Sesion\n");
            System.out.print("Elija una Opcion: ");
            opc = sc.nextInt();
            switch(opc){
                case 1: menuJugar(); break;
                case 2: menuPerfil(); break;
                case 3: menuReportes(); break;
            }
        } while (opc != 4);
    }
    
    void menuJugar(){
        int opc;
        do {
            System.out.println("\n\t** Partidas **\n\n\t1.- Crear Partida\n\t2.- Cargar Partida\n\t3.- Eliminar Partida\n\t4.- Transferir Partida\n\t5.- Regresar a Menu Principal\n");
            System.out.print("Elija una Opcion: ");
            opc = sc.nextInt();
            switch(opc){
                case 1:System.out.println(notificar);break;
                case 2:System.out.println(notificar);break;
                case 3:System.out.println(notificar);break;
                case 4:System.out.println(notificar);break;
            }
        } while (opc !=5);
    }
    
    void menuPerfil(){
        int opc;
        do {
            System.out.println("\n\t** Mi Perfil **\n\n\t1.- Ver mis Datos\n\t2.- Ver mis ultimos Juegos\n\t3.- Cambiar mi Password\n\t4.- Conectar a Facebook\n\t5.- Eliminar mi Cuenta\n\t6.- Regresar a Menu Principal\n");
            System.out.print("Elija una Opcion: ");
            opc = sc.nextInt();
            switch(opc){
                case 1:System.out.println(notificar);break;
                case 2:System.out.println(notificar);break;
                case 3:System.out.println(notificar);break;
                case 4:System.out.println(notificar);break;
                case 5:System.out.println(notificar);break;
            }
        } while (opc != 6);
    }
    
    void menuReportes(){
        int opc;
        do {
            System.out.println("\n\t** Reportes **\n\n\t1.- Ranking\n\t2.- Ultimos Juegos Globales\n\t3.- Regresar a Menu Principal\n");
            System.out.print("Elija una Opcion: ");
            opc = sc.nextInt();  
            switch(opc){
                case 1:System.out.println(notificar);break;
                case 2:System.out.println(notificar);break;
            }
        } while (opc !=3);
        
    }
    
    
    //Para comprobar que el array este guardando
    void print(){
        for (int i = 0; i < plays.size(); i++) {
            System.out.println("Username:   "+plays.get(i).getUsername()+" Password:    "+plays.get(i).getPassword()+" Pts. "+plays.get(i).getPuntos());
        }
    }
}