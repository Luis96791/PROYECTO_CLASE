
import java.util.ArrayList;
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
public class Player_Maintenance {
    Scanner sc = new Scanner(System.in);
    //IngresoInvalidoException iie = new IngresoInvalidoException();
    ArrayList<Player> plays = new ArrayList<>();//arreglo de players
    String notificar = "Proximamente estara disponible";
    boolean logged, cerrarMenu, cerrarEditar; //declarado true en buscarJugador y al momento de cerrar sesion false para q al buscar un nuevo jugador true de nuevo 
    public static Player jugadorLogged, jugadorInvitado;
    
    //para q por default tome el logged y me abra los sets y gets de Player
    //al final esta funcion me ayuda a mostrar, modificar, eliminar Player
    Player getJugador(){
        return jugadorLogged;
    }
    
    Player getInvitado(){
        return jugadorInvitado;
    }
    
    //funcion utilizada para no hacer tantos for's y para facilitar algunas validaciones
    Player buscar(String username){
        for (Player bp : plays) {
            if (bp.getUsername().equals(username)) {
                return bp;
            }
        }
        return null;
    }
    
    //solo falta hacer un ciclo que de vuelta cuando se ingrese un usuario que ya existe
    Player crearJugador(String us, String p, int cont){
        //boolean val_repeat = false;
        Player bp = buscar(us);//ayudandome de la funcion buscar
        if(bp == null){
            if (us.length()==0) {//donde us y p son valores enviados de parametro
                System.out.println("El Username esta vacio");
                return null;//puede retornar null tambien
            }
            
            if (us.equalsIgnoreCase("cancel")|| p.equalsIgnoreCase("cancel")) {//donde us y p son valores enviados de parametro
                System.out.println("Operacion cancelada por el usuario");
                return null;//puede retornar null tambien
            }
            
            if (p.length()!= 5) {//validacion
                System.out.println("Contrasenia debe ser igual a cinco Caracteres");
                return null;
            }
            
            plays.add(new Player(us, p, cont=0));//si todo se cumple procedemos a crear nu nuevo objeto
            System.out.println("Jugador Creado Exitosamente");
        }
        else{
            System.out.println("Ya existe un jugador con ese usuario");
        } 
        return null;
    }
    
    //listo
    void buscarJugador(String us, String p){
        Player bp = buscar(us);
        if (bp != null && bp.getPassword().equals(p)) {//donde bp.getPassword()bp me facilita acceder a los atributos de arreglo 
            System.out.println("Bienvenido  "+bp.getUsername()+" !");
                menuPrincipal(bp);//llama la funcion menuPrincipal de bp que se convierte como en el LOgged in
                //getJugador().equals(bp);
        }
        else{
            System.out.println("Usuerio y/o Contrasenia Invalidos..!");
        }
    }
    
    //listo
    void verDatos(Player jugadorLogged){//de parametro una funcion de tipo Player
        System.out.println("- Username: "+jugadorLogged.getUsername()+"  -Puntos: "+jugadorLogged.getPuntos());
        System.out.println("\t--Partidas Pendientes--");
        for (int i = 0; i < 5; i++) {
            System.out.println("\t"+(i+1)+". Partida Pendiente Guardada");
        }
    }
    
    //listo evaluar la funcionalidad de logged
    Player cerrarSesion(){
        logged = true;
        return null;
    }
    
    //listo
    void cambiarPassword(Player jugadorLogged){//cambia Password
        boolean validar = true;
        String notice = "*  Recuerde su Password debe contener 5 caracteres\n";
        do{
            System.out.print(notice+"Ingrese su nuevo Password:   ");
            String newPass = sc.next();
            if (newPass.length() == 5) {
                jugadorLogged.setPassword(newPass);//un set que recibe un dato local
                validar=false;
                System.out.println("Operacion Exitosa...");
            }else{
                System.out.println("Password debe ser igual a 5 caracteres");
            }
        }while(validar);
    }
    
    //listo
    void eliminarCuenta(Player jugadorLogged){
        System.out.print("Desea eliminar su Cuenta?:    ");
        String resp = sc.next();
        
        if (resp.equalsIgnoreCase("si")) {
            for (int i = 0; i < plays.size(); i++) {
                if (jugadorLogged.getUsername().equals(plays.get(i).getUsername())) {
                    //plays.get(i).equals(jugadorLogged);
                    plays.remove(i);
                    System.out.println("Jugador Eliminado..!");
                    logged = false; cerrarMenu = true; cerrarEditar = true;
                }
            }
        }
    }
    
