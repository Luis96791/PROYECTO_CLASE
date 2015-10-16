/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jorge
 */
public class Caballo extends Ficha {

    public Caballo(String Caracter, int Color) {
        super(Caracter, Color);
    }

    
    @Override
    public boolean validar(int xi,int yi,int xf,int yf,int juga) {
        //System.out.println("Validando si se puede mover el caballo");
         if (xf == (xi - 2) && yf == (yi - 1)){//7
            return true;
        } else if (xf == (xi-2) && yf == (yi+1)){//6
            return true;
        } else if (xf == (xi+2) && yf == (yi-1)){//2
            return true;
        } else if (xf == (xi+2) && yf == (yi+1)){//3
            return true;
        } else if (xf == (xi-1) && yf == (yi-2)){//8
            return true;
        } else if (xf == (xi-1) && yf == (yi+2)){//5
            return true;
        } else if (xf == (xi+1) && yf == (yi-2)){//1
            return true;
        } else if (xf == (xi+1) && yf == (yi+2)){//4
            return true;
        }
        return false; 
    }
}