package PRAK202_MuhammadAkbar_2110817110001;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Mobil {
   String merek,tahun_keluaran;
   int kapasitas,harga;
   private String pemilik;
   private int pajak;
   
  public Mobil(){
}
  public void setpemilik(String pm){
      pemilik=pm;
  }
  public void pajak(int pjk){
      pajak=pjk;
  }
  public String getpemilik (){
    return pemilik;
}
  public int getpajak(){
     return pajak=(harga*2)/100;
  }
  public void info(){
         
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        System.out.println("Merek Mobil: " + merek);
        System.out.printf("Harga: %s %n", kursIndonesia.format(harga));
        System.out.println("Tahun Keluaran : " + tahun_keluaran);
        System.out.println("Kapasitas : " + kapasitas +"cc");
        
    
}
}
