/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author MyBook14F
 */
public class QueuetanpaLiblary {
    private int maxSize;
    private int[] antrian;
    private int front;
    private int rear;
    private int jumlahItem;

    // Konstruktor
    public QueuetanpaLiblary(int ukuran) {
        maxSize = ukuran;
        antrian = new int[maxSize];
        front = 0;
        rear = -1;
        jumlahItem = 0;
    }

    // Menambahkan item ke antrian
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak bisa menambah item " + item);
        } else {
            rear++;
            antrian[rear] = item;
            jumlahItem++;
            System.out.println("Item " + item + " ditambahkan ke antrian.");
        }
    }

    // Menghapus item dari antrian
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa menghapus item.");
            return -1;
        } else {
            int temp = antrian[front];
            front++;
            jumlahItem--;
            System.out.println("Item " + temp + " dihapus dari antrian.");
            return temp;
        }
    }

    // Melihat item paling depan
    public int peek() {
        if (!isEmpty()) {
            return antrian[front];
        } else {
            System.out.println("Antrian kosong.");
            return -1;
        }
    }

    // Mengecek apakah antrian kosong
    public boolean isEmpty() {
        return (jumlahItem == 0);
    }

    // Mengecek apakah antrian penuh
    public boolean isFull() {
        return (rear == maxSize - 1);
    }

    // Menampilkan isi antrian
    public void tampilkan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Isi antrian: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(antrian[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method untuk pengujian
    public static void main(String[] args) {
        QueuetanpaLiblary q = new QueuetanpaLiblary(5); // Antrian dengan kapasitas 5

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.tampilkan();

        q.dequeue();
        q.tampilkan();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // Akan gagal karena antrian penuh
        q.tampilkan();

        System.out.println("Item depan: " + q.peek());
    }
}
