package PRAK202_MuhammadAkbar_2110817110001;

public class Soal2main {
    public static void main(String[]args){
        Mobil mobil1 = new Mobil();
        mobil1.merek = "Toyota Raize";
        mobil1.tahun_keluaran="2021";
        mobil1.kapasitas=988;
        mobil1.harga=202700000;
        
        mobil1.info();
        mobil1.setpemilik("kasel");
        System.out.println("Pemilik Mobil :"+ mobil1.getpemilik());
        System.out.println("Pajak Mobil :"+ mobil1.getpajak());
    }
}
