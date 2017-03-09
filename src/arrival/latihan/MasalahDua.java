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
public class MasalahDua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //deklarasi variabel scanner
        Double a,b,c; //deklarasi variable a,b dan c
        MasalahDua mslDua = new MasalahDua(); //instansiasi variabel mslDua dengan class MasalahDua
        
        System.out.print("Masukkan Koefisien a: "); //output a
        a = input.nextDouble(); //masukkan input user ke variable a
        System.out.print("Masukkan Koefisien b: "); //output b
        b = input.nextDouble(); //masukkan input user ke variable b
        System.out.print("Masukkan Koefisien c: ");  //output c
        c = input.nextDouble(); //masukkan input user ke variable c
        
        mslDua.akarKuadrat(a,b,c); //kirim value a,b,c ke method akarKuadrat()
    }
    
    public void akarKuadrat(Double a, Double b, Double c) { //method akarKuadrat dengan 3 parameter (a,b dan c)
        Double diskriminan = Math.pow(b,2)-4*a*c; //rumus hitung diskriminan
        Double r1, r2; //buat variable r1 dan r2 utk hasil akar
        String hasil = ""; //buat variable hasil utk menampilkan hasil
        
        if (diskriminan > 0) { //seleksi jika hasil diskriminan positif
            //dua akar
            r1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a; //rumus akar r1
            r2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a; //rumus akar r2
            hasil = "Memiliki dua akar yaitu "+r1+" dan "+r2; //masukkan ke variable hasil
        } else if (diskriminan == 0) { //seleksi jika hasil diskriminan 0
            //satu akar
            r1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a; //rumus akar r1
            hasil = "Memiliki satu akar yaitu "+r1; //masukkan ke variable hasil
        } else if (diskriminan < 0) { //seleksi jika hasil diskriminan negatif
            //tidak ada akar
            hasil = "Tidak memiliki akar"; //masukkan ke variable hasil
        }
        
        System.out.println("Persamaan ini "+hasil); //menampilkan hasil
    }
}
