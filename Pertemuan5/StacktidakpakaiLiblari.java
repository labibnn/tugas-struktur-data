/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author MyBook14F
 */
public class StacktidakpakaiLiblari {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Konstruktor: inisialisasi stack dengan ukuran tertentu
    public StacktidakpakaiLiblari(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Awalnya kosong
    }

    // Push: Menambahkan elemen ke atas stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak bisa menambahkan: " + value);
        } else {
            top++;
            stackArray[top] = value;
            System.out.println("Push: " + value);
        }
    }

    // Pop: Menghapus dan mengembalikan elemen teratas
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak bisa pop.");
            return -1;
        } else {
            int value = stackArray[top];
            top--;
            return value;
        }
    }

    // Peek: Melihat elemen teratas tanpa menghapus
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack kosong! Tidak bisa peek.");
            return -1;
        }
    }

    // Mengecek apakah stack kosong
    public boolean isEmpty() {
        return top == -1;
    }

    // Mengecek apakah stack penuh
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Tampilkan isi stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
        } else {
            System.out.print("Isi stack (dari bawah ke atas): ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method untuk mengetes stack
    public static void main(String[] args) {
        StacktidakpakaiLiblari stack = new StacktidakpakaiLiblari(5); // Stack dengan kapasitas 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Elemen teratas (peek): " + stack.peek());

        System.out.println("Pop elemen: " + stack.pop());
        stack.display();
    }
}
