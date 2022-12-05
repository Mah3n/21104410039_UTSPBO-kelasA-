/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS_No1;

/**
 *
 * @author Mahendra
 * TI-A
 */
public class Dangdut {
    String penyanyi;
    String lagu;
    
    Dangdut(){
        
    }
    
    public void singer(String penyanyi) {
        this.penyanyi = penyanyi;
    }
    
    public void song(String lagu){
       this.lagu = lagu;
    }
    
    public void cetakLabel(){
        System.out.println(this.penyanyi+" <=> "+this.lagu);
    }
}
