/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan7;

/**
 *
 * @author Asus
 */
public class Alphabet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Huruf A - Z
        System.out.println("Huruf A - Z :");
        //Looping for untuk mencetak Alphabet dari A - Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        //Huruf Z - A
        System.out.println("\nHuruf Z - A :");
        // Looping for untuk mencetak Alphabet dari Z - A
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
    }
    
}
