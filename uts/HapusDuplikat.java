/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author MyBook14F
 */
import java.util.Arrays;

public class HapusDuplikat {
    public static int[] hapusDuplikat(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        // Langkah 1: Urutkan array
        Arrays.sort(arr);

        // Langkah 2: Pindahkan elemen unik ke bagian awal array
        int indexUnik = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[indexUnik]) {
                indexUnik++;
                arr[indexUnik] = arr[i];
            }
        }

        // Langkah 3: Salin elemen unik ke array baru
        int[] hasil = new int[indexUnik + 1];
        for (int i = 0; i <= indexUnik; i++) {
            hasil[i] = arr[i];
        }

        return hasil;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 4, 5};
        int[] hasil = hapusDuplikat(input);

        // Cetak hasil
        System.out.print("Array tanpa duplikat: ");
        for (int angka : hasil) {
            System.out.print(angka + " ");
        }
    }
}

