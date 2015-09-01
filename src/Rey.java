/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jorge
 */
public class Rey extends Ficha {

    public Rey(String Caracter, int Color) {
        super(Caracter, Color);
    }

    
    @Override
    public boolean validar(int xi,int yi,int xf,int yf,int juga) {
     
        //System.out.println("Validando si se puede mover el rey ");
           if(xi==(xf+1) && (yi==(yf+1))){
               return true;
           }else if(xi==xf && (yi==(yf+1))){
               return true;
           }else if(xi==(xf-1) && (yi==(yf+1))){
               return true;
           }else if(xi==(xf+1)&&(yi==yf)){
               return true;
           }else if(xi==(xf-1)&&yi==yf){
               return true;
           }else if(xi ==(xf+1)&&yi==(yf-1)){
               return true;
           }else if(xf==xi && (yi==(yf-1))){
               return true;
           }else if(xi==(xf-1)&&(yi==(yf-1))){
               return true;
           }
           return false;
    }
}