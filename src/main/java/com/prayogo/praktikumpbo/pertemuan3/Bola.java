
package com.prayogo.praktikumpbo.pertemuan3;

public class Bola {
    //attribute
    int jejari;
    String warna;
    String pemilik;
    
    //constraktor
    public Bola(int jejari, String warna, String pemilik){
    this.jejari = jejari;
    this.warna = warna;
    this.pemilik = pemilik;
    }
    
    //Method mencetak semua attribute
    public void showProfile(){
        System.out.println("Jejari : "+jejari);
        System.out.println("Warna : "+warna);
        System.out.println("Pemilik : "+pemilik);
    } 
}
