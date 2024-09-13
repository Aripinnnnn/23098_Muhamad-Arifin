/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan3;

/**
 *
 * @author Asus
 */
public class KonversiSuhu {
    //Method untuk konversi Celsius ke Farenheit 
    public double CelciusToFarenheit(int celcius, double rumus){
        //mengembalikan nilai sesuai dengan rumus konversi
        return (rumus * celcius) + 32;
    }
    //Method untuk konversi Celsius ke reamur
    public double CelciusToReamur(int celcius, double rumus){
        //mengembalikan nilai sesuai dengan rumus konversi
        return rumus * celcius;
    }
}
