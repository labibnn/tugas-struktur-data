/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author MyBook14F
 */
public class MasterPBOplayer {
    String nama = "";
    int speed = 0;
    int healthPoint = 0;
    int attack = 0;
     
    int serangLawan(int a, int b){
        healthPoint = b-a;
        System.out.println("Attack Peyerang : " + a);
        System.out.println("Health Poin     : " + healthPoint + " Pada lawan.");
        return healthPoint;
    }
    
    void runPlayer(){
        System.out.println(nama + " Is Running ");
    }
    
    boolean isDead(){
        if(healthPoint <=0)return true;
        return false;
    }
}
