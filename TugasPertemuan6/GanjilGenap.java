/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan6;

/**
 *
 * @author Asus
 */
public class GanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Menginisialisasi jumlah maksimal bilangan
        int max = 20;
        //Bilangan genap
        System.out.println("Bilangan Genap dari 0 hingga 20:");
        //melakukan loopig for untuk menentukan bilangan genap dari 0-20
        for (int i = 0; i <= max; i++) {
            //Jika hasil angka di modulus 2 adalah 0 maka bilangan genap
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        //Bilangan ganjil
        System.out.println("\nBilangan Ganjil dari 0 hingga 20:");
        //melakukan loopig for untuk menentukan bilangan genap dari 0-20
        for (int i = 0; i <= max; i++) {
            //Jika hasil angka di modulus 2 bukan 0 maka bilangan ganjil
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    
}
