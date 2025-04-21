/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author MyBook14F
 */
public class PBOplayer {
    public static void main(String[] args) {
        // PLAYER PENYERANG
        MasterPBOplayer pengacara = new MasterPBOplayer();
        pengacara.nama = "Sumanto";
        pengacara.speed = 200;
        pengacara.attack = 20;
        pengacara.healthPoint = 100;
        
        // PLAYER YANG DISERANG
        MasterPBOplayer hakim = new MasterPBOplayer();
        hakim.nama = "Sugiono";
        hakim.speed = 200;
        hakim.healthPoint = 100; 
        
        pengacara.runPlayer();
        System.out.println("Serang ");
        hakim.healthPoint = pengacara.serangLawan(pengacara.attack, hakim.healthPoint);
        
       
        // serang lagi
        System.out.println("Serang lagi");
        pengacara.attack = 50;
        pengacara.healthPoint = 100;
        pengacara.healthPoint = pengacara.serangLawan(pengacara.attack, hakim.healthPoint);
        
        // serang lagi
        System.out.println("Serang ultimatum");
        pengacara.attack = 100;
        pengacara.healthPoint = 100;
        hakim.healthPoint = pengacara.serangLawan(pengacara.attack, hakim.healthPoint);
        
        if(pengacara.isDead()){
            System.out.println("Sumanto menang : Game Over");
        }
    }

}
