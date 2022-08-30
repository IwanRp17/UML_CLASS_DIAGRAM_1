/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pertemuan.pkg1;

/**
 *
 * @author ngend
 */
public class Agent{//membuat blueprint Agent
private int health;//deklarasi health dengan tipe data integer
private String name;;//deklarasi name dengan tipe data String
private int pos_x;//deklarasi name dengan tipe data String
private int pos_y;//deklsrasi name dengan tipe data String


//private hanya bisa diakses dalam class itu sendiri

public Agent(){
    //public bisa diakses di luar class itu sendiri
}
public Agent(String name,int health){
this.name = name;
this.health = health;
}
public void SetPos(int x,int y){
this.pos_x = x;//-
this.pos_y = y;//-
}
public int GetPos(){
return 0;    
}
public void InfoAgent(){//method
 System.out.println(" Name : "+this.name+" Health : "+this.health);
}
}

