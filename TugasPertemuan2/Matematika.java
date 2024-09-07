/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author Asus
 */
public class Matematika implements InterfaceMatematika{
    int a, b;
    //Method untuk operasi penambahan
    public int Pertambahan(int a, int b){
        //mengembalikan nilai dengan operasi penambahan
        return a + b;
    };
    //Method untuk operasi pengurangan
    public int Pengurangan(int a, int b){
        //mengembalikan nilai dengan operasi pengurangan
        return a - b;
    };
    //Method untuk operasi perkalian
    public int Perkalian(int a, int b){
        //mengembalikan nilai dengan operasi perkalian
        return a * b;
    };
    //Method untuk operasi pembagian
    public int Pembagian(int a, int b){
        //mengembalikan nilai dengan operasi pembagian
        return a / b;
    }
}
