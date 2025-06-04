/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author MyBook14F
 */
import java.util.HashMap;
import java.util.Map;

public class HitungKemunculan {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 4, 2, 1};

        // Menggunakan HashMap untuk menyimpan jumlah kemunculan
        Map<Integer, Integer> frekuensi = new HashMap<>();

        // Menghitung kemunculan setiap elemen
        for (int num : array) {
            frekuensi.put(num, frekuensi.getOrDefault(num, 0) + 1);
        }

        // Menampilkan hasil
        for (Map.Entry<Integer, Integer> entry : frekuensi.entrySet()) {
            System.out.println("Elemen " + entry.getKey() + " muncul sebanyak " + entry.getValue() + " kali");
        }
    }
}

