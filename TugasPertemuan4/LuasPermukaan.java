/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan4;

/**
 *
 * @author Asus
 */
//class LuasPermukaan inherit dengan class Volume
public class LuasPermukaan extends Volume {
    //Membuat variabel untuk rumus kubus dan balok
    int rumusBalok;
    int rumusKubus;
    //Memanggil konstruktor pada class volume dan menambahkan variabel rumus
    public LuasPermukaan(int p, int l, int t, int s, int rumusBalok, int rumusKubus) {
        super(p, l, t, s);
        this.rumusBalok = rumusBalok;
        this.rumusKubus = rumusKubus;   
    }
    //melakukan override pada method VolumeLuasBalok
    @Override
    public int VolumeLuasBalok(){
    return rumusBalok * (p * l)+(p *t)+(l * t);
}   //Melakukan override pada method VolumeLuasKubus
    @Override
    public int VolumeLuasKubus(){
    return rumusKubus * s * s;
}
}
