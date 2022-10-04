package pratikumpemrograman;
import java.util.Scanner;
public class PRAK104_2110817110001_MuhammadAkbar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Kartu Andi : ");
        int andi1 = keyboard.nextInt();
        int andi2 = keyboard.nextInt();
        int andi3 = keyboard.nextInt();
        
        System.out.print("Kartu Budi : ");
        int budi1 = keyboard.nextInt();
        int budi2 = keyboard.nextInt();
        int budi3 = keyboard.nextInt();
                
        int andi = andi1 + andi2 + andi3;
        int budi = budi1 + budi2 + budi3;
        
       if(andi1 > budi1){
            andi++;
        }else if(andi1 == budi1){
            
        }else{
            budi++;
        }    
        if(andi2 > budi2){
            andi++;
        }else if(andi2 == budi2){
            
        }else{
            budi++;
        }
        if(andi3 > budi3){
            andi++;
        }else if(andi3 == budi3){ 
        }else{
            budi++;
        }
        if(andi > budi){
            System.out.println("Andi");
        }else if(andi == budi){
            System.out.println("Seri");
        }else{
            System.out.println("Budi");}
    }
}
