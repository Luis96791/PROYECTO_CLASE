/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jorge
 */
public class Alfil extends Ficha {

    public Alfil(String Caracter, int Color) {
        super(Caracter, Color);
    }

    @Override
    public boolean validar(int xi,int yi,int xf,int yf,int juga) {
        //System.out.println("moviendo piesa alfil ");
        if(juga==1||juga==2){   
          return Math.abs(xi-xf)==Math.abs(yi-yf); 
        }
        return false;
    }
}