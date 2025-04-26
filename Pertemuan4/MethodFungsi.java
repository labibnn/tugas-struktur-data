/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author MyBook14F
 */
public class MethodFungsi {
    public static void main(String[] args) {
        MethodFungsi rata_rata = new MethodFungsi();
        double nilai = rata_rata.rata_rata();
        System.out.println("Rata Rata Nilai dari fungsi = " + nilai);
    }
    
    // fungsi untuk menghitung nilai rata rata 
    public double rata_rata(){   
        int kalkulus = 100;
        int pkn = 91;
        int aswaja = 87;
        
        int[] semua_nilai = {kalkulus, pkn, aswaja};
        double jumlah = 0;
        double rata2;
        for(int i = 0; i<semua_nilai.length; i++){
            jumlah += semua_nilai[i];
        }
        rata2 = jumlah/semua_nilai.length;
        return rata2;
    }
}