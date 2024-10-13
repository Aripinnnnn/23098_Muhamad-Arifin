/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan6;

/**
 *
 * @author Asus
 */
public class AnakAyam {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        //Menginisialisasi jumlah anak ayam 
        int AnakAyam = 4;  
        // Anak ayam bagian pertama
        System.out.println("Tek kotek, kotek kotek");
        System.out.println("Anak ayam turunlah berkotek");
        System.out.println("Tek kotek, kotek kotek");
        System.out.println("Anak ayam turunlah berkotek");
        // Looping while untuk mencetak lirik anak ayam mati satu per satu
        while (AnakAyam > 1) {
            System.out.println("Anak ayam turunlah " + AnakAyam);
            System.out.println("Mati satu tinggallah " + (AnakAyam - 1));
            //Decrement untuk mengurangi jumlah anak ayam
            AnakAyam--;
            // Anak ayam bagian kedua
            if(AnakAyam - 1 == 1){
                 System.out.println("Tek kotek, kotek kotek");
                 System.out.println("Anak ayam turunlah berkotek");
                 System.out.println("Tek kotek, kotek kotek");
                 System.out.println("Anak ayam turunlah berkotek");
            }
            // Jika anak ayam sisa satu maka tinggal induknya
            if (AnakAyam - 1 == 0) {
                System.out.println("Anak ayam turunlah "+AnakAyam);
                System.out.println("Mati satu tinggallah induknya");
            }
        }
    }
    
}
