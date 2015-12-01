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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instrumentos [] a = new Instrumentos[5];
        a[0] = new InstrumentosViento();
        a[0].tocar('V');
        a[1] = new InstrumentosCuerda();
        a[1].tocar('C');
        a[2] = new InstrumentosPercusion();
        a[2].tocar('P');
        a[3] = new Flauta();
        a[3].tocar('f');
        a[4] = new Guitarra();
        a[4].tocar('g');
    }
    
}
