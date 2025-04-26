/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author MyBook14F
 */
public class MethodFungsiParameter {
    public static void main(String[] args) {
        MethodFungsiParameter mahasiswa = new MethodFungsiParameter();
        mahasiswa.simpan_nilai("Andi", 87, 67, 95);
        mahasiswa.simpan_nilai("Zaki", 75, 83, 100); 
        
        MethodFungsiParameter Kalkulator = new MethodFungsiParameter();
        double rata2_Andi = Kalkulator.hitung_rata2("Andi", 87, 67, 95);
        System.out.println("Nilai Rata Rata nya Adalah " + rata2_Andi + "\n");
        
        double rata2_Zaki = Kalkulator.hitung_rata2("Zaki", 75, 83, 100);
        System.out.println("Nilai Rata Rata nya Adalah " + rata2_Zaki + "\n");
        
    }
    
    public void simpan_nilai(String nama, int pkn, int fisika, int mtk){
        int[] kumpulan_nilai = {pkn, fisika, mtk};
        String[] matkul = {"PKN ", "FISIKA ", "MTK "};
        for(int i=0; i<matkul.length; i++){
          System.out.println("Nilai " +  matkul[i] + nama + " : " + kumpulan_nilai[i]);
        }
        System.out.println("\n");
    }
    
    public double hitung_rata2 (String nama, int pkn, int fisika, int mtk){
        int[] kumpulan_nilai = {pkn, fisika, mtk};
        double jumblah = 0;
        double rata2;
        for(int i = 0; i<kumpulan_nilai.length; i++){
            jumblah += kumpulan_nilai[i];
        }
        rata2 = jumblah/kumpulan_nilai.length;
        System.out.println("Nama : " + nama);;
        return rata2;
    }
}