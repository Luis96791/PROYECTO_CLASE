/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Tablero {
    
    public static boolean turno=true;
    public static String Tablero[][]={{"TN","CN","AN","KN","QN","AN","CN","TN"},{"PN","PN","PN","PN","PN","PN","PN","PN"},{"--","--","--","--","--","--","--","--"},{"--","--","--","--","--","--","--","--"}, {"--","--","--","--","--","--","--","--"},{"--","--","--","--","--","--","--","--"},{"PB","PB","PB","PB","PB","PB","PB","PB"},{"TB","CB","AB","QB","KB","AB","CB","TB"}};
    public static int contBlanco=0;
    public static int contNegro=0;

    public static void ImprimirTablero(){
    
        Scanner lea=new Scanner(System.in);

        System.out.println("");
        System.out.print("    "+"Negros: "+contNegro);
        System.out.print("    "+"Blancos: "+contBlanco);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.print("       ");
        System.out.println("   1    2    3    4    5    6    7    8" );
        
        for(int y=0; y< 8;y++){

            System.out.print("      ");
            System.out.print(y+1);
            
            for(int x=0; x< 8;x++){
                System.out.print(" ");
                System.out.print(" ");
                System.out.print(Tablero[y][x]);
                System.out.print(" ");
            }
                System.out.println("");
                System.out.println("");
        }
                System.out.println("Para retirarse ingrese -1 en la fila y columna");
                System.out.println("");
                System.out.print("Ingrese la posicion de la fila de la ficha que desea mover: ");
                int f1=lea.nextInt();
                System.out.println("");
                System.out.print("Ingrese la posicion de la columna de la ficha que desea mover: ");
                int col1=lea.nextInt();

        if(f1 == -1 && col1 ==-1){           
            char opcion;
            System.out.println("");
            System.out.print("Esta seguro(a) que desea retirarse?(S/N): ");
            opcion=lea.next().charAt(0);

            if(opcion=='s'||opcion=='S'){ 

            //Rey.MovimientoLadoBlanco=true;
            //Rey.MovimientoLadoNegro=true;
            
            Menu.validar=0;
            contBlanco=0;
            contNegro=0;
            
            Tablero[0][0]="TN"; Tablero[0][1]="CN"; Tablero[0][2]="AN"; Tablero[0][3]="KN"; Tablero[0][4]="QN"; Tablero[0][5]="AN"; Tablero[0][6]="CN"; Tablero[0][7]="TN";
            Tablero[1][0]="PN"; Tablero[1][1]="PN"; Tablero[1][2]="PN"; Tablero[1][3]="PN"; Tablero[1][4]="PN"; Tablero[1][5]="PN"; Tablero[1][6]="PN"; Tablero[1][7]="PN"; 
            Tablero[2][0]="--"; Tablero[2][1]="--"; Tablero[2][2]="--"; Tablero[2][3]="--"; Tablero[2][4]="--"; Tablero[2][5]="--"; Tablero[2][6]="--"; Tablero[2][7]="--";
            Tablero[3][0]="--"; Tablero[3][1]="--"; Tablero[3][2]="--"; Tablero[3][3]="--"; Tablero[3][4]="--"; Tablero[3][5]="--"; Tablero[3][6]="--"; Tablero[3][7]="--";
            Tablero[4][0]="--"; Tablero[4][1]="--"; Tablero[4][2]="--"; Tablero[4][3]="--"; Tablero[4][4]="--"; Tablero[4][5]="--"; Tablero[4][6]="--"; Tablero[4][7]="--";
            Tablero[5][0]="--"; Tablero[5][1]="--"; Tablero[5][2]="--"; Tablero[5][3]="--"; Tablero[5][4]="--"; Tablero[5][5]="--"; Tablero[5][6]="--"; Tablero[5][7]="--";
            Tablero[6][0]="PB"; Tablero[6][1]="PB"; Tablero[6][2]="PB"; Tablero[6][3]="PB"; Tablero[6][4]="PB"; Tablero[6][5]="PB"; Tablero[6][6]="PB"; Tablero[6][7]="PB"; 
            Tablero[7][0]="TB"; Tablero[7][1]="CB"; Tablero[7][2]="AB"; Tablero[7][3]="QB"; Tablero[7][4]="KB"; Tablero[7][5]="AB"; Tablero[7][6]="CB"; Tablero[7][7]="TB";

            if(turno){
            System.out.println("");
            System.out.println("");
            System.out.print("               ");
            System.out.println("El jugador: "+Menu.j2+" ¡GANO! porque el jugador "+Menu.j1 +" ha decidido retirarse de la partida");

            }else{
        
            Menu.validar=0;
            contBlanco=0;
            contNegro=0;
            
            Tablero[0][0]="TN"; Tablero[0][1]="CN"; Tablero[0][2]="AN"; Tablero[0][3]="KN"; Tablero[0][4]="QN"; Tablero[0][5]="AN"; Tablero[0][6]="CN"; Tablero[0][7]="TN";
            Tablero[1][0]="PN"; Tablero[1][1]="PN"; Tablero[1][2]="PN"; Tablero[1][3]="PN"; Tablero[1][4]="PN"; Tablero[1][5]="PN"; Tablero[1][6]="PN"; Tablero[1][7]="PN"; 
            Tablero[2][0]="--"; Tablero[2][1]="--"; Tablero[2][2]="--"; Tablero[2][3]="--"; Tablero[2][4]="--"; Tablero[2][5]="--"; Tablero[2][6]="--"; Tablero[2][7]="--";
            Tablero[3][0]="--"; Tablero[3][1]="--"; Tablero[3][2]="--"; Tablero[3][3]="--"; Tablero[3][4]="--"; Tablero[3][5]="--"; Tablero[3][6]="--"; Tablero[3][7]="--";
            Tablero[4][0]="--"; Tablero[4][1]="--"; Tablero[4][2]="--"; Tablero[4][3]="--"; Tablero[4][4]="--"; Tablero[4][5]="--"; Tablero[4][6]="--"; Tablero[4][7]="--";
            Tablero[5][0]="--"; Tablero[5][1]="--"; Tablero[5][2]="--"; Tablero[5][3]="--"; Tablero[5][4]="--"; Tablero[5][5]="--"; Tablero[5][6]="--"; Tablero[5][7]="--";
            Tablero[6][0]="PB"; Tablero[6][1]="PB"; Tablero[6][2]="PB"; Tablero[6][3]="PB"; Tablero[6][4]="PB"; Tablero[6][5]="PB"; Tablero[6][6]="PB"; Tablero[6][7]="PB"; 
            Tablero[7][0]="TB"; Tablero[7][1]="CB"; Tablero[7][2]="AB"; Tablero[7][3]="QB"; Tablero[7][4]="KB"; Tablero[7][5]="AB"; Tablero[7][6]="CB"; Tablero[7][7]="TB";

            System.out.println("");
            System.out.println("");
            System.out.print("               ");
            System.out.println("El jugador: "+Menu.j1+" ¡GANO! porque el jugador "+Menu.j2 +" ha decidido retirarse de la partida");
            
           
            Menu.Menu();
            System.out.println("");
            System.out.println("");
            }
              
        }else if(opcion=='n'||opcion=='N'){
            System.out.println("");
            System.out.println("");
            System.out.println("Usted sigue jugando, por favor continue...");
            ImprimirTablero();
        }
        }
    
        if((f1-1 > 8) || (col1-1 > 8) || (f1 == 0) || (col1 ==0) || (f1<-1) || (col1 < -1)){
            System.out.println("");
            System.out.println("");
            System.out.println("Coordenadas fueras del limite");
            ImprimirTablero();
        }
          
          if(Tablero[f1-1][col1-1].equals("--")){
          System.out.println("");
          System.out.println("");
          System.out.println("¡No hay ninguna ficha en esta posicion!");
          ImprimirTablero();
          }
          
        if(turno){
            
        if(Tablero[f1-1][col1-1].charAt(1) == 'B'){
          
            System.out.println("");
            System.out.print("Ingrese la posicion de la fila hacia la que desea mover su ficha: ");
            int fila2=lea.nextInt();
            System.out.println("");
            System.out.print("Ingresa la posicion de la columna hacia la cual desea mover su ficha: ");
            int columna2=lea.nextInt();
            System.out.println("");
            System.out.println("Es el turno del jugador: "+Menu.j2);

            if(Tablero[f1-1][col1-1].charAt(0) == 'C'){
                Ficha fich= new Caballo(0,0);
                Caballo cab=(Caballo)fich;
                cab.Mover(f1-1,col1-1,fila2-1,columna2-1);
            }else if(Tablero [f1-1][col1-1].charAt(0) == 'T'){
                Ficha fo=new Torre(0,0);
                Torre tor=(Torre)fo;
                tor.Mover(f1-1,col1-1,fila2-1,columna2-1);
            }else if(Tablero [f1-1][col1-1].charAt(0) == 'A'){
                Ficha g=new Alfil(0,0);
                Alfil que=(Alfil)g;
                que.Mover(f1-1,col1-1,fila2-1,columna2-1);
            }else if(Tablero [f1-1][col1-1].charAt(0) == 'K'){
                Ficha t=new Rey(0,0);
                Rey re=(Rey)t;
                re.Mover(f1-1,col1-1,fila2-1,columna2-1);
            }else if(Tablero [f1-1][col1-1].charAt(0) == 'Q'){
                Ficha jj=new Dama(0,0);
                Dama al=(Dama)jj;
                al.Mover(f1-1, col1-1,fila2-1,columna2-1);
            }else if(Tablero [f1-1][col1-1].charAt(0) == 'P'){
                Ficha pie=new Peon(0,0);
                Peon peo=(Peon)pie;
                peo.Mover(f1-1,col1-1, fila2-1, columna2-1);
            }
              
        }else{
            System.out.println("");
            System.out.println("");
            System.out.println("Es el turno del jugador: "+Menu.j1);
            ImprimirTablero();
        }
          
        }else if(!turno){      
            if((f1-1 > 8) || (col1-1 > 8) || (f1 == 0) || (col1 ==0) || (f1<-1) || (col1 < -1)){
                System.out.println("");
                System.out.println("");
                System.out.println("Coordenadas fueras del limite");
                ImprimirTablero();
            }
              
            if(Tablero[f1-1][col1-1].charAt(1)== 'N'){      
                  
                System.out.println("");
                System.out.print("Ingrese la posicion de la fila hacia la que desea mover su ficha: ");
                int fila2=lea.nextInt();
                System.out.println("");
                System.out.print("Ingresa la posicion de la columna hacia la cual desea mover su ficha: ");
                int columna2=lea.nextInt();
                System.out.println("");
                System.out.println("Es el turno del jugador: "+Menu.j1);

            if(Tablero[f1-1][col1-1].charAt(0) == 'C'){
                Ficha fich= new Caballo(0,0);
                Caballo cab=(Caballo)fich;
                cab.Mover(f1-1,col1-1,fila2-1,columna2-1);
            }else if(Tablero [f1-1][col1-1].charAt(0) == 'T'){
                Ficha fo=new Torre(0,0);
                Torre tor=(Torre)fo;
                tor.Mover(f1-1,col1-1,fila2-1,columna2-1);
            }else if(Tablero [f1-1][col1-1].charAt(0) == 'A'){
                Ficha g=new Alfil(0,0);
                Alfil que=(Alfil)g;
                que.Mover(f1-1,col1-1,fila2-1,columna2-1);
            }else if(Tablero [f1-1][col1-1].charAt(0) == 'K'){
                Ficha t=new Rey(0,0);
                Rey re=(Rey)t;
                re.Mover(f1-1,col1-1,fila2-1,columna2-1);
            }else if(Tablero[f1-1][col1-1].charAt(0) == 'Q'){
                Ficha jj=new Dama(0,0);
                Dama al=(Dama)jj;
                al.Mover(f1-1, col1-1,fila2-1,columna2-1);
            }else if(Tablero[f1-1][col1-1].charAt(0) == 'P'){
                Ficha pie=new Peon(0,0);
                Peon peo=(Peon)pie;
                peo.Mover(f1-1,col1-1, fila2-1, columna2-1);
            }
              
            }else{
                System.out.println("");
                System.out.println("");
                System.out.println("Es el turno del jugador: "+Menu.j2);
                ImprimirTablero();
            }    
        } 
    }
}
