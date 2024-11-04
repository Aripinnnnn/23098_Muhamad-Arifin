/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan10;

/**
 *
 * @author Asus
 */
public class Mahasiswa {
    //inisialisasi variabel untuk menyimpan data nilai mahasiswa
    private String nim, nama, alamat, mata_kuliah;
    private float nilai1, nilai2, nilai3, nilai4, nilai5, nilai_akhir;
    //membuat constructor untuk variabel data mahasiswa
    public Mahasiswa(String nim, String nama, String alamat, String mata_kuliah, float nilai1, float nilai2, float nilai3, float nilai4, float nilai5){
        this.alamat = alamat;
        this.nama = nama;
        this.mata_kuliah = mata_kuliah;
        this.nim = nim;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
    }
    //Membuat method untuk mengembalikan nilai
    public String getalamat(){
        return alamat;
    }
    public String getnama(){
        return nama;
    }
    public String getnim(){
        return nim;
    }
    public String getmata_kuliah(){
        return mata_kuliah;
    }
    public float getnilai_akhir(){
        nilai_akhir = (nilai1 * 0.10f) + (nilai2 * 0.15f) + (nilai3 * 0.25f) + 
                      (nilai4 * 0.15f) + (nilai5 * 0.35f);
        return nilai_akhir;
    }
    public float getnilai1(){
        return nilai1;
    }
    public float getnilai2(){
        return nilai2;
    }
    public float getnilai3(){
        return nilai3;
    }
    public float getnilai4(){
        return nilai4;
    }
    public float getnilai5(){
        return nilai5;
    }
}
