/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pullbased;
import java.util.Random;
import java.awt.Color;
/**
 *
 * @author Asus
 */


public final class Dadu {
    public static final int DEFAULT_SISI = 6;
    private static Random randGenerator = new Random();
    private final int jumSisi;
    private int hasil;
    
    public Dadu(){  
        this(DEFAULT_SISI);
 
    }
    
    public Dadu(int numSides){
        this.jumSisi = numSides; 
    }
    
    public int lempar() {
        hasil = randGenerator.nextInt(jumSisi) + 1;
        return hasil;
    }
    
    public int getJumSisi() {
        return jumSisi;
    }

    public int getHasil() {
        return hasil;
    }

    @Override
    public String toString() {
        return "Jumlah sisi dadu: " + getJumSisi() + " hasil: " + getHasil();
    }
    public String getWarnaSisi(int hasil){
        Color color = null;
        
        switch(hasil){
            case 1: color=new Color(233,23,43);break;
            case 2: color=new Color(33,23,56);break;
            case 3: color=new Color(53,76,123);break;
            case 4: color=new Color(89,234,33);break;
            case 5: color=new Color(53,76,13);break;
            case 6: color=new Color(13,90,123);break;
            
        }
        
        return color.toString();
}
}