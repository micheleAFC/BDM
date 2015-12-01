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
public class Integrante {
    Instrumentos mi_instrumentos;
    
    public Integrante(Instrumentos ins){
        mi_instrumentos = ins;
    }
    public void TocarInstrumento(){
        mi_instrumentos.tocar('C');
    }
    public void CambiarInstrumento(Instrumentos ins){
        mi_instrumentos=ins;
    }
}
