/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan8;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class TokoSerbaAda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Menginisialisasi Array 2 dimensi untuk menampung data barang
        String[][] barang = {
            {"a001", "Buku", "3000"},
            {"a002", "Pensil", "4000"},
            {"a003", "Pulpen", "5000"}
        };
        //Input Jumlah item barang
        System.out.print("Masukkan jumlah item barang: ");
        int JumlahItem = input.nextInt();
        // Membuat array 2 dimensi untuk menyimpan data belanja yaitu kode,nama, jumlah
        String[][] belanja = new String[JumlahItem][3]; 
        // Membuat array untuk menyimpan total harga barang
        int[]TotalHarga = new int[JumlahItem];
        // Inisialisasi variabel Total Bayarw
        int TotalBayar = 0;
        //Looping for untuk menginput barang berulang kali
        for (int i = 0; i < JumlahItem; i++) {
            //Input barang yang dibeli
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode Barang: ");
            String kode = input.next();
            System.out.print("Masukkan jumlah beli: ");
            int JumlahBeli = input.nextInt();
            // Mencari barang yang dibeli dan menghitung harga barang
            boolean found = false;
            for (int j = 0; j < barang.length; j++) {
                if (barang[j][0].equals(kode)) {
                    belanja[i][0] = kode;
                    belanja[i][1] = barang[j][1];
                    belanja[i][2] = String.valueOf(JumlahBeli);
                    TotalHarga[i] = Integer.parseInt(barang[j][2]) * JumlahBeli;
                    TotalBayar += TotalHarga[i];
                    found = true;
                    break;
                }
            }
            // Jika kode barang ditemukan program akan mengeluarkan output dibawah dan mengulang input
            if (!found) {
                System.out.println("Kode barang tidak ditemukan!");
                i--;
            }
        }
        // Output Struk barang
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("***************************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("==============================================================");
        // For loop untuk menampilkan barang yang dibeli
        for (int i = 0; i < JumlahItem; i++) {
            int no = i + 1;
            String kode = belanja[i][0];
            String nama = belanja[i][1];
            int harga = TotalHarga[i] / Integer.parseInt(belanja[i][2]);
            int jumlahBeli = Integer.parseInt(belanja[i][2]);
            int jumlahBayar = TotalHarga[i];
            System.out.printf(no +"     " + kode +"          " + nama +"      "+ harga +"        "+ jumlahBeli +"          "+ jumlahBayar+"\n");
        }
        System.out.println("==============================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t" + TotalBayar );
    }
    
}
