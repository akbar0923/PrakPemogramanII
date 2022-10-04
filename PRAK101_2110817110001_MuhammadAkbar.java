package pratikumpemrograman;

    import java.util.Scanner;

public class PRAK101_2110817110001_MuhammadAkbar {
    public static void main(String[]args){
        
        //deklarasi Variabel
        String Namalengkap, Tempatlahir, bulan;
        int TanggalLahir, BulanLahir, TahunLahir;
        float TinggiBadan,BeratBadan;
        
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap: ");
        Namalengkap = keyboard.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        Tempatlahir = keyboard.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        TanggalLahir = keyboard.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        BulanLahir = keyboard.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        TahunLahir = keyboard.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        TinggiBadan = keyboard.nextFloat();
        System.out.print("Masukkan Berat Badan: ");
        BeratBadan = keyboard.nextFloat();
        
        bulan = "a";
        if(BulanLahir == 1) {
            bulan = "januari";
        }
        else if (BulanLahir == 2) {
            bulan = "Februari";
        }
        else if (BulanLahir == 3) {
            bulan = "Maret";
        }
        else if (BulanLahir == 4) {
            bulan = "April";
        }
        else if (BulanLahir == 5) {
            bulan = "Mei";
        }
        else if (BulanLahir == 6) {
            bulan = "Juni";
        }
        else if (BulanLahir == 7) {
            bulan = "Juli";
        }
        else if (BulanLahir == 8) {
            bulan = "Agustus";
        }
        else if (BulanLahir == 9) {
            bulan = "September";
        }
        else if (BulanLahir == 10) {
            bulan = "Oktober";
        }
        else if (BulanLahir == 11) {
            bulan = "November";
        }
        else if (BulanLahir == 12) {
            bulan = "Desember";
        }
        
        
        System.out.println("Data telah ditambahkan");
        System.out.println("Nama Lengkap " + Namalengkap );
        System.out.println("Lahir di "+Tempatlahir);
        System.out.print("pada Tanggal "+TanggalLahir);
        System.out.print(" "+ bulan);
        System.out.println(" "+TahunLahir);
        System.out.print("Tinggi Badan "+TinggiBadan);
        System.out.println("cm");
        System.out.print("dan Berat Badan "+ BeratBadan);
        System.out.println("Kilogram");
     
    }
}
