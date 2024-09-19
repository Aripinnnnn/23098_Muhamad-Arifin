/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan4;

/**
 *
 * @author Asus
 */
public class DemoVolumeLuas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek vlm untuk memanggil class Volume dan mengisi parameternya
        Volume vlm = new Volume(5, 6, 7, 5);
        //Membuat objek ls untuk memanggil class LuasPermukaan dan mengisi parameternya
        LuasPermukaan ls = new LuasPermukaan(5, 6, 7, 5, 2, 6);
        //Mencetak Output
        System.out.println("Volume Kubus = "+vlm.VolumeLuasKubus());
        System.out.println("Volume Balok = "+vlm.VolumeLuasBalok());
        System.out.println("Luas Permukaan Kubus = "+ls.VolumeLuasKubus());
        System.out.println("Luas Permukaan Balok = "+ls.VolumeLuasBalok());
    }
}
    
