/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK203_MuhammadAkbar_2110817110001;


public class Soal3main {
        public static void main(String[] args) {
            Pegawai p1 = new Pegawai();
            //kurang tanda ;
            //p1.nama = "Roi"
            p1.nama = "Roi";
            p1.asal = "Kingdom of Orvel";
            p1.setJabatan("Assasin");
            //pada file java tidak ada instansiasi variabel umur, sehingga kita perlu menginstansiasi nya sesuai dengan soal
            p1.umur = 17;
            System.out.println("Nama Pegawai: " + p1.getNama());
            System.out.println("Asal: " + p1.getAsal());
            System.out.println("Jabatan: " + p1.jabatan);
            //kita juga harus mengganti nilai yang dipanggil menjadi metode getUmur()
            System.out.println("Umur: " + p1.getUmur());
    }
}
