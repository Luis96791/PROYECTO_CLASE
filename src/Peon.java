/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jorge
 */
public class Peon extends Ficha{
       
    public Peon(int g, int h){
        super(g,h);
    }
    
    
   public void Mover(int f1, int col1, int f2, int col2){
        
        if(Tablero.turno){
            
            if ((( f2 <8) && (col2 < 8) ) && (Tablero.Tablero[f2][col2].equals("--") 
                || Tablero.Tablero[f2][col2].charAt(1) != 'B') && ((( f2 == f1 -1) && (col2 == col1)) 
                || (( f2 == f1 -1) && (col2 == col1 +1)) 
                || ((f2 == f1 -1) && (col2 == col1 -1)))){

            if((col2 < col1) || (col2 > col1)){
                  
                if(Tablero.Tablero [f2][col2].equals("--") ){
                    System.out.println("¡Movimiento invalido!");
                    Tablero.ImprimirTablero();
                      
                }else if(Tablero.Tablero[f2][col2].charAt(1) != 'B'){
                    
                if(Tablero.Tablero[f2][col2].charAt(0)== 'P'){
                    System.out.println("El Peon de "+/*Player_Maintenance.jugadorLogged.getUsername()*/+" se ha comido al Peon de "+Player_Maintenance.jugadorInvitado.getUsername()+" ");
                }else if(Tablero.Tablero[f2][col2].charAt(0)=='T'){
                    System.out.println("El Peon de "+Player_Maintenance.jugadorLogged.getUsername()+" se ha comido a la Torre de "+Player_Maintenance.jugadorInvitado.getUsername()+" ");
                }else if(Tablero.Tablero[f2][col2].charAt(0) == 'C'){
                    System.out.println("El Peon de "+Player_Maintenance.jugadorLogged.getUsername()+" se ha comido al Caballo de "+Player_Maintenance.jugadorInvitado.getUsername()+" ");
                }else if(Tablero.Tablero[f2][col2].charAt(0) == 'A'){
                    System.out.println("El Peon de "+Player_Maintenance.jugadorLogged.getUsername()+" se ha comido al Alfil de "+Player_Maintenance.jugadorInvitado.getUsername()+" ");
                }else if(Tablero.Tablero [f2][col2].charAt(0) == 'Q'){
                    System.out.println("El Peon de "+Player_Maintenance.jugadorLogged.getUsername()+" se ha comido al Dama de "+Player_Maintenance.jugadorInvitado.getUsername()+" ");
                }else if(Tablero.Tablero [f2][col2].charAt(0) == 'K'){

                    System.out.println("");
                    System.out.println("");
                    System.out.println("El jugador: "+Player_Maintenance.jugadorLogged.getUsername()+" le GANO a "+Player_Maintenance.jugadorInvitado.getUsername()+" comiéndose al Rey enemigo y mas "+Tablero.contBlanco+" fichas mas");
                    System.out.println("");
                    Menu.validar=0;

                  
                    Tablero.contBlanco=0;
                    Tablero.contNegro=0;

                    Tablero.Tablero[0][0]="TN"; Tablero.Tablero[0][1]="CN"; Tablero.Tablero[0][2]="AN"; Tablero.Tablero[0][3]="KN"; Tablero.Tablero[0][4]="QN"; Tablero.Tablero[0][5]="AN"; Tablero.Tablero[0][6]="CN"; Tablero.Tablero[0][7]="TN";
                    Tablero.Tablero[1][0]="PN"; Tablero.Tablero[1][1]="PN"; Tablero.Tablero[1][2]="PN"; Tablero.Tablero[1][3]="PN"; Tablero.Tablero[1][4]="PN"; Tablero.Tablero[1][5]="PN"; Tablero.Tablero[1][6]="PN"; Tablero.Tablero[1][7]="PN"; 
                    Tablero.Tablero[2][0]="--"; Tablero.Tablero[2][1]="--"; Tablero.Tablero[2][2]="--"; Tablero.Tablero[2][3]="--"; Tablero.Tablero[2][4]="--"; Tablero.Tablero[2][5]="--"; Tablero.Tablero[2][6]="--"; Tablero.Tablero[2][7]="--";
                    Tablero.Tablero[3][0]="--"; Tablero.Tablero[3][1]="--"; Tablero.Tablero[3][2]="--"; Tablero.Tablero[3][3]="--"; Tablero.Tablero[3][4]="--"; Tablero.Tablero[3][5]="--"; Tablero.Tablero[3][6]="--"; Tablero.Tablero[3][7]="--";
                    Tablero.Tablero[4][0]="--"; Tablero.Tablero[4][1]="--"; Tablero.Tablero[4][2]="--"; Tablero.Tablero[4][3]="--"; Tablero.Tablero[4][4]="--"; Tablero.Tablero[4][5]="--"; Tablero.Tablero[4][6]="--"; Tablero.Tablero[4][7]="--";
                    Tablero.Tablero[5][0]="--"; Tablero.Tablero[5][1]="--"; Tablero.Tablero[5][2]="--"; Tablero.Tablero[5][3]="--"; Tablero.Tablero[5][4]="--"; Tablero.Tablero[5][5]="--"; Tablero.Tablero[5][6]="--"; Tablero.Tablero[5][7]="--";
                    Tablero.Tablero[6][0]="PB"; Tablero.Tablero[6][1]="PB"; Tablero.Tablero[6][2]="PB"; Tablero.Tablero[6][3]="PB"; Tablero.Tablero[6][4]="PB"; Tablero.Tablero[6][5]="PB"; Tablero.Tablero[6][6]="PB"; Tablero.Tablero[6][7]="PB"; 
                    Tablero.Tablero[7][0]="TB"; Tablero.Tablero[7][1]="CB"; Tablero.Tablero[7][2]="AB"; Tablero.Tablero[7][3]="QB"; Tablero.Tablero[7][4]="KB"; Tablero.Tablero[7][5]="AB"; Tablero.Tablero[7][6]="CB"; Tablero.Tablero[7][7]="TB";
                    Menu.Menu();
                }

                    Tablero.Tablero[f2][col2] = Tablero.Tablero[f1][col1];
                    Tablero.Tablero[f1][col1]="--";
                    Tablero.contBlanco +=1;
                    Tablero.turno=false;
                    Tablero.ImprimirTablero();
                }      
            }
              
                if( Tablero.Tablero [f2][col2].equals("--") ){
                    Tablero.Tablero[f2][col2]=Tablero.Tablero[f1][col1];
                    Tablero.Tablero[f1][col1]= "--";
                    Tablero.turno=false;
                    Tablero.ImprimirTablero();
                }else{
                    System.out.println("");
                    System.out.println("");
                    System.out.println("¡Movimiento invalido!");
                    Tablero.ImprimirTablero();
                }
            }else{
                System.out.println("¡Movimiento Invalido!");
                Tablero.ImprimirTablero();
            }
        }else if(!Tablero.turno){
       
       if ((( f2 <8) && (col2 < 8) ) && (Tablero.Tablero[f2][col2].equals("--")
            || Tablero.Tablero[f2][col2].charAt(1) != 'N') && ((( f2 == f1 +1) && (col2 == col1))
            || (( f2 == f1 +1) && (col2 == col1 +1))
            || ((f2>f1) && (col2 == col1 -1)))){
            
            if(col2 < col1 || col2 > col1){
               if(Tablero.Tablero [f2][col2].equals("--")){
                    System.out.println("");
                    System.out.println("");
                    System.out.println("¡Movimiento invalido!");
                    Tablero. ImprimirTablero();
                }else if(Tablero.Tablero[f2][col2].charAt(1) != 'N'){

                    if(Tablero.Tablero[f2][col2].charAt(0)== 'P'){
                        System.out.println("El Peon de "+Player_Maintenance.jugadorInvitado.getUsername()+" se ha comido al Peon de "+Player_Maintenance.jugadorLogged.getUsername()+" ");
                    }else if(Tablero.Tablero[f2][col2].charAt(0)=='T'){
                        System.out.println("El Peon de "+Player_Maintenance.jugadorInvitado.getUsername()+" se ha comido a la Torre de "+Player_Maintenance.jugadorLogged.getUsername()+" ");
                    }else if(Tablero.Tablero[f2][col2].charAt(0) == 'C'){
                        System.out.println("El Peon de "+Player_Maintenance.jugadorInvitado.getUsername()+" se ha comido al Caballo de "+Player_Maintenance.jugadorLogged.getUsername()+" ");
                    }else if(Tablero.Tablero[f2][col2].charAt(0) == 'A'){
                        System.out.println("El Peon de "+Player_Maintenance.jugadorInvitado.getUsername()+" se ha comido al Alfil de "+Player_Maintenance.jugadorLogged.getUsername()+" ");
                    }else if(Tablero.Tablero [f2][col2].charAt(0) == 'Q'){
                        System.out.println("El Peon de "+Player_Maintenance.jugadorInvitado.getUsername()+" se ha comido a la Dama de "+Player_Maintenance.jugadorLogged.getUsername()+" ");
                    }else if(Tablero.Tablero[f2][col2].charAt(0) == 'K'){

                    System.out.println("");
                    System.out.println("");
                    System.out.println("El jugador: "+Player_Maintenance.jugadorInvitado.getUsername()+" le GANO a "+Player_Maintenance.jugadorLogged.getUsername()+" comiéndose al Rey enemigo y mas "+Tablero.contNegro+" fichas mas");
                    System.out.println("");
                    Menu.validar=0;

                   
                    Tablero.contBlanco=0;
                    Tablero.contNegro=0;

                    Tablero.Tablero[0][0]="TN"; Tablero.Tablero[0][1]="CN"; Tablero.Tablero[0][2]="AN"; Tablero.Tablero[0][3]="KN"; Tablero.Tablero[0][4]="QN"; Tablero.Tablero[0][5]="AN"; Tablero.Tablero[0][6]="CN"; Tablero.Tablero[0][7]="TN";
                    Tablero.Tablero[1][0]="PN"; Tablero.Tablero[1][1]="PN"; Tablero.Tablero[1][2]="PN"; Tablero.Tablero[1][3]="PN"; Tablero.Tablero[1][4]="PN"; Tablero.Tablero[1][5]="PN"; Tablero.Tablero[1][6]="PN"; Tablero.Tablero[1][7]="PN"; 
                    Tablero.Tablero[2][0]="--"; Tablero.Tablero[2][1]="--"; Tablero.Tablero[2][2]="--"; Tablero.Tablero[2][3]="--"; Tablero.Tablero[2][4]="--"; Tablero.Tablero[2][5]="--"; Tablero.Tablero[2][6]="--"; Tablero.Tablero[2][7]="--";
                    Tablero.Tablero[3][0]="--"; Tablero.Tablero[3][1]="--"; Tablero.Tablero[3][2]="--"; Tablero.Tablero[3][3]="--"; Tablero.Tablero[3][4]="--"; Tablero.Tablero[3][5]="--"; Tablero.Tablero[3][6]="--"; Tablero.Tablero[3][7]="--";
                    Tablero.Tablero[4][0]="--"; Tablero.Tablero[4][1]="--"; Tablero.Tablero[4][2]="--"; Tablero.Tablero[4][3]="--"; Tablero.Tablero[4][4]="--"; Tablero.Tablero[4][5]="--"; Tablero.Tablero[4][6]="--"; Tablero.Tablero[4][7]="--";
                    Tablero.Tablero[5][0]="--"; Tablero.Tablero[5][1]="--"; Tablero.Tablero[5][2]="--"; Tablero.Tablero[5][3]="--"; Tablero.Tablero[5][4]="--"; Tablero.Tablero[5][5]="--"; Tablero.Tablero[5][6]="--"; Tablero.Tablero[5][7]="--";
                    Tablero.Tablero[6][0]="PB"; Tablero.Tablero[6][1]="PB"; Tablero.Tablero[6][2]="PB"; Tablero.Tablero[6][3]="PB"; Tablero.Tablero[6][4]="PB"; Tablero.Tablero[6][5]="PB"; Tablero.Tablero[6][6]="PB"; Tablero.Tablero[6][7]="PB"; 
                    Tablero.Tablero[7][0]="TB"; Tablero.Tablero[7][1]="CB"; Tablero.Tablero[7][2]="AB"; Tablero.Tablero[7][3]="QB"; Tablero.Tablero[7][4]="KB"; Tablero.Tablero[7][5]="AB"; Tablero.Tablero[7][6]="CB"; Tablero.Tablero[7][7]="TB";
                    Menu.Menu();
                }
                    Tablero.Tablero[f2][col2] = Tablero.Tablero[f1][col1];
                    Tablero.Tablero[f1][col1]="--";
                    Tablero.contNegro+=1;
                    Tablero. turno=true;
                    Tablero. ImprimirTablero();
                }      
            }
            if( Tablero.Tablero [f2][col2].equals("--") ){
                Tablero.Tablero[f2][col2]=Tablero.Tablero[f1][col1];
                Tablero.Tablero[f1][col1]= "--";
                Tablero. turno=true;
                Tablero. ImprimirTablero();
            }else{
                System.out.println("");
                System.out.println("");
                System.out.println("¡Movimiento invalido!");
                Tablero.ImprimirTablero();
            }
            }else{
                System.out.println("");
                System.out.println("");
                System.out.println("¡Movimiento invalido!");
                Tablero.ImprimirTablero();
            }
        }
    }
}
