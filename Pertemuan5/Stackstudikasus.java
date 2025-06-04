/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author MyBook14F
 */
import java.util.Scanner;

public class Stackstudikasus  {
    private static final int MAX = 100;
    private String[] stack = new String[MAX];
    private int top = -1;

    // Tambahkan kata ke stack
    public void ketikKata(String kata) {
        if (isFull()) {
            System.out.println("Catatan penuh. Tidak bisa menambahkan kata.");
        } else {
            top++;
            stack[top] = kata;
            System.out.println("Kata \"" + kata + "\" telah ditambahkan.");
        }
    }

    // Undo kata terakhir
    public void undo() {
        if (isEmpty()) {
            System.out.println("Tidak ada kata untuk di-undo.");
        } else {
            System.out.println("Undo kata: \"" + stack[top] + "\"");
            top--;
        }
    }

    // Lihat kata terakhir
    public void lihatKataTerakhir() {
        if (isEmpty()) {
            System.out.println("Catatan kosong.");
        } else {
            System.out.println("Kata terakhir: \"" + stack[top] + "\"");
        }
    }

    // Tampilkan seluruh isi catatan
    public void tampilkanCatatan() {
        if (isEmpty()) {
            System.out.println("Catatan kosong.");
        } else {
            System.out.print("Isi catatan: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Cek apakah stack penuh
    private boolean isFull() {
        return top == MAX - 1;
    }

    // Cek apakah stack kosong
    private boolean isEmpty() {
        return top == -1;
    }

    // Main program
    public static void main(String[] args) {
        Stackstudikasus catatan = new Stackstudikasus();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Aplikasi Catatan (Fitur Undo) ===");
            System.out.println("1. Ketik Kata");
            System.out.println("2. Undo Kata Terakhir");
            System.out.println("3. Lihat Kata Terakhir");
            System.out.println("4. Tampilkan Catatan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kata: ");
                    String kata = input.nextLine();
                    catatan.ketikKata(kata);
                    break;
                case 2:
                    catatan.undo();
                    break;
                case 3:
                    catatan.lihatKataTerakhir();
                    break;
                case 4:
                    catatan.tampilkanCatatan();
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        input.close();
    }
}
