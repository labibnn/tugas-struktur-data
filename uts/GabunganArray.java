/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author MyBook14F
 */
public class GabunganArray {
    public static void main(String[] args) {
        // Inisialisasi dua array
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Hitung panjang total array baru
        int[] hasilGabungan = new int[array1.length + array2.length];

        // Salin elemen dari array1 ke array hasilGabungan
        for (int i = 0; i < array1.length; i++) {
            hasilGabungan[i] = array1[i];
        }

        // Salin elemen dari array2 ke array hasilGabungan
        for (int i = 0; i < array2.length; i++) {
            hasilGabungan[array1.length + i] = array2[i];
        }

        // Cetak array hasil gabungan
        System.out.print("Array hasil gabungan: [");
        for (int i = 0; i < hasilGabungan.length; i++) {
            System.out.print(hasilGabungan[i]);
            if (i != hasilGabungan.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
