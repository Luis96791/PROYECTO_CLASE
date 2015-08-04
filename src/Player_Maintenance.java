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
    Player plays[] = new Player[20];
    
    //Funcion que guarda crea jugador y los guarda temporalmente 
    //FALTA:    que valide Users repetidos y que la contraseña no tenga mas de cinco caracteres
    Player crearJugador(String us, String p, int pts){
        for(int n = 0; n < plays.length; n++){
            if(plays[n] == null){
                System.out.println("Jugador creado Exitosamente!");
                return plays[n] = new Player(us,p,pts=0);
            }
        }        
        System.out.println("No se pudo crear Jugador!");
        return null;       
    }
    
    //para comprobar que el arreglo esta guardando en el arreglo
    void print(){
        for (int i = 0; i < plays.length; i++) {
            if(plays[i] != null)
                System.out.println("Username:   "+plays[i].getUsername()+"Password: "+plays[i].getPassword());
        }
    }
}