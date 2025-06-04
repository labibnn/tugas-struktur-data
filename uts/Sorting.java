/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author MyBook14F
 */
public class Sorting {

    public static void main(String[] args) {
        String[] namaAsli = {"Zahra", "Andi", "Rina", "Yanto", "Santi", "Doni", "Tomo"};

        // Insertion Sort
        String[] insertionSorted = namaAsli.clone();
        insertionSort(insertionSorted);
        System.out.println("Hasil Insertion Sort:");
        tampilkanArray(insertionSorted);

        // Selection Sort
        String[] selectionSorted = namaAsli.clone();
        selectionSort(selectionSorted);
        System.out.println("\nHasil Selection Sort:");
        tampilkanArray(selectionSorted);

        // Bubble Sort
        String[] bubbleSorted = namaAsli.clone();
        bubbleSort(bubbleSorted);
        System.out.println("\nHasil Bubble Sort:");
        tampilkanArray(bubbleSorted);
    }

    // Insertion Sort
    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareToIgnoreCase(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Selection Sort
    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareToIgnoreCase(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Bubble Sort
    public static void bubbleSort(String[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimalisasi
        }
    }

    // Fungsi untuk mencetak array
    public static void tampilkanArray(String[] arr) {
        for (String nama : arr) {
            System.out.print(nama + " ");
        }
        System.out.println();
    }
}
