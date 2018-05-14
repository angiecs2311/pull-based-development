/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pullbased;

/**
 *
 * @author Asus
 */
public class Pullbased {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Dadu dadu = new Dadu();
        int hasil=dadu.lempar();
        System.out.println("Warna dadu: "+dadu.getWarnaSisi(hasil));
    }
    
}
