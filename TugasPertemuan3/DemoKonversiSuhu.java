/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan3;

/**
 *
 * @author Asus
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek dengan nama konversi dan memanggil class KonveriSuhu2
        KonversiSuhu2 konversi = new KonversiSuhu2();
        //Memanggil method-method konversi dan mengisi parameternya
        System.out.println("12 Celcius = "+konversi.CelciusToFarenheit(12, 1.8)+" Farenheit");
        System.out.println("12 Celcius = "+konversi.CelciusToReamur(12, 0.8)+" Reamur");
        System.out.println("12 Farenheit = "+konversi.farenheitToReamur(12, 0.44)+" Reamur");
    }
    
}
