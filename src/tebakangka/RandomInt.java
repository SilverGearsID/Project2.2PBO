/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;
/**
 *
 * @author Rizky Alif
 */
import static java.lang.Math.sqrt;

public class RandomInt {
    int x;
    
    void kocokan(){
        int angka = (int)(Math.random() * 100 - 1);
        this.x = angka;
    }
}
