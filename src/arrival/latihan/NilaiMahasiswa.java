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
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NilaiMahasiswa nilaiM = new NilaiMahasiswa();
        int nilai;
        String hasil;
        
        System.out.print("Masukkan Nilai Mahasiswa: ");
        nilai = input.nextInt();
        hasil = nilaiM.prosesNilaiCekGrade(nilai);
        System.out.println("Grade: "+hasil);
    }
    
    public String prosesNilaiCekGrade(int nilai) {
        String hasil = "";
        if (nilai >= 75) {
            hasil = "A";
        } else if (nilai >= 68 && nilai < 75) {
            hasil = "AB";
        } else if (nilai >= 60 && nilai < 68) {
            hasil = "B";
        } else if (nilai >= 50 && nilai < 60) {
            hasil = "BC";
        } else if (nilai >= 40 && nilai < 50) {
            hasil = "C";
        } else if (nilai >= 25 && nilai < 40) {
            hasil = "D";
        } else if (nilai < 25) {
            hasil = "E";
        }
        return hasil;
    }
}
