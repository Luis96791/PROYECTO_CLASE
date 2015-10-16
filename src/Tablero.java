/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class Tablero{
    static Ficha tablero[][]= new Ficha[8][8];
    
    public void inicializar(){
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                tablero[fila][columna] = new Ficha(){

                    @Override
                    public boolean validar(int xi,int yi,int xf,int yf,int juga) {
                        return true;
                    }
                };
            }
        }
        
        //torre blanca
        tablero[0][0]=new Torre("♖",1);
        tablero[0][7]=new Torre("♖",1);
        //caballos blancos
        tablero[0][1]=new Caballo("♘",1);
        tablero[0][6]=new Caballo("♘",1);
        //alfiles blancos
        tablero[0][2]=new Alfil("♗",1);
        tablero[0][5]=new Alfil("♗",1);
         //rey negro y blanco
        tablero[7][3]=new Rey("\u2654",2);
        tablero[0][4]=new Rey("\u2654",1);
        //reina blanca y negra
        tablero[7][4]=new Dama("\u2655",2);
        tablero[0][3]=new Dama("\u2655",1);
        //torre negros
        //Pieza ton=new torre("♜",2);
        tablero[7][0]=new Torre("♜",2);
        tablero[7][7]=new Torre("♜",2);   
        //caballos negros
        tablero[7][1]=new Caballo("♞",2);
        tablero[7][6]=new Caballo("♞",2);   
        //alfiles negros
        tablero[7][2]=new Alfil("♝",2);
        tablero[7][5]=new Alfil("♝",2);
     
        //peones blanco
       for (int fila = 1; fila < 2; fila++) {
         for (int columna = 0; columna < 8; columna++) {

           tablero[fila][columna]=new Peon("\u2659",1) ;
         }
       }
        
       //peones negros
       for (int fila = 6; fila < 7; fila++) {
           for (int columna = 0; columna < 8; columna++) {
               tablero[fila][columna]=new Peon("\u2659",2);
           }
       }
    }
    
    static void imprimir(){
        System.out.println("                          "+" Cantidad de piezas comidas :");
        System.out.println("0 1 2 3 4 5 6 7 ");
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
             System.out.print(tablero[fila][columna].Caracter);
            }
           System.out.print(" "+fila);
           System.out.println();
        }
        System.out.println("                           "+" Cantidad de piezas comidas :");
        System.out.println("");
    }
    
    public static boolean Comer(int jugados, int xf,int yf){
        int color=0;
        System.out.println("Validando tablero para el movimiento seleccionado");
        color = tablero[yf][xf].Color;
        if(tablero[yf][xf].Caracter.equals("░")){
            return true;
        }else if(color==jugador){
            return false;
        }else if(color!=jugador){
            if(color==1){
                piezas1++;//blancas 
                System.out.println(nom1+" Te has Comido la Pieza : "+Tablero[yf][xf].Caracter+"de tu adversario "+nom2);//agregado resiente
                 
                return true;
            }else{
                System.out.println(nom2+" Te has comido la Pieza "+Tablero[yf][xf].Caracter+"de tu adversario "+nom1);//agregado resiente
                piezas2++;//negras
                return true;
            }
            
        }
       
        return false;
    }
    //****************MOVIMIENTO POR JUGADOR 1 piesas negras  PRINCIPAL****************
    public static void movii(){
            int xi=0,yi=0;
            jugador=2;//aqui avia  un 1
            System.out.println("****Movimiento del  Jugador 1 Pieza  Negras***");
            System.out.println("Escriba la Cordenada de la Pieza  que desea Mover  ");
                do{
                    do{
                        System.out.println("Escriba la cordena en X "); 
                        xi=lea.nextInt();
                        if(xi<0 || xi>=8){
                            System.out.println("Cordenadas fuera de rango");
                        }
                    }while(xi<0 || xi>=8);
                    do{    
                        System.out.println("Escriba la Cordenaa en Y ");
                        yi=lea.nextInt();
                        if(yi<0 || yi>=8){
                            System.out.println("Cordenadas fuera de Rango");
                        }  
                    }while(yi<0 || yi>=8);
                    int color = Tablero[yi][xi].Color;
                    if( color != jugador){
                        System.out.println("Error la pieza seleccionada no pertenece al jugador actual");
                    }  
               }while(Tablero[yi][xi].Color != jugador);
                
                movif(xi,yi);
}
     ///funciona donde quiere mover la piesa
     static public void movif(int inicial,  int fin){
        System.out.println(Tablero[fin][inicial].Caracter);
        int xf=0,yf=0;
        boolean validacion, comer;
        comer = true;
        System.out.println("X: "+ inicial);
        System.out.println("Y: "+ fin);
        do{   
            System.out.println("***Adonde Quier Mover la Pieza ***");
            System.out.println("Escriba la cordenada en X y Y");
            do{
                System.out.println("Escriba la cordena en X ");
                xf=lea.nextInt();
                if(xf<0 || xf>=8){
                    System.out.println("Cordenadas fuera de Rango");
                }
            }while(xf<0 || xf>=8);   
            do{
                System.out.println("Escriba la Cordenaa en Y");
                yf=lea.nextInt();
                if(yf<0 || yf>=8){
                   System.out.println("Cordenadas fuera de Rango");
                }
            }while(yf<0 || yf>=8); 
            validacion = Tablero[fin][inicial].validar(inicial,fin,xf,yf,jugador);
            if(validacion){
                System.out.println("Movimiento valido para la pieza seleccionada");
                System.out.println(Tablero[fin][inicial].Caracter);
                comer = Comer(jugador, xf, yf);
                if(comer){
                   
                    Tablero[yf][xf]=Tablero[fin][inicial];
                    
                    Tablero[fin][inicial]=new Pieza() {
                        @Override
                        public boolean validar(int xi, int yi, int xf, int yf, int juga) {
                            return true;
                        }
                    };
                    
                    jaque();
                    
                    if(!validarrey()){
                        ganador=jugador;
                        System.out.println("Has Ganado  : "+jugador);
                        win = true;
                        //e
                        if(ganador==2){
                            if (!rendir){
                                msj2="perdida del rey";
                                nombres[tam]= new estadisticas (nom1,nom2,piezas1,msj2);
                               tam++;
                            }
                        }else if(ganador==1){
                            if (!rendir){
                               msj2="perdida del rey";
                                nombres[tam]=new estadisticas(nom2,nom1,piezas2,msj2);
                               tam++;
                            }

                        }
                        
                        return;
                    }
                }else{
                    System.out.println("No se puede Mover la Pieza");
                }
            }else{
                System.out.println("No se puede Mover la Pieza");
            }
        }while(validacion==false || comer == false);
    } 

     //****************MOVIMIENTO POR JUGADOR 2 piesas blancas PRINCIPAL****************
    public static void movii1(){
            int xi=0,yi=0;
            jugador=1;
            System.out.println("****Movimiento del  jugador 2 Pieza  blancas****");
            System.out.println("Escriba la Cordenada de la Pieza  que desea Mover  ");
                do{
                    do{
                        System.out.println("Escriba la cordena en X "); 
                        xi=lea.nextInt();
                        if(xi<0 || xi>=8){
                            System.out.println("Cordenadas fuera de Rango");
                        }
                    }while(xi<0 || xi>=8);
                    do{    
                        System.out.println("Escriba la Cordenaa en Y ");
                        yi=lea.nextInt();
                        if(yi<0 || yi>=8){
                            System.out.println("Cordenadas fuera de Rango");
                        }  
                    }while(yi<0 || yi>=8);
                    int color = Tablero[yi][xi].Color;
                    if( color != jugador){
                        System.out.println("Error la pieza seleccionada no pertenece al jugador actual");
                    }  
               }while(Tablero[yi][xi].Color != jugador);
                
                movif(xi,yi);
    
}
    
    //************************validar dsi es true false
    
    public static final void retorna(int xi,int yi,int xf,int yf,int jugador){
        if(Tablero[yi][xi].validar(xi,yi,xf,yf,jugador)==true){
            System.out.println("se esta moviendo la pieza");
        }else{
            System.out.println("no se puede mover  la pieza");
        }
    }
    
    ////fuinc validar jaque del rey 
    public static void jaque(){
        int rex,rey,jugar, color;
        rex=0;
        rey=0;
        jugar=0;
       
         for (int fila = 0; fila < 8; fila++) {
                for (int columna = 0; columna < 8; columna++) {
                  if(jugador == 2){  
                    if(Tablero[fila][columna].Caracter.equals("♔")){
                            rey=fila;
                            rex=columna;
                            break;
                        }     
                 }else if(jugador == 1){
                     if(Tablero[fila][columna].Caracter.equals("♚")){
                            rey=fila;
                            rex=columna;
                            break;
                     }     
                 }         
             }
                
        }
         /*for (int yi= 0; yi < 8; yi++) {
                for (int xi = 0; xi < 8; xi++) {
                    color = Tablero[yi][xi].Color;
                    if(jugador == color){
                        if(Tablero[yi][xi].validar(xi,yi,rex,rey,color)==true){
                            System.out.println("el rey esta en jaque");
                            return;
                        }
                    }
                }
    }*/
        if(jaquefila(rex, rey, 0 , 0, jugador)){
            System.out.println("el Rey esta en Jaque");
        }else{
            System.out.println("el Rey no esta en Jaque");
        }
    }
    
    ///funciono recursiva 
    public static boolean jaquefila(int rex, int rey, int xi, int yi, int color){
        if(yi==8){
            return false;
        }else{
            return jaquecol(rex,rey,xi,yi,color)||jaquefila(rex,rey,xi,++yi,color);
        }
    }
    ///segundd funcion recursiva
        public static boolean jaquecol(int rex, int rey,int xi, int yi, int color){
            boolean validar;
            validar = false;
            if(xi==8){
                return false;
            }else{
                if(Tablero[yi][xi].Color == color)
                    validar = Tablero[yi][xi].validar(xi,yi,rex,rey,color);
                    if(validar)
                        System.out.println("AQUI!!");
                return validar ||jaquecol(rex,rey,xi+1,yi,color);
            }
        }
    
    
    
    
    
    
    //*****************validar si el rey aun esta en combate*****************
    
     public static boolean validarrey(){
      for (int fila = 0; fila < 8; fila++) {
                for (int columna = 0; columna < 8; columna++) {
                  if(jugador == 2){  
                    if(Tablero[fila][columna].Caracter.equals("♔")){
                           System.out.println("aun esta el rey  en el tablero"); 
                            return true;
                            
                        }    
                 }else if(jugador == 1){
                     if(Tablero[fila][columna].Caracter.equals("♚")){
                           System.out.println("aun esta  el rey en el tablero"); 
                            return true;
                     }    
                 }         
             }
        }
        return false;

}
}