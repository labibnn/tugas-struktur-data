/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author MyBook14F
 */
public class MethodProsedure {
    public static void main(String[] args) {
        MethodProsedure rata_rata = new MethodProsedure();
        rata_rata.rata_rata();
    }
    
    // prosedure menghitutung rata rata
    public void rata_rata (){
        int ilsamnusantara = 92;
        int fisika = 78;
        int ips = 81;
        
        int[] semua_nilai = {ilsamnusantara, fisika, ips};
        double jumlah = 0;
        double rata2;
        for(int i = 0; i<semua_nilai.length; i++){
            jumlah += semua_nilai[i];
        }
        rata2 = jumlah/semua_nilai.length;
        System.out.println("Rata Rata Nilai = " + rata2);
    }
}