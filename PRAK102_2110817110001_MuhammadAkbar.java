
package pratikumpemrograman;

    import java.util.Scanner;
public class PRAK102_2110817110001_MuhammadAkbar {
   public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        int i = 0,hasil;
        System.out.print("Input bilangan : ");
        int input = keyboard.nextInt();
        System.out.print("Hasil nya adalah " );
        while (i < 7) {
        
            if (input % 2 == 0) {
                hasil = input / 2 -1;
                System.out.print(" " + hasil + " ");
            } else {
                System.out.print(input);
            }
            input++;
            i++;
        }
        keyboard.close();
    }
}
