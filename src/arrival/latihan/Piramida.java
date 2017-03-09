/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrival.latihan;

import javax.swing.JOptionPane;

/**
 *
 * @author Arrival Sentosa
 */
public class Piramida {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int hasil = i;
            for(int j=i;j<=5;j++){
                System.out.print(hasil+" ");
                if (i==1) {
                    hasil+=5;
                } else if (i==2) {
                    hasil+=4;
                } else if (i==3) {
                    hasil+=3;
                } else if (i==4) {
                    hasil+=2;
                }
            }
            System.out.println( );
        }
    }
}
