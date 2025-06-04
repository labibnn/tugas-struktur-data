/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author MyBook14F
 */
public class StackSederhana {
    static String[] tumpukan; // array stack
    static int kapasitas;
    static int top;

    // Inisialisasi ukuran stack
    void inisialisasiUkuran(int ukuran) {
        kapasitas = ukuran;
        tumpukan = new String[kapasitas];
        top = 0;
    }

    // Cek apakah stack kosong
    boolean isKosong() {
        return top <= 0;
    }

    // Cek apakah stack penuh
    boolean isPenuh() {
        return top >= kapasitas;
    }

    // Menambahkan data ke dalam stack
    void tambahData(String data) {
        if (isPenuh()) {
            System.out.println("Tumpukan penuh! Tidak bisa menambahkan data: " + data);
        } else {
            System.out.println("Menambahkan \"" + data + "\" ke dalam tumpukan.");
            tumpukan[top++] = data;
        }
    }

    // Mengambil data paling atas dari stack
    void ambilTeratas() {
        if (isKosong()) {
            System.out.println("Tumpukan kosong! Tidak ada data yang bisa diambil.");
        } else {
            String data = tumpukan[--top];
            System.out.println("Mengambil data teratas: " + data);
        }
    }

    // Mencari data di dalam tumpukan
    void cariData(String dataDicari) {
        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0; i < top; i++) {
            if (tumpukan[i].equals(dataDicari)) {
                ditemukan = true;
                posisi = i + 1;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Data \"" + dataDicari + "\" ditemukan di posisi tumpukan ke-" + posisi);
        } else {
            System.out.println("Data \"" + dataDicari + "\" tidak ditemukan di tumpukan.");
        }
    }

    // Menampilkan seluruh isi tumpukan
    void tampilkanSemua() {
        System.out.println("========== Isi Tumpukan Barang ==========");
        if (isKosong()) {
            System.out.println("Tumpukan masih kosong.");
        } else {
            for (int i = top - 1; i >= 0; i--) {
                System.out.println("Tumpukan ke-" + (i + 1) + ": " + tumpukan[i]);
            }
        }
        System.out.println("=========================================");
    }

    // Main method untuk demo
    public static void main(String[] args) {
        StackSederhana tumpukan = new StackSederhana();
        tumpukan.inisialisasiUkuran(6);

        tumpukan.tambahData("Laptop");
        tumpukan.tambahData("Charger");
        tumpukan.tambahData("Headset");
        tumpukan.tambahData("Mouse");
        tumpukan.tambahData("Keyboard");
        tumpukan.tambahData("Flashdisk");

        tumpukan.ambilTeratas();
        tumpukan.tampilkanSemua();

        tumpukan.cariData("Keyboard");
        tumpukan.cariData("Monitor");
    }
}
