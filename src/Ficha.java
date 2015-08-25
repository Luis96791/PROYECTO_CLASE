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
    
    protected int filaB;
    protected int coluB;
    protected int filaN;
    protected int coluN;
    protected static int fila=0;
    protected static int colu=0;
    public String resultado;
    
    public Ficha(int p1, int p2){
        fila=p1;
        colu=p2;
    }
    
    public abstract void Mover(int fila1, int colu1, int fila2, int colu2);
    
}
