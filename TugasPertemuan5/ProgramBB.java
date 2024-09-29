/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan5;
//Mengimport class scanner
import java.util.*;
/**
 *
 * @author Asus
 */
public class ProgramBB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek bb dan memanggil class Scanner
        Scanner bb = new Scanner(System.in);
        //Input
        System.out.print("Masukkan berat badan Anda (KG) : ");
        double beratbadan = bb.nextDouble();
        System.out.print("Masukkan tinggi badan Anda (M) : ");
        double tinggibadan = bb.nextDouble();
        //rumus IMT
        double IMT = beratbadan / (tinggibadan * tinggibadan);
        String kriteria;
        //Pengkondisian untuk menentukan kriteria
        if(IMT <= 18.4){
            kriteria = "Berat Badan Kurang";
        }else if(IMT <= 24.9 && IMT >= 18.5){
            kriteria = "Berat Badan Ideal";
        }else if(IMT <= 29.9 && IMT >= 25){
            kriteria = "Berat Badan Lebih";
        }else if(IMT <= 39.9 && IMT >= 30){
            kriteria = "Gemuk";
        }else{
            kriteria = "Sangat Gemuk";
        }
        //Output
        System.out.println("Kriteria Anda : "+kriteria);
    }
    
}
