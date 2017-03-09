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
public class PiramidaNo9 {
    public static void main(String[] args) {
        int tinggi = 0;
        Scanner scInt = new Scanner(System.in);
        
        tinggi = scInt.nextInt();
        
        for(int i=1;i<=tinggi;i++){
            String chars = "";
            for(int j=i;j<=tinggi;j++){
                if (i%2==0) {
                    chars = "*";
                } else {
                    chars = "-";
                }
                System.out.print(chars+" ");
            }
            System.out.println( );
        }
    }
}
