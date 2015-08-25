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
public class Menu {
    
    public static String j1;
    public static String j2;
    public static int validar=0;
    public static int a=0;
    
    public static void IngresarJugadores(){
        
        Scanner lea = new  Scanner(System.in);

        System.out.println("");
        System.out.print("Ingrese el nombre del jugador 1 (Fichas color Blancas): ");
        j1=lea.next();
        System.out.println("");
        System.out.print("Ingrese el nombre del jugador 2 (Fichas color Negras): ");
        j2=lea.next();
        System.out.println("");
        System.out.println("Comienza jugando "+j1+" con las fichas blancas");
        System.out.println("");
    }
    
    public static void Menu(){
        Scanner lea=new Scanner(System.in);
        do{
            System.out.println(" ");
            System.out.println("    AJEDREZ");
            System.out.println(" MENU PRINCIPAL");
            System.out.println("[1] Partida Nueva");
            System.out.println("[2] Estadisticas");
            System.out.println("[3] Salir");
            System.out.print("Elija una opcion: ");
            int op=lea.nextInt();

            switch(op){
                
                case 1:
                    if(validar==0){
                        IngresarJugadores();
                        validar++;
                    }
                    Tablero.ImprimirTablero();
                    break;
                case 2:
                    //Tiene que ver con estadistica
                    //Estadisticas est = new Estadisticas();
                    System.out.println(" ");
                    System.out.println("<----[Resultados de los ultimos 10 juegos]---->");
                    System.out.println(" ");

                for(int i=0;i < 10;i++){
                    System.out.print(i+1);
                    System.out.print("--");
                   // System.out.println(Estadisticas.estadistica[i]);
                    System.out.println(" ");
                }
                   //est.Estadisticas();
               break;

                case 3:
                    System.out.println("");
                    System.out.println("¡Gracias por Jugar!");
                    System.out.println("");
                    System.exit(0);

                default:
                    System.out.println("");
                    System.out.println("¡El numero ingresado es incorrecto! Vuelva a ingresarlo nuevamente");
                    System.out.println("");
                break;
            }       
        }while(a==0);
    }
    
    public static void main(String[] args) {
        Menu.Menu();
    }
}
