/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author Asus
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Memanggil class Matematika dan membuat objek bernama mtk
        Matematika mtk  = new Matematika();
        //Membuat parameter untuk setiap method serta mencetak hasilnya
        int HasilTambah = mtk.Pertambahan(20, 10);
        System.out.println("Pertambahan 20 + 10 = "+HasilTambah);
        int HasilKurang = mtk.Pengurangan(10, 5);
        System.out.println("Pengurangan 10 - 5 = "+HasilKurang);
        int HasilKali = mtk.Perkalian(10, 3);
        System.out.println("Perkalian 10 x 3 = "+HasilKali);
        int HasilBagi = mtk.Pembagian(21, 2);
        System.out.println("Pembagian 21 / 3 = "+HasilBagi);
    }
    
}
