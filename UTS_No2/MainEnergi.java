/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS_No2;

import java.util.Scanner;

/**
 *
 * @author Mahendra
 * TI-A
 */
public class MainEnergi {
    public static void main(String[] args) {
        Kinetic massa = new Kinetic();
        Kinetic kecepatan = new Kinetic();
        
        System.out.println("Program Menghitung Energi Kinetik : ");
        //Input Massa
        System.out.print("Masukkan massa benda : ");
        Scanner masa = new Scanner(System.in);
        massa.setMassa(masa.nextDouble());
        //Input Kecepatan
        System.out.print("Masukkan kecepatan benda : ");
        Scanner cepat = new Scanner(System.in);
        kecepatan.setKecepatan(cepat.nextDouble());
        //Hasil Rumus Energi Kinetic
        System.out.println("Maka Energi Kinetic nya adalah : " + 0.5 * massa.getMassa() * Math.pow(kecepatan.getKecepatan(), 2));
    }
}
