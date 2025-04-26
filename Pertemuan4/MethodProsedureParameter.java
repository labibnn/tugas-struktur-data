/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author MyBook14F
 */
public class MethodProsedureParameter {
    public static void main(String[] args) {
        MethodProsedureParameter mahasiswa = new MethodProsedureParameter();
        mahasiswa.simpan_nilai("Zidan", 85, 79, 95);
        mahasiswa.simpan_nilai("Restu", 95, 55, 80);
        mahasiswa.simpan_nilai("Zaki", 60, 75, 92);
    }
    
    public void simpan_nilai(String nama, int pkn, int fisika, int kalkulus){
        int[] kumpulan_nilai = {pkn, fisika, kalkulus};
        String[] matkul = {"PKN ", "FISIKA ", "KALKULUS "};
        for(int i=0; i<matkul.length; i++){
          System.out.println("Nilai " +  matkul[i] + nama + " : " + kumpulan_nilai[i]);
        }
        System.out.println("\n");
    }
}