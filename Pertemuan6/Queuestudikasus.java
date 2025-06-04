/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author MyBook14F
 */
import java.util.Scanner;

public class Queuestudikasus {
    private static final int MAX = 100;
    private String[] antrian = new String[MAX];
    private int front = 0;
    private int rear = -1;
    private int jumlah = 0;

    // Tambah pasien ke antrian
    public void tambahPasien(String nama) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak bisa menambahkan pasien: " + nama);
        } else {
            rear++;
            antrian[rear] = nama;
            jumlah++;
            System.out.println("Pasien " + nama + " berhasil ditambahkan ke antrian.");
        }
    }

    // Layani pasien (keluarkan dari antrian)
    public void layaniPasien() {
        if (isEmpty()) {
            System.out.println("Tidak ada pasien dalam antrian.");
        } else {
            String nama = antrian[front];
            front++;
            jumlah--;
            System.out.println("Pasien " + nama + " sedang diperiksa dokter.");
        }
    }

    // Lihat pasien berikutnya
    public void pasienBerikutnya() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Pasien berikutnya: " + antrian[front]);
        }
    }

    // Tampilkan semua pasien dalam antrian
    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Belum ada pasien dalam antrian.");
        } else {
            System.out.println("Daftar pasien dalam antrian:");
            for (int i = front; i <= rear; i++) {
                System.out.println((i - front + 1) + ". " + antrian[i]);
            }
        }
    }

    // Cek apakah antrian penuh
    public boolean isFull() {
        return rear == MAX - 1;
    }

    // Cek apakah antrian kosong
    public boolean isEmpty() {
        return jumlah == 0;
    }

    // Main program
    public static void main(String[] args) {
        Queuestudikasus klinik = new Queuestudikasus();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== SISTEM ANTRIAN PASIEN KLINIK ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Layani Pasien");
            System.out.println("3. Lihat Pasien Berikutnya");
            System.out.println("4. Lihat Semua Pasien");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine(); // untuk konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pasien: ");
                    String nama = input.nextLine();
                    klinik.tambahPasien(nama);
                    break;
                case 2:
                    klinik.layaniPasien();
                    break;
                case 3:
                    klinik.pasienBerikutnya();
                    break;
                case 4:
                    klinik.tampilkanAntrian();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        input.close();
    }
}
