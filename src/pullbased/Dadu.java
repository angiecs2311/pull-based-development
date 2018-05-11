/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pullbased;
import java.util.Random;
/**
 *
 * @author Asus
 */

public final class Dadu {
    public static final int DEFAULT_SISI = 6;
    private static Random randGenerator = new Random();
    private final int jumSisi;
    private int hasil, tamp = 0;
    public Dadu() {
        this(DEFAULT_SISI);
    }
    
    public Dadu(int numSides) {
        this.jumSisi = numSides;
    }
    
    public int lempar() {
        do{
            hasil = randGenerator.nextInt(jumSisi) + 1;
        } while(hasil == tamp);
        System.out.println("Hasil: "+hasil);
        tamp = hasil;
        
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
}

