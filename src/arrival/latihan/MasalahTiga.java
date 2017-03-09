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
public class MasalahTiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner untuk handle input dari user
        int angkaAwal = 0; //variable angkaAwal utk menyimpan input angka awal dari user
        int angkaAkhir = 0; //variable angkaAkhir utk menyimpan input angka awal dari user
        int jarakTempuh = 0; //variable jarakTempuh utk menyimpan hasil kalkulasi angkaAwal dan angkaAkhir
        int hasil = 0; //variable hasil utk menyimpan hasil kalkukasi jarakTempuh dan tarif
        int tarifKM = 10000; //variable tarifKM utk menyimpan value tarif/ongkos per-km
        
        System.out.print("Masukkan angka KM awal: "); //menampilkan kalimat
        angkaAwal = input.nextInt(); //mengambil input user bertipe data integer ke variable angkaAwal
        System.out.print("Masukkan angka KM akhir: "); //menampilkan kalimat
        angkaAkhir = input.nextInt(); //mengambil input user bertipe data integer ke variable angkaAkhir
        
        jarakTempuh = (angkaAkhir - angkaAwal) / 1000; //kalkulasi angkaAkhir dikurang angkaAwal akan lalu dibagi 1000 karena konversi dari m ke km dan hasilnya disimpan di variable jarakTempuh
        System.out.println("Jarak Tempuh "+jarakTempuh+" km"); //menampilkan hasil jarakTempuh
        
        hasil = jarakTempuh * tarifKM; //kalkulasi tarif dengan rumus jarakTempuh dikali tarifKM
        System.out.println("Ongkos: Rp. "+hasil); //menampilkan tarif/ongkos
    }
}
