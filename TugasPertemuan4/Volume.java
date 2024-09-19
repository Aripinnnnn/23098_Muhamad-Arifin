/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan4;

/**
 *
 * @author Asus
 */
public class Volume {
    //Membuat variabel untuk kubus dan balok
    int s;
    int p;
    int l;
    int t;
    //Membuat constructor untuk variabel p, l, t, dan s
    public Volume(int p, int l, int t, int s){
        this.p = p;
        this.l =l;
        this.t = t;
        this.s = s;
    }
    //Membuat method untuk volume kubus
    public int VolumeLuasKubus(){
        return s * s * s;
    }
    //Membuat method untuk luas permukaan balok
    public int VolumeLuasBalok(){
        return p * l * t;
    }
}
