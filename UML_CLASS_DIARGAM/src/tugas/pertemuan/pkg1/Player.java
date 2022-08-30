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
public class Player {//membuat blueprint Player
private int direction;//deklarasi direction dengan tipe data integer
private int id;//deklarasi id dengan tipe data integer
private int strength;//deklarasi strenght dengan tipe data integer
public Player(){
}
public Player(int id,int direction){
this.id=id;
this.direction=direction;
}
public void AddStrength(int str){
this.strength=str;
}
public void InfoPlayer(){//method
System.out.println(" player id : "+this.id+" direction : "+this.direction);
}
}