    //casi listo
    void jugarAjedrez(Player jugadorLogged, Player jugadorInvitado){
        String notice ="  *Ingrese Username para Jugador Invitado\n";
        System.out.print(notice+"Ingrese Username: ");
        String us2 = sc.next();
        
        Player bi = buscar(us2);
        
        if (bi.getUsername().equals(us2)) {
            System.out.println("Bienvenido "+bi.getUsername()+" !");
            
        }
        Tablero.ImprimirTablero();
    }
    
    
    
    void menuPrincipal(Player jugadorLogged){//parametros que garantizan que el menu son de un player en especifico
        int opc; boolean continuar = true;
        do {
            cerrarMenu =false;
            System.out.println("\n\t** Menu Principal **\n\n\t1.- Jugar Ajedrez\n\t2.- Mi Perfil\n\t3.- Reportes\n\t4.- Cerrar Sesion\n");
            
            try{
            System.out.print("Elija una Opcion: ");
            opc = sc.nextInt();
            continuar = false;
                switch(opc){
                    case 1: menuJugar(); break;
                    case 2: menuPerfil(jugadorLogged); break;
                    case 3: menuReportes(); break;
                    case 4 : cerrarSesion();cerrarMenu = true;break;
                }
            }
            catch(InputMismatchException ime){
                System.out.println("Por favor Ingrese un Numero");
                sc.nextLine();
            }
        } while (cerrarMenu !=true||continuar);
    }
    
    void menuJugar(){
        boolean continuar=true;
        int opc;
        do {
            System.out.println("\n\t** Partidas **\n\n\t1.- Crear Partida\n\t2.- Cargar Partida\n\t3.- Eliminar Partida\n\t4.- Transferir Partida\n\t5.- Regresar a Menu Principal\n");
            try{
            System.out.print("Elija una Opcion: ");
            opc = sc.nextInt();
            //continuar = false;
                switch(opc){
                    case 1:jugarAjedrez(jugadorLogged, jugadorInvitado);break;
                    case 2:System.out.println(notificar);break;
                    case 3:System.out.println(notificar);break;
                    case 4:System.out.println(notificar);break;
                    case 5: continuar = false;break;
                }
            }
            catch(InputMismatchException ime){
                System.out.println("Por favor Ingrese un Numero");
                sc.nextLine();
            }
        } while (continuar);
    }
    
    void menuPerfil(Player jugadorLogged){
        int opc; boolean continuar = true;
        cerrarEditar = false;
        do {
            System.out.println("\n\t** Mi Perfil **\n\n\t1.- Ver mis Datos\n\t2.- Ver mis ultimos Juegos\n\t3.- Cambiar mi Password\n\t4.- Conectar a Facebook\n\t5.- Eliminar mi Cuenta\n\t6.- Regresar a Menu Principal\n");
            try{
            System.out.print("Elija una Opcion: ");
            opc = sc.nextInt();
            //continuar = false;
                switch(opc){
                    case 1:verDatos(jugadorLogged);break;
                    case 2:System.out.println(notificar);break;
                    case 3:cambiarPassword(jugadorLogged);break;
                    case 4:System.out.println(notificar);break;
                    case 5:eliminarCuenta(jugadorLogged);break;
                    case 6:cerrarEditar = true;continuar = false;break;
                }
            }
            catch(InputMismatchException ime){
                System.out.println("Por favor Ingrese un Numero");
                sc.nextLine();
            }
        } while (cerrarEditar != true&&continuar==true);
    }
    
    void menuReportes(){
        int opc; boolean continuar = true;
        do {
            System.out.println("\n\t** Reportes **\n\n\t1.- Ranking\n\t2.- Ultimos Juegos Globales\n\t3.- Regresar a Menu Principal\n");
            try{
            System.out.print("Elija una Opcion: ");
            opc = sc.nextInt();
            //continuar=false;
                switch(opc){
                    case 1:System.out.println(notificar);break;
                    case 2:System.out.println(notificar);break;
                    case 3:continuar=false; break;
                }
            }
            catch(InputMismatchException ime){
                System.out.println("Por favor Ingrese un Numero");
                sc.nextLine();
            }
        } while (continuar);
        
    }
    
    
    //Para comprobar que el ArrayList esta guardando
    void print(){
        for (int i = 0; i < plays.size(); i++) {
            System.out.println("Username:   "+plays.get(i).getUsername()+" Password:    "+plays.get(i).getPassword()+" Pts. "+plays.get(i).getPuntos());
        }
    }
}