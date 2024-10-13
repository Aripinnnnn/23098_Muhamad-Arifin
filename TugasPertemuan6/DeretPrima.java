/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan6;

/**
 *
 * @author Asus
 */
public class DeretPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Inisialisasi bilangan maksimal
       int max = 20;
       //Bilangan Prima
       System.out.println("Bilangan Prima dari 0 hingga 20 : ");
       //Looping for untuk mencetak bilangan prima
        for (int i = 2; i <= max; i++) {
            //Pengkondisian if untuk memanggil method bilangan prima
            if (BilPrima(i)) {
                System.out.print(i + " ");
            }
        }
        //Bukan bilangan prima
        System.out.println("\nBilangan Bukan Prima dari 0 hingga 20:");
        //Looping fot untuk mencetak bukan bilangan prima
        for (int i = 0; i <= max; i++) {
            //Pengkondisian if untuk bukan yang bilangan prima
            if (!BilPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }
    //Method Bilangan Prima
    public static boolean BilPrima(int num) {
        //Jika nomor dibawah dan sama dengan 1 maka bukan bilangan prima
        if (num <= 1) {
            return false;
        }
        //Looping for untuk mengecek bilangan prima
        for (int i = 2; i < num; i++) {
            //Jika bilangan tersebut dimodulus 2 = 0 maka bukan bilangan prima
            if (num % i == 0) {
                return false;
            }
        }// Jika tidak maka bilangan prima
        return true;
    }
    
}
