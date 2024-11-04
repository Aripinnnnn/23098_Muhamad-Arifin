/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan10;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class InputNilai {
    //Menginisialisasi array list Mahasiswa dengan nama listmahasiswa
    ArrayList<Mahasiswa>listmahasiswa;
    public InputNilai(){
        listmahasiswa = new ArrayList();
    }
    //Method untuk memasukkan data
    public void insertData(String nim, String nama, String alamat, String mata_kuliah, float nilai1, float nilai2, float nilai3, float nilai4, float nilai5){
        Mahasiswa mhs= new Mahasiswa(nim, nama, alamat, mata_kuliah, nilai1, nilai2, nilai3, nilai4, nilai5);
        listmahasiswa.add(mhs);
    }
    //Method untuk menampilkan isi data
    public ArrayList<Mahasiswa>getAll(){
        return listmahasiswa;
    }
    //Method untuk menghapus data
    public void deleteData(int index){
        listmahasiswa.remove(index);
    }
}
