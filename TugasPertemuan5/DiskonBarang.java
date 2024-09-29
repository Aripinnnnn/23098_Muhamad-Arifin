/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan5;
//Mengimport class Scanner
import java.util.*;
/**
 *
 * @author Asus
 */
public class DiskonBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek barang dan memangil class Scanner
        Scanner Barang = new Scanner(System.in);
        //Input
        System.out.print("Total Pembelian Rp.: ");
        int pembelian = Barang.nextInt();
        int diskon;
        //Pengkondisian if else untuk menentukan diskon
        if(pembelian < 50000){
            diskon = pembelian * 5/100;
        }else{
            diskon = pembelian * 20/100;
        }
        //rumus total pembayaran
        int total = pembelian - diskon;
        //output
        System.out.println("Besar Potongannya Rp."+diskon);
        System.out.println("Jumlah yang harus dibayar Rp."+total);
    }
    
}
