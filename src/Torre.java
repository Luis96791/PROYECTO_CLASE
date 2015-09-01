/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jorge
 */
public class Torre extends Ficha {

    public Torre(String Caracter, int Color) {
        super(Caracter, Color);
    }

    
    @Override
    public boolean validar(int xi,int yi,int xf,int yf,int juga) {
        //System.out.println("Validando si se puede mover la torre ");
                if(xf==xi && yf<yi){//1
                    return true;
                }else if(xf==xi && yf>yi){//2
                    return true;
                }else if(yf==yi && xf<xi){//4
                    return true;
                }else if(yf==yi && xf>xi){//3
                    return true;
                }
                return false;
            }
    
}