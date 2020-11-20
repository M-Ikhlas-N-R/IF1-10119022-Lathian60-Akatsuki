package com.minr;

public class Characters {
    protected int attackPoint = 0;
    protected String namaCharacter = "-", jutsu = "-";

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    
    public String getNamaCharacter() {
        return namaCharacter;
    }

    public void setNamaCharacter(String namaCharacter) {
        this.namaCharacter = namaCharacter;
    }

    public String getJutsu() {
        return jutsu;
    }

    public void setJutsu(String jutsu) {
        this.jutsu = jutsu;
    }
    
    public void attack(){
        System.out.println("\n===Menyerang===");
        System.out.printf("mengeluarkan jutsu : %s", jutsu);
        System.out.printf("\nattack damage : %d", this.getAttackPoint());
        System.out.println();
    }
    
    public void attack(int powerUp){
        System.out.println("\n===Menyerang===");
        int attackPowerUp =  powerUp + this.getAttackPoint();
        System.out.printf("mengeluarkan jutsu : %s", jutsu);
        System.out.printf("\nattack damage : %s", attackPowerUp);
        System.out.println();
    }
    
    
}
