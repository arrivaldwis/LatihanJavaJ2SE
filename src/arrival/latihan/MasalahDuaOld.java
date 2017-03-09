/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrival.latihan;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Arrival Sentosa
 */
public class MasalahDuaOld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner untuk handle input dari user
        int number = 0; //variable number utk menyimpan input user
        int hasil = 0; //variable hasil utk menyimpan hasil kalkulasi
        
        System.out.print("Masukan Bilangan (0 - 1000000): "); //Menampilkan kalimat tsb
        number = input.nextInt(); //Scanner akan mengambil input ber tipe data Integer lalu disimpan di variable number
        if(number >= 0 && number <= 1000000) { //seleksi atau validasi agar inputan dari 0 sampai 1000000
            LinkedList<Integer> stack = new LinkedList<Integer>(); //Linked list digunakan untuk menyimpan angka yang sudah dipecah
            while (number > 0) { //jalankan perintah dibawah jika value dari number lebih besar dari 0
                stack.push(number % 10); //menyimpan hasil modulus
                number = number / 10; //membuang digit yang telah didapat pada fungsi diatas
            }

            while (!stack.isEmpty()) { //jika variable stack tidak kosong, jumlahkan setiap digit yang sudah diparsing
                hasil += stack.pop(); //digit di increment (ditambahkan) dengan variable hasil dan disimpan ke variable hasil
            }
            
            System.out.println("Hasil Penjumlahan digitnya adalah: "+hasil); //menampilkan hasil penjumlahan
        } else {
            System.out.println("Maaf, Rentang digit dari 0 - 1000000"); //pesan error jika user menginput tidak dari rentang 0 - 1000000 
        }
    }
}
