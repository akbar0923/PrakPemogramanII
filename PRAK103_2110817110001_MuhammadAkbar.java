package pratikumpemrograman;

import java.util.Scanner;

public class PRAK103_2110817110001_MuhammadAkbar {
    public static void main(String[] args) {
        
        int i = 1,input;
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Input bilangan : ");
        input = keyboard.nextInt();  
        do {
            if (input % 7 == 0) {
                continue;
            }
            if (i == 5) System.out.print(input);
            else System.out.print(input + ", ");
            i++;
            input--;
        } while (i<=5);
    }
}
