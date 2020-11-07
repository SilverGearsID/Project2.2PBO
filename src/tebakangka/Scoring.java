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
public class Scoring {
    int skor;
    int coba;
    
    Scoring(){
        this.skor = 100;
        this.coba = 0;
    }
    
    void minus(){
        this.skor -= 2;
        this.coba += 1;
    }
    
    void bonus(){
        this.skor += 50;
    }
    
}
