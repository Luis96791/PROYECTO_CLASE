
import java.util.ArrayList;

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
    ArrayList<Player> plays = new ArrayList<>();
    
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
                    return null;
                }
            }
        }
        System.out.println("Usuario y/o contrasenia invalidos...");
        return null;
    }
    
    
    
    
    //Para comprobar que el array este guardando
    void print(){
        for (int i = 0; i < plays.size(); i++) {
            System.out.println("Username:   "+plays.get(i).getUsername()+" Password:    "+plays.get(i).getPassword()+" Pts. "+plays.get(i).getPuntos());
        }
    }
}