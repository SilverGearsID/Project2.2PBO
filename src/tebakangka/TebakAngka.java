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
import java.util.Scanner;
public class TebakAngka {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean stop = false;
        Scoring scoring = new Scoring();
        RandomInt angka = new RandomInt();
        angka.kocokan();
        System.out.println("Hai! Nama saya Mr. Lappie. Saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!");
        while(stop == false){
            Scanner x = new Scanner(System.in);
            int jawab = x.nextInt();
            if (jawab < angka.x){
                scoring.minus();
                System.out.println("Hehehe... Bilangan anda terlalu kecil! ;)");
            }
            else if (jawab > angka.x){
                scoring.minus();
                System.out.println("Hehehe... Bilangan anda terlalu besar! ;)");
            }
            else if (scoring.skor == 0){
                System.out.println("Sayang sekali anda gagal menebak angkanya :(");
                stop = true;
            }
            else{
                if (scoring.coba <= 5){
                    scoring.bonus();
                    System.out.println("Yeeey! Bilangan tebakan anda benar, dan anda mendapatkan bonus skor! :)");
                    System.out.println("Tebakan anda: " + scoring.coba);
                    System.out.println("Skor anda: " + scoring.skor);
                }
                else{
                    System.out.println("Yeeey! Bilangan tebakan anda benar. Tapi sayang sekali, anda tidak mendapatkan bonus skor :(");
                    System.out.println("Tebakan anda: " + scoring.coba);
                    System.out.println("Skor anda: " + scoring.skor);
                }
                stop = true;
            }
        }
    }
}
