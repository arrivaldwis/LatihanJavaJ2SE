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
public class TidakHabisBagiDua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1;
        int input2;
        
        input1 = sc.nextInt();
        input2 = sc.nextInt();
        
        if(input1 >= input2) {
            System.out.println("Maaf, nilai input 1 tidak bisa lebih besar dari input 2");
            return;
        }
        
        System.out.println();
        for (int i=input1; i<=input2; i++) {
            if (i%2!=0) {
                System.out.print(i+",");
            }
        }
    }
}
