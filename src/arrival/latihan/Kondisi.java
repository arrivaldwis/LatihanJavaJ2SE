/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrival.latihan;

/**
 *
 * @author Arrival Sentosa
 */
public class Kondisi {
    public static void main(String[] args) {
        //Pengkondisian If
        //Melakukan pengecekan value variable dan hanya satu keluaran
        //contoh:
        int a = 1;
        if(a==1) {
            System.out.println("Angka a bernilai "+a);
        }
        
        //Pengkondisian If Else
        //Melakukan pengecekan value variable dan ada 2 keluaran (benar dan salah)
        //contoh:
        if(a==1) {
            System.out.println("Angka a bernilai "+a);
        } else {
            System.out.println("Angk a bukan bernilai 1");
        }
        
        //Pengkondisian If Else If
        //Melakukan pengecekan value variable dan keluaran dapat diatur berdasarkan kondisi tambahan
        //contoh:
        if(a==1) {
            System.out.println("Angka a bernilai "+a);
        } else if (a==0) {
            System.out.println("Angka a bukan bernilai 0");
        }
        
        //Pengkondisian Switch
        //Melakukan pengecekan value variable dan keluaran sesuai dengan pilihan case biasanya digunakan sebagai menu
        //contoh:
        switch (a) {
            case 0:
                System.out.println("Angka a bernilai 0");
                break;
            case 1:
                System.out.println("Angka a bernilai 1");
                break;
        }
    }
}
