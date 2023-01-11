/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan3;

public class Main {
    public static void main(String[] args) {
       //Membuat object dari class Bola
       Bola futsal = new Bola(5, "Putih Merah", "Yogo");
       Bola basket = new Bola(7, "Orange Hitam", "Nur");
       
       //memanggil method
       basket.showProfile();
       futsal.showProfile();
    }
}
