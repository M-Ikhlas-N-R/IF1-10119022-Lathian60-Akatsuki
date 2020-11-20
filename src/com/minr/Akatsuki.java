/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minr;
import java.util.Scanner;

public class Akatsuki extends Characters{
    String[][] akatsukiMember = {
        {"1","hidan", "Death Controlling Possessed Blood", "400"},
        {"2","kakuzu","Earth Grudge Fea", "300"},
        {"3","itachi","Amaterasu", "345"},
        {"4","kisame","Water Clone Technique", "240"},
        {"5","zetsu","Yomotsu Hirasaka", "593"},
        {"6","tobi","Kamui", "789"},
        {"7","orochimaru","Binding Snake Glare Spell", "456"},
        {"8","deidara","Explosive Landmines", "765"},
        {"9","sasori","Iron Sand Drizzle", "234"},
        {"10","konan","Dance of the Shikigami", "874"},
        {"11","pain","Summoning Rinnegan", "879"}
    };
    
    private void pilihCharacter(String pilih){
        boolean ketemu = false;
        for(int i = 0; i < akatsukiMember.length; i++){
            if(pilih.equals(akatsukiMember[i][0])) {
                super.setNamaCharacter(akatsukiMember[i][1]);
                super.setJutsu(akatsukiMember[i][2]);
                super.setAttackPoint(Integer.parseInt(akatsukiMember[i][3]));
                System.out.printf("\nNama karakter : %s", super.getNamaCharacter());
                System.out.printf("\nJutsu : %s ", super.getJutsu());
                System.out.printf("\ndamage : %d \n", super.getAttackPoint());
                this.pilihAksi();
                ketemu = true;
                
            }
        }
        if(!ketemu) System.out.println("pilihan tidak valid.");
       
    }
    
    private void pilihAksi(){
        Scanner userInput = new Scanner(System.in);
        Character pilihAksi;
        System.out.println("\n=====Pilih Aksi=====");
        System.out.println("1. attack");
        System.out.println("2. Power Up and Attack");
        System.out.print("pilih aksi : ");
        pilihAksi = userInput.next().charAt(0);
        
        switch(pilihAksi){
            case '1' :
                super.attack();
                break;
            case '2' :
                System.out.print("\nbanyak attack point yang ditambah : ");
                super.attack(userInput.nextInt());
                break;
            default:
                System.out.println("pilihan aksi tidak valid");
        }
    }
    
    public void tampilAnggota(){
        Scanner userInput = new Scanner(System.in);
        
        int no = 1;
        System.out.println("\n=====Karakter Akatsuki=====");
        for(int i = 0; i < akatsukiMember.length; i++){
            System.out.printf("%d. %s\n", no, akatsukiMember[i][1]);
            ++no;
        }
        System.out.print("Pilih Character : ");
        this.pilihCharacter(userInput.nextLine());
        
        
        
        
        
        
    }
    
    
    
    
        
}
