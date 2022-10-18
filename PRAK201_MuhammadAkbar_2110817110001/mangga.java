package PRAK201_MuhammadAkbar_2110817110001;

public class mangga {
    public String namaMangga;
    public float berat;
    public int jumlahBeli;
    public float totalBerat;
    public int totalHarga;

     mangga (String nama,float br,int jb, float tb,int th){
       namaMangga = nama;
       berat = br;
       jumlahBeli= jb;
       totalBerat=tb;
       totalHarga=th;
    }
    

    public void tokobuah(){
        System.out.println("Nama Mangga : " + namaMangga);
        System.out.println("Berat :"+berat +"kg");
        System.out.println("Jumlah Beli : "+ jumlahBeli);
        System.out.println("Total berat : "+ totalBerat  + " kg");
        System.out.println("Total harga : Rp. "+ totalHarga*jumlahBeli +"\n");
    }
}
