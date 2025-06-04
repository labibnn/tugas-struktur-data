/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author MyBook14F
 */
import java.util.Stack;

public class ContohStack {
    public static void main(String[] args) {
        // Membuat objek stack bertipe String
        Stack<String> stack = new Stack<>();

        // Menambahkan elemen ke stack (push)
        stack.push("Satu");
        stack.push("Dua");
        stack.push("Tiga");

        // Menampilkan isi stack
        System.out.println("Isi stack: " + stack);

        // Melihat elemen paling atas tanpa menghapus (peek)
        System.out.println("Elemen paling atas: " + stack.peek());

        // Menghapus elemen paling atas (pop)
        String removed = stack.pop();
        System.out.println("Menghapus elemen: " + removed);

        // Menampilkan isi stack setelah pop
        System.out.println("Isi stack setelah pop: " + stack);

        // Mengecek apakah stack kosong
        System.out.println("Apakah stack kosong? " + stack.isEmpty());
    }
}
