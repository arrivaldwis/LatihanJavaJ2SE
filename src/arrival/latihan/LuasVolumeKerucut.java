/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrival.latihan;

import java.util.Scanner;

/**
 *
 * @author Arrival Sentosa
 */
public class LuasVolumeKerucut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LuasVolumeKerucut lvk = new LuasVolumeKerucut();
        Double jari, tinggi;
        
        System.out.print("Input jari jari alas: ");
        jari = input.nextDouble();
        
        System.out.print("Input tinggi kerucut: ");
        tinggi = input.nextDouble();
        
        lvk.itungLuasVolumeKerucutCantik(jari, tinggi);
    }
    
    public void itungLuasVolumeKerucutCantik(Double jari, Double tinggi) {
        Double luasAlas, volume;
        luasAlas = 3.14*Math.pow(jari, 2);
        volume = 1f/3f*(3.14*Math.pow(jari, 2)*tinggi);
        System.out.println("Luas alasnya = "+luasAlas);
        System.out.println("Volume kerucut adalah "+volume);
    }
}
