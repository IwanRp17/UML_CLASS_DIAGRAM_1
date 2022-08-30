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
public class Mainclass {
    
    public static void main(String[] args) {
  Agent Agent1 = new Agent();//data null
  Agent Agent2 = new Agent("cobaagent",100);//memasukkan data
 
  Agent1.InfoAgent();//panggil
  Agent2.InfoAgent();//panggil
  
  Player Player1 = new Player();
  Player Player2 = new Player(10,5);
  
  Player1.InfoPlayer();
  Player2.InfoPlayer();
  
  
    }
}
