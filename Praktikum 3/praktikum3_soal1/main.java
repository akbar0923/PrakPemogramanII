package praktikum3_soal1;

import java.util.Scanner;
public class main {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dadu dd = new dadu();
        int masukkan = input.nextInt();

        dd.setInput(masukkan);
        dd.acakNilai();
    }
}
