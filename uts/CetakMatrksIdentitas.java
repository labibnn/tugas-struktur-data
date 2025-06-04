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

public class CetakMatrksIdentitas {

    // Fungsi untuk mengecek apakah matriks 3x3 adalah matriks identitas
    public static boolean isMatriksIdentitas(int[][] matriks) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && matriks[i][j] != 1) {
                    return false;
                } else if (i != j && matriks[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // Fungsi utama
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriks = new int[3][3];

        System.out.println("Masukkan elemen-elemen matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriks yang Anda masukkan:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        // Cek apakah matriks adalah identitas
        if (isMatriksIdentitas(matriks)) {
            System.out.println("Matriks tersebut adalah matriks identitas.");
        } else {
            System.out.println("Matriks tersebut BUKAN matriks identitas.");
        }

        scanner.close();
    }
}
