/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
/**
 *
 * @author Jefferson
 */
public class CargarPrograma extends Thread{
    
    JProgressBar progreso;
    
    public CargarPrograma(JProgressBar progreso){
        super();
        this.progreso = progreso;
    }
    
   public void run(){
       for(int a = 1; a<=100;a++){
           progreso.setValue(a);
           pausa(50);
       }
   }
    
   public void pausa(int mlseg){
        try {
            Thread.sleep(mlseg);
        } catch (InterruptedException ex) {
            Logger.getLogger(CargarPrograma.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
}
