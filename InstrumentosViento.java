/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusica;

/**
 *
 * @author Michele
 */
public class InstrumentosViento extends Instrumentos{
    
    public InstrumentosViento(){
        
    }
    public void Tocar(char nota){
        System.out.println("Tocar instrumento de viento " + nota);
    }
}
