/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan3;

/**
 *
 * @author Asus
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek dengan nama mtk serta memanggil class matematika2
        Matematika2 mtk = new Matematika2();
        //Memanggil method-method operasi dan mengisi parameternya
        System.out.println("10 + 5 = "+mtk.Pertambahan(10, 5));
        System.out.println("10 - 5 = "+mtk.Pengurangan(10, 5));
        System.out.println("10 * 5 = "+mtk.Perkalian(10, 5));
        System.out.println("10 / 5 = "+mtk.Pembagian(10, 5));
        System.out.println("10 % 5 = "+mtk.Modulus(10, 5));
    }
    
}
