/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author MyBook14F
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueLiblary {
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();

        // Tambah pelanggan ke antrian
        antrian.add("Andi");
        antrian.add("Budi");
        antrian.add("Citra");

        System.out.println("Antrian saat ini: " + antrian);

        // Melayani pelanggan (FIFO)
        while (!antrian.isEmpty()) {
            String pelanggan = antrian.poll(); // ambil & hapus elemen pertama
            System.out.println("Melayani: " + pelanggan);
            System.out.println("Antrian tersisa: " + antrian);
        }

        // Cek jika antrian kosong
        if (antrian.isEmpty()) {
            System.out.println("Semua pelanggan telah dilayani.");
        }
    }
}

