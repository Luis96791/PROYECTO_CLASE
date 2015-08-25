/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jorge
 */
public class Dama extends Ficha{
        
    public int comprobacion;
    
    public Dama(int bo, int fo){
        super(bo,fo);
    }
    
    public int MovIzquierda(int f1, int c1, int f2, int c2, int hay){
        if(c2 < c1){
            if(Tablero.Tablero [f1][c1].equals("--")){
                return MovIzquierda(f1, c1 -1, f2, c2, hay);
            }else{
                return MovIzquierda(f1, c1 -1, f2, c2, hay +1);
            }
        }else{
            return hay;
        }
    }
    
    public int MovArriba(int f1, int c1, int f2, int c2, int hay){
        if(f2 < f1){
            if(Tablero.Tablero[f1][c1].equals("--")){                 
                return MovArriba(f1 -1, c1, f2, c2, hay);               
            }else{
                return MovArriba(f1 -1, c1, f2, c2, hay +1);
            }
        }else{
            return hay;
        }   
    }
        
    public int MovDerecha(int f1, int c1, int f2, int c2, int hay){
        if(c2 > c1){
            if(Tablero.Tablero [f1][c1].equals("--")){                  
                return MovDerecha(f1, c1 +1, f2, c2, hay);       
            }else{
                return MovDerecha(f1, c1 +1, f2, c2, hay +1);
            }
        }else{
            return hay;
        }
    }
    
    
    public int MovAbajo(int f1, int c1, int f2, int c2, int hay){
        if(f2 > f1){
            if(Tablero.Tablero[f1][c1].equals("--")){          
                return MovAbajo(f1 +1, c1, f2, c2, hay);   
            }else{
                return MovAbajo(f1 +1, c1, f2, c2, hay +1);
            }
        }else{
            return hay;
        }  
    }
    
   
    public void Mover(int filainicial, int columnainicial, int filafinal, int columnafinal){
    
        if(Tablero.turno){
            if((( filafinal < 8) && ( columnafinal <8)) && (Tablero.Tablero[filafinal][columnafinal].equals("--") 
                || Tablero.Tablero[filafinal][columnafinal].charAt(1) != 'B') && ((( filafinal == filainicial) && (columnafinal < columnainicial)) 
                || (( filafinal < filainicial) && (columnafinal == columnainicial)) 
                || (( filafinal == filainicial) && (columnafinal > columnainicial)) 
                || (( filafinal > filainicial) && (columnafinal == columnainicial)))){ 
            if((filafinal == filainicial) && (columnafinal < columnainicial)){
                comprobacion =MovIzquierda(filainicial,columnainicial, filafinal, columnafinal, 0);
            }else if((filafinal < filainicial) && (columnafinal == columnainicial)){
                comprobacion=MovArriba(filainicial, columnainicial, filafinal, columnafinal,0);
            }else if((filafinal== filainicial) && (columnafinal > columnainicial)){
                comprobacion= MovDerecha(filainicial, columnainicial, filafinal, columnafinal,0);
            }else if((filafinal > filainicial) && (columnafinal == columnainicial)){ 
                comprobacion =MovAbajo(filainicial, columnainicial, filafinal, columnafinal, 0);
            }
            if(comprobacion > 1){
                System.out.println("");
                System.out.println("");
                System.out.println("¡Movimiento invalido!");           
                Tablero.ImprimirTablero();
            }

            if(Tablero.Tablero [filafinal][columnafinal].charAt(1) != 'B' && (Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'P' 
                    || Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'T' 
                    || Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'C' 
                    || Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'A' 
                    || Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'Q' 
                    || Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'K')){
                if(Tablero.Tablero[filafinal][columnafinal].charAt(0)== 'P'){
                    System.out.println("La Dama de "+Player_Maintenance.jugadorLogged.getUsername()+" se ha comido al Peon de "+Player_Maintenance.jugadorInvitado.getUsername()+" ");
                }else if(Tablero.Tablero[filafinal][columnafinal].charAt(0)=='T'){
                    System.out.println("La Dama de "+Player_Maintenance.jugadorLogged.getUsername()+" se ha comido a la Torre de "+Player_Maintenance.jugadorInvitado.getUsername()+" ");
                }else if(Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'C'){
                    System.out.println("La Dama de "+Player_Maintenance.jugadorLogged.getUsername()+" se ha comido al Caballo de "+Player_Maintenance.jugadorInvitado.getUsername()+" ");
                }else if(Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'A'){
                    System.out.println("La Dama de "+Player_Maintenance.jugadorLogged.getUsername()+" se ha comido al Alfil de "+Player_Maintenance.jugadorInvitado.getUsername()+" ");
                }else if(Tablero.Tablero [filafinal][columnafinal].charAt(0) == 'Q'){
                    System.out.println("La Dama de "+Player_Maintenance.jugadorLogged.getUsername()+" se ha comido a la Dama de "+Player_Maintenance.jugadorInvitado.getUsername()+" ");
                }else if(Tablero.Tablero [filafinal][columnafinal].charAt(0) == 'K'){

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
                    Tablero.Tablero[filafinal][columnafinal] = Tablero.Tablero[filainicial][columnainicial];
                    Tablero.Tablero[filainicial][columnainicial]="--";
                    Tablero.contBlanco +=1;
                    Tablero.turno=false;
                    Tablero.ImprimirTablero();
                }else{
                    Tablero.Tablero[filafinal][columnafinal] = Tablero.Tablero[filainicial][columnainicial];
                    Tablero.Tablero[filainicial][columnainicial]="--";
                    Tablero.turno=false;
                    Tablero.ImprimirTablero();
                    }   
                }else{
                    System.out.println("");
                    System.out.println("");
                    System.out.println("¡Movimiento invalido!");
                    Tablero.ImprimirTablero(); 
                }
        }else if(!Tablero.turno){
            
        if((( filafinal < 8) && ( columnafinal <8)) && (Tablero.Tablero[filafinal][columnafinal].equals("--") 
                || Tablero.Tablero[filafinal][columnafinal].charAt(1) != 'N') && ((( filafinal == filainicial) && (columnafinal < columnainicial)) 
                || (( filafinal < filainicial) && (columnafinal == columnainicial)) 
                || (( filafinal == filainicial) && (columnafinal > columnainicial)) 
                || (( filafinal > filainicial) && (columnafinal == columnainicial)))){    
            if((filafinal == filainicial) && (columnafinal < columnainicial)){
            comprobacion =MovIzquierda(filainicial,columnainicial, filafinal, columnafinal, 0);
        }else if((filafinal < filainicial) && (columnafinal == columnainicial)){           
            comprobacion=MovArriba(filainicial, columnainicial, filafinal, columnafinal,0);
        }else if((filafinal== filainicial) && (columnafinal > columnainicial)){
            comprobacion= MovDerecha(filainicial, columnainicial, filafinal, columnafinal,0);
        }else if((filafinal > filainicial) && (columnafinal == columnainicial)){
             comprobacion =MovAbajo(filainicial, columnainicial, filafinal, columnafinal, 0);
        }
         
            if(comprobacion >1){
                System.out.println("");
                System.out.println("");
                System.out.println("¡Movimiento invalido!");
                Tablero.ImprimirTablero();
            }
            
            if(Tablero.Tablero [filafinal][columnafinal].charAt(1) != 'N' && (Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'P' 
                    || Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'T' 
                    || Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'C' 
                    || Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'A' 
                    || Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'Q' 
                    || Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'K')){
                if(Tablero.Tablero[filafinal][columnafinal].charAt(0)== 'P'){
                    System.out.println("La Dama de "+Menu.j2+" se ha comido al Peon de "+Menu.j1+" ");
                    }else if(Tablero.Tablero[filafinal][columnafinal].charAt(0)=='T'){
                    System.out.println("La Dama de "+Menu.j2+" se ha comido a la Torre de "+Menu.j1+"");
                    }else if(Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'C'){
                    System.out.println("La Dama de "+Menu.j2+" se ha comido al Caballo de "+Menu.j1+" ");
                    }else if(Tablero.Tablero[filafinal][columnafinal].charAt(0) == 'A'){
                    System.out.println("La Dama de "+Menu.j2+" se ha comido al Alfil de "+Menu.j1+" ");
                    }else if(Tablero.Tablero [filafinal][columnafinal].charAt(0) == 'Q'){
                    System.out.println("La Dama de "+Menu.j2+" se ha comido a la Dama de "+Menu.j1+" ");
                    }else if(Tablero.Tablero [filafinal][columnafinal].charAt(0) == 'K'){
                        
                System.out.println("");
                System.out.println("");
                System.out.println("El jugador: "+Player_Maintenance.jugadorInvitado.getUsername()+" le GANO a "+Player_Maintenance.jugadorLogged.getUsername()+" comiéndose al Rey enemigo y mas "+Tablero.contNegro+" fichas mas");
                System.out.println("");
                Menu.validar=0;

               
                Tablero.contBlanco=0;
                Tablero.contNegro=0;

                Tablero.Tablero[0][0]="TN"; Tablero.Tablero[0][1]="CN"; Tablero.Tablero[0][2]="AN"; Tablero.Tablero[0][3]="KN"; Tablero.Tablero[0][4]="QN"; Tablero.Tablero[0][5]="AN"; Tablero.Tablero[0][6]="CN"; Tablero.Tablero[0][7]="TN";
                Tablero.Tablero[1][0]="PN"; Tablero.Tablero[1][1]="PN"; Tablero.Tablero[1][2]="PN"; Tablero.Tablero[1][3]="PN"; Tablero.Tablero[1][4]="PN"; Tablero.Tablero[1][5]="PN"; Tablero.Tablero[1][6]="PN"; Tablero.Tablero[1][7]="PN"; 
                Tablero.Tablero[2][0]="--"; Tablero.Tablero[2][1]="--"; Tablero.Tablero[2][2]="--"; Tablero.Tablero[2][3]="--"; Tablero.Tablero[2][4]="--";Tablero. Tablero[2][5]="--"; Tablero.Tablero[2][6]="--"; Tablero.Tablero[2][7]="--";
                Tablero.Tablero[3][0]="--"; Tablero.Tablero[3][1]="--"; Tablero.Tablero[3][2]="--"; Tablero.Tablero[3][3]="--"; Tablero.Tablero[3][4]="--"; Tablero.Tablero[3][5]="--"; Tablero.Tablero[3][6]="--"; Tablero.Tablero[3][7]="--";
                Tablero.Tablero[4][0]="--"; Tablero.Tablero[4][1]="--"; Tablero.Tablero[4][2]="--"; Tablero.Tablero[4][3]="--"; Tablero.Tablero[4][4]="--"; Tablero.Tablero[4][5]="--"; Tablero.Tablero[4][6]="--"; Tablero.Tablero[4][7]="--";
                Tablero.Tablero[5][0]="--"; Tablero.Tablero[5][1]="--"; Tablero.Tablero[5][2]="--"; Tablero.Tablero[5][3]="--"; Tablero.Tablero[5][4]="--"; Tablero.Tablero[5][5]="--"; Tablero.Tablero[5][6]="--"; Tablero.Tablero[5][7]="--";
                Tablero.Tablero[6][0]="PB"; Tablero.Tablero[6][1]="PB"; Tablero.Tablero[6][2]="PB"; Tablero.Tablero[6][3]="PB"; Tablero.Tablero[6][4]="PB"; Tablero.Tablero[6][5]="PB"; Tablero.Tablero[6][6]="PB"; Tablero.Tablero[6][7]="PB"; 
                Tablero.Tablero[7][0]="TB"; Tablero.Tablero[7][1]="CB"; Tablero.Tablero[7][2]="AB"; Tablero.Tablero[7][3]="QB"; Tablero.Tablero[7][4]="KB"; Tablero.Tablero[7][5]="AB"; Tablero.Tablero[7][6]="CB"; Tablero.Tablero[7][7]="TB";
                Menu.Menu();
                }
                Tablero.Tablero[filafinal][columnafinal] = Tablero.Tablero[filainicial][columnainicial];
                Tablero.Tablero[filainicial][columnainicial]="--";
                Tablero.contNegro+=1;
                Tablero.turno=true;
                Tablero.ImprimirTablero();
            }else{
                Tablero.Tablero[filafinal][columnafinal] = Tablero.Tablero[filainicial][columnainicial];
                Tablero.Tablero[filainicial][columnainicial]="--";
                Tablero.turno=true;
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
    
    public void MoverDiagonal(int fi,int ci, int ff, int cf){    
        if(Tablero.turno){
            if(((ff <8) && (cf <8)) && (Tablero.Tablero[ff][cf].equals("--") 
                || Tablero.Tablero[ff][cf].charAt(1) != 'B') && (((ff == fi -1) && (cf == ci -1))
                || ((ff == fi-1) && (cf == ci +1))
                || ((ff == fi +1) && (cf == ci -1))
                || ((( ff == fi +1) && (cf == ci +1)) ))){
                
                if(Tablero.Tablero[ff][cf].charAt(1) != 'B' && (Tablero.Tablero[ff][cf].charAt(0) == 'P'
                    || Tablero.Tablero[ff][cf].charAt(0) == 'T'
                    || Tablero.Tablero[ff][cf].charAt(0) == 'C'
                    || Tablero.Tablero[ff][cf].charAt(0) == 'A'
                    || Tablero.Tablero[ff][cf].charAt(0) == 'Q'
                    || Tablero.Tablero[ff][cf].charAt(0) == 'K')){     
                    
                    if(Tablero.Tablero[ff][cf].charAt(0)== 'P'){
                        System.out.println("La Dama de "+Player_Maintenance.jugadorLogged.getUsername()+" se ha comido al Peon de "+Player_Maintenance.jugadorInvitado.getUsername()+" ");
                    }else if(Tablero.Tablero[ff][cf].charAt(0)=='T'){
                        System.out.println("La Dama de "+Player_Maintenance.jugadorLogged.getUsername()+" se ha comido a la Torre de "+Player_Maintenance.jugadorInvitado.getUsername()+"");
                    }else if(Tablero.Tablero[ff][cf].charAt(0) == 'C'){
                        System.out.println("La Dama de "+Player_Maintenance.jugadorLogged.getUsername()+" se ha comido al Caballo de "+Player_Maintenance.jugadorInvitado.getUsername()+"");
                    }else if(Tablero.Tablero[ff][cf].charAt(0) == 'A'){
                        System.out.println("La Dama de "+Player_Maintenance.jugadorLogged.getUsername()+" se ha comido al Alfil de "+Player_Maintenance.jugadorInvitado.getUsername()+"");
                    }else if(Tablero.Tablero [ff][cf].charAt(0) == 'Q'){
                        System.out.println("La Dama de "+Player_Maintenance.jugadorLogged.getUsername()+" se ha comido a la Dama de "+Player_Maintenance.jugadorInvitado.getUsername()+"");
                    }else if(Tablero.Tablero [ff][cf].charAt(0) == 'K'){

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

                    Tablero.Tablero[ff][cf] = Tablero.Tablero[fi][ci];
                    Tablero.Tablero[fi][ci] = "--";
                    Tablero.contBlanco+=1;
                    Tablero.turno=false;
                    Tablero.ImprimirTablero();             
                }else{
                    Tablero.Tablero[ff][cf] = Tablero.Tablero[fi][ci];
                    Tablero.Tablero[fi][ci] = "--"; 
                    Tablero.turno=false;
                    Tablero.ImprimirTablero();   
                    }    
            }else{
                    System.out.println("");
                    System.out.println("");
                    System.out.print("¡Movimiento invalido!");
                    Tablero.ImprimirTablero();
                }
            
            }else if(!Tablero.turno){
        
            if(((ff <8) && (cf <8)) && (Tablero.Tablero[ff][cf].equals("--")
                || Tablero.Tablero[ff][cf].charAt(1) != 'N') && (((ff == fi -1) && (cf == ci -1))
                || ((ff == fi-1) && (cf == ci +1))
                || ((ff == fi +1) && (cf == ci -1))
                || ((( ff == fi +1) && (cf == ci +1)) ))){
                
                if(Tablero.Tablero[ff][cf].charAt(1) != 'N' && (Tablero.Tablero[ff][cf].charAt(0) == 'P'
                    || Tablero.Tablero[ff][cf].charAt(0) == 'T'
                    || Tablero.Tablero[ff][cf].charAt(0) == 'C'
                    || Tablero.Tablero[ff][cf].charAt(0) == 'A'
                    || Tablero.Tablero[ff][cf].charAt(0) == 'Q'
                    || Tablero.Tablero[ff][cf].charAt(0) == 'K')){
                    
                    if(Tablero.Tablero[ff][cf].charAt(0)== 'P'){
                        System.out.println("La Dama de "+Player_Maintenance.jugadorInvitado.getUsername()+" se ha comido al Peon de "+Player_Maintenance.jugadorLogged.getUsername()+"");
                    }else if(Tablero.Tablero[ff][cf].charAt(0)=='T'){
                        System.out.println("La Dama de "+Player_Maintenance.jugadorInvitado.getUsername()+" se ha comido a la Torre de "+Player_Maintenance.jugadorLogged.getUsername()+"");
                    }else if(Tablero.Tablero[ff][cf].charAt(0) == 'C'){
                        System.out.println("La Dama de "+Player_Maintenance.jugadorInvitado.getUsername()+"  se ha comido al Caballo de "+Player_Maintenance.jugadorLogged.getUsername()+"");
                    }else if(Tablero.Tablero[ff][cf].charAt(0) == 'A'){
                        System.out.println("La Dama de "+Player_Maintenance.jugadorInvitado.getUsername()+" se ha comido al Alfil de "+Player_Maintenance.jugadorLogged.getUsername()+"");
                    }else if(Tablero.Tablero [ff][cf].charAt(0) == 'Q'){
                        System.out.println("La Dama de "+Player_Maintenance.jugadorInvitado.getUsername()+" se ha comido a la Dama de "+Player_Maintenance.jugadorLogged.getUsername()+"");
                    }else if(Tablero.Tablero [ff][cf].charAt(0) == 'K'){
                        
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
                Tablero.Tablero[ff][cf] = Tablero.Tablero[fi][ci];
                Tablero.Tablero[fi][ci] = "--";
                Tablero.turno=true;
                Tablero.contNegro +=1;
                Tablero.ImprimirTablero();             
            }else{
                Tablero.Tablero[ff][cf] = Tablero.Tablero[fi][ci];
                Tablero.Tablero[fi][ci] = "--"; 
                Tablero.turno=true;
                Tablero.ImprimirTablero();                 
            }
            }else{
                System.out.println("");
                System.out.println("");
                System.out.print("¡Movimiento invalido!");
                Tablero.ImprimirTablero();
            }
        }           
    }
}
