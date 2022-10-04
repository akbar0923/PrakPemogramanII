package pratikumpemrograman;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PRAK105_2110817110001_MuhammadAkbar {
        public static void main(String[] args) {
        double jari_jari, tinggi, hasil;
        
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        
        System.out.print("Masukkan jari-jari : ");
        jari_jari = keyboard.nextDouble();
        
        System.out.print("Masukkan tinggi : ");
        tinggi = keyboard.nextDouble();
        
        hasil = 3.14 * jari_jari * jari_jari * tinggi;
        
        System.out.println("Volume tabung dengan jari-jari " + jari_jari + " cm ");
        System.out.println("dan tinggi " + tinggi + " cm ");
        System.out.println("adalah " + df.format(hasil) + " m3");
    }
}
