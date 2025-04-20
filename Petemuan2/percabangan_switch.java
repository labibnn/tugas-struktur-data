/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Petemuan2;

/**
 *
 * @author MyBook14F
 */public class percabangan_switch {
    public static void main(String[] args) {
        int hari = 3;

        switch (hari) {
            case 1 -> System.out.println("Senin");
            case 2 -> System.out.println("Selasa");
            case 3 -> System.out.println("Rabu");
            default -> System.out.println("Hari tidak dikenali");
        }
    }
}
