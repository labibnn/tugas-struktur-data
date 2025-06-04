/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author MyBook14F
 */
import java.util.Scanner;

public class TrasposisiMatriks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriks = new int[3][3];

        // Input matriks 3x3 dari pengguna
        System.out.println("Masukkan elemen-elemen matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = scanner.nextInt();
            }
        }

        // Cetak matriks asli
        System.out.println("\nMatriks Asli:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        // Transposisi matriks
        int[][] transposisi = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposisi[i][j] = matriks[j][i];
            }
        }

        // Cetak hasil transposisi
        System.out.println("\nMatriks Hasil Transposisi:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposisi[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
