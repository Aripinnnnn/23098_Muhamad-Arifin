/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan6;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class TabelPerkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input user untuk nilai n
        System.out.print("Masukkan nilai 1 - 10 : ");
        int n = scanner.nextInt();
        // Jika nilai lebih besar dari 10 akan tampil output dibawah dan keluar
        if (n > 10) {
            System.out.println("Nilai n harus kurang dari atau sama dengan 10.");
            return;
        }
        // Memberikan spasi tab pada header table
        System.out.print("\t"); 
        //Looping for untuk menampilkan nilai header
        for (int i = 1; i <= n; i++) {
            //Menampilkan angka pada kolom
            System.out.print(i + "\t"); 
        }
        //Memulai baris baru setelah header
        System.out.println();
        // Menampilkan baris tabel dengan perkalian
        for (int i = 1; i <= n; i++) {
            //Menampilkan angka pada baris
            System.out.print(i + "\t"); 
            for (int j = 1; j <= n; j++) {
                // Menampilkan hasil perkalian
                System.out.print(i * j + "\t");
            }
            //Memulai baris baru setelah setiap baris tabel
            System.out.println(); 
        }
    }
    
}
