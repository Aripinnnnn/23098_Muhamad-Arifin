/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author Asus
 */
//Class Bingo yang berisi method untuk menampilkan lagu
public class Bingo {
    //Membuat variabel hands untuk menampung value
    String hands;
   //Membuat constructor untuk mengisi variabel hands
    public Bingo(String hands){
        this.hands = hands;
    }
    //Membuat method untuk menampilkan lagu menggunakan for loop dan if else
    public void bingoloop(){
    for(int i = 0; i <= 5; i++){
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        for(int j = 0; j < 3; j++){
            if(i <= 0){
                System.out.println("B-I-N-G-O");
            }
            else if(i <= 1){
                System.out.println(hands+"-I-N-G-O");
            }
            else if(i <= 2){
                System.out.println(hands+"-"+hands+"-N-G-O");
            }
            else if(i <= 3){
                System.out.println(hands+"-"+hands+"-"+hands+"-G-O");
            }
            else if(i <=4 ){
                System.out.println(hands+"-"+hands+"-"+hands+"-"+hands+"-O");
            }
            else{
                System.out.println(hands+"-"+hands+"-"+hands+"-"+hands+"-"+hands);
            }
        }
        System.out.println("And Bingo was his name-o.");
    }
    };
    
}
