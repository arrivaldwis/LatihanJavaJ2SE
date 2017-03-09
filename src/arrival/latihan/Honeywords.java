/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrival.latihan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arrival Sentosa
 */
public class Honeywords {
    public static void main(String[] args) {
        int sumOfWords;
        int randomChar;
        String passInput;
        String honeyWords = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        Random r = new Random();
        ArrayList<String> result = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input your password: ");
        passInput = scan.nextLine();
        System.out.print("How much combination of honeywords: ");
        sumOfWords = scan.nextInt();
        System.out.print("Num of random character at the tail: ");
        randomChar = scan.nextInt();
        
        result.add(passInput);
        String getSuffix = passInput.substring(passInput.length()-randomChar, passInput.length());
        for (int i = 0; i < sumOfWords; i++) {
            honeyWords = "";
            
            for (int j = 0; j < getSuffix.length(); j++) {
                char data = getSuffix.charAt(j);
                char random = 'A';
                
                try {
                    int num = Integer.parseInt(data+"");
                    random = number.charAt(r.nextInt(passInput.length()));
                } catch(Exception ex) {
                    random = alphabet.charAt(r.nextInt(passInput.length()));
                }
                
                honeyWords += random;
            }
            
            if((i+1)<sumOfWords) {
                result.add(passInput.substring(0, passInput.length()-randomChar) + honeyWords);
            }
        }
        
        Collections.shuffle(result);
        System.out.println("");
        System.out.println("Honeywords Combination:");
        for (int i = 0; i < result.size(); i++) {
            printResults(result.get(i));
        }
    }
    
    private static void printResults(String result) {
        System.out.println(result);
    }
}
