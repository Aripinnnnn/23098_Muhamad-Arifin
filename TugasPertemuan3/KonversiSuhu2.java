/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan3;

/**
 *
 * @author Asus
 */
//class KonversiSuhu2 inherit dengan class KonversiSuhu
public class KonversiSuhu2 extends KonversiSuhu {
    //Method untuk konversi Farenheit ke Reamur
    public double farenheitToReamur(int farenheit, double rumus){
        //mengembalikan nilai sesuai dengan rumus konversi
        return rumus * (farenheit - 32);
    }
}
