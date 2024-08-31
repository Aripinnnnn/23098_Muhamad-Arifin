/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan1;

/**
 *
 * @author Asus
 */
public class Nilai {

    /**
     * @param args the command line arguments
     */
    String nim;
    String nama;
    double absen;
    double tugas;
    double uts;
    double uas;
    Nilai(String nim, String nama, double absen,double tugas,double uts,double uas){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }
    public double hitung(){
        return (absen * 0.1) + (tugas * 0.2) + (uts * 0.3) + (uas * 0.4);
    }
    public void CetakNilai(){
        System.out.println ("NIM : "+nim);        
        System.out.println ("Nama : "+nama);
        System.out.println ("Nilai Absen [10%] : "+absen);
        System.out.println ("Nilai Tugas [20%] : "+tugas);
        System.out.println ("Nilai UTS [30%] : "+uts);
        System.out.println ("Nilai UAS [40%] : "+uas);
        System.out.println ("Nilai Akhir : "+hitung());
    }
}
