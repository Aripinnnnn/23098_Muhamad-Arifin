/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan5;
//mengimport class scanner
import java.util.*;
/**
 *
 * @author Asus
 */
public class DataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek Mahasiswa dan memanggil class Scanner
        Scanner Mahasiswa = new Scanner(System.in);
        //Input
        System.out.print("NPM : ");
        String NPM = Mahasiswa.nextLine();
        System.out.print("Nama Mahasiswa : ");
        String Nama = Mahasiswa.nextLine();
        System.out.print("Nilai Kehadiran : ");
        Double NilaiKehadiran = Mahasiswa.nextDouble();
        System.out.print("Nilai Tugas : ");
        Double NilaiTugas = Mahasiswa.nextDouble();
        System.out.print("Nilai UTS : ");
        Double NilaiUTS = Mahasiswa.nextDouble();
        System.out.print("Nilai UAS : ");
        Double NilaiUAS = Mahasiswa.nextDouble();
        //Rumus Nilai Akhir
        Double NilaiAkhir = (NilaiKehadiran * 0.10)+(NilaiTugas * 0.20)+(NilaiUTS * 0.30)+(NilaiUAS * 0.40);
        char grade;
        String Keterangan;
        //Membuat pengkondisian dengan if else untuk grade dan keterangan
        if(NilaiAkhir <= 45){
            grade = 'E';
            Keterangan = "KURANG SEKALI";
        }else if(NilaiAkhir <= 55 && NilaiAkhir >= 46){
            grade = 'D';
            Keterangan = "KURANG";
        }else if(NilaiAkhir <= 65 && NilaiAkhir >= 56){
            grade = 'C';
            Keterangan = "CUKUP";
        }else if(NilaiAkhir <= 75 && NilaiAkhir >= 66){
            grade = 'B';
            Keterangan = "BAIK";
        }else{
        grade = 'A';
        Keterangan = "ISTIMEWA";
        }
        //output
        System.out.println("NPM Mahasiswa : "+NPM);
        System.out.println("Nama Mahasiswa : "+Nama);
        System.out.println("Nilai Rata-rata : "+NilaiAkhir);
        System.out.println("Grade : "+grade);
        System.out.println("Keterangan : "+Keterangan);
    }
    
}
