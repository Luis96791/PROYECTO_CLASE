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

    public Dama(String Caracter, int Color) {
        super(Caracter, Color);
    }

    
    @Override
    public boolean validar(int xi,int yi,int xf,int yf,int juga) {
      
        
        if(juga==1){
            if(xf==xi && yf<yi){
                return true;
            }else if(xf==xi && yf>yi){
                return true;
            }else if(yf==yi && xf<xi){
                return true;
            }else if(yf==yi && xf>xi){
                return true;
            }else if(Math.abs(xi-xf)==Math.abs(yi-yf)){
                return true;
            }
            return false;
        }else if(juga==2){
            if(xf==xi && yf>yi){
                return true;

            }else if(xf==xi && yf<yi){
                return true;
            }else if(yf==yi && xf>xi){
                return true;
            }else if(yf==yi && xf<xi){
                return true;
            }else if(Math.abs(xi-xf)==Math.abs(yi-yf)){
                return true;
            }
            return false;
        }   
        return true; 
    }
 }