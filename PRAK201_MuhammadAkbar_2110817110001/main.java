package PRAK201_MuhammadAkbar_2110817110001;
public class main {
     public static void main(String[] args){
        mangga Arumanis = new mangga("Arumanis",0.3f,13,3.9f,5000);
        mangga Manalagi = new mangga("Manalagi",0.5f,17,8.5f,7500);
        mangga ManggaMadu = new mangga("Mangga Madu",0.375f,12,4.5f,6500);
        
        
        Arumanis.tokobuah();
        System.out.println("");
        Manalagi.tokobuah();
        System.out.println("");
        ManggaMadu.tokobuah();
    }
}
