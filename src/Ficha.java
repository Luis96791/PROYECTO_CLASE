/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jorge
 */
public abstract class Ficha {
    String Caracter;
    int Color;

    //1. Blanco, 2. Negro
    public Ficha() {
        Caracter = "_";
        Color = 0;
        
    }

    public Ficha(String Caracter, int Color) {
        this.Caracter = Caracter;
        this.Color = Color;
    }
    
    
    public abstract boolean validar(int xi,int yi,int xf,int yf,int juga);
        
}
