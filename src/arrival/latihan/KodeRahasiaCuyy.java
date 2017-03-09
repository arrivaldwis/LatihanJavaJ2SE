/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrival.latihan;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arrival Sentosa
 */
public class KodeRahasiaCuyy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Dekalarasi variable input sebagai Scanner
        KodeRahasiaCuyy kd = new KodeRahasiaCuyy(); //Inisialisasi Class
        
        System.out.print("Dekripsi Pesan Rahasia: "); 
        String pesan = input.nextLine(); //Ambil input dari user
        kd.dekripsi(pesan); //Kirimkan input (pesan) ke method dekripsi
        //kd.enkripsi(pesan); //Kirimkan input (pesan) ke method enkripsi
    }
    
    //Enkripsi (WORKS!)
    public void enkripsi(String pesan) {
        String hasil = "";
        String hasilBiner = "";
        for (int i=0; i<pesan.length(); i++) {
            hasil += (int) pesan.charAt(i) + "/";
        }
        System.out.println(hasil);
        
        String[] binary = hasil.split("/");
        for(int i=0; i<binary.length; i++) {
            hasilBiner += String.format("%8s", Integer.toBinaryString(Integer.parseInt(binary[i]))).replace(' ', '0');
            System.out.println("binary "+String.format("%8s", Integer.toBinaryString(Integer.parseInt(binary[i]))).replace(' ', '0'));
        }
        
        int totDigit = 0;
        Random rand = new Random();
        String prefix = "";
        String suffix = "";
        String pjDigit = String.valueOf(binary.length*8);
        
        for (int i=0; i<pjDigit.length(); i++) {
            if(i>0 && i<pjDigit.length() && pjDigit.charAt(i) == '0'){ 
                totDigit += 10;
            } else {
                totDigit += Integer.parseInt(String.valueOf(pjDigit.charAt(i))); 
            }
        }
        
        prefix = String.format("%"+totDigit+"s", Integer.toBinaryString(Integer.parseInt(String.valueOf(rand.nextInt(totDigit))))).replace(' ', '0');
        suffix = String.format("%8s", Integer.toBinaryString(Integer.parseInt(String.valueOf(totDigit)))).replace(' ', '0');
        
        String reverse = "";
        for (int i=0; i<suffix.length(); i++) {
            if(suffix.charAt(i) == '0') {
                reverse += "1";
            } else {
                reverse += "0";
            }
        }
        
        hasilBiner = prefix+hasilBiner+reverse;
        System.out.println("pjbiner "+binary.length*8);
        System.out.println("totaldigit "+totDigit);
        System.out.println("prefix "+prefix);
        System.out.println("suffix "+suffix);
        System.out.println("reverse suffix "+reverse);
        System.out.println("hasil biner "+hasilBiner);
        
        String pesanRahasia = "";
        for(int i=0; i<hasilBiner.length(); i++) {
            if(hasilBiner.charAt(i) == '0') {
                pesanRahasia += ".";
            } else {
                pesanRahasia += "-";
            }
        }
        
        System.out.println("pesanRahasia "+pesanRahasia);
    }
    
    //Dekripsi (WORKS!)
    public void dekripsi(String pesan) {
        String hasil = "";
        String hasilBiner = "";
        
        String pesanRahasia = "";
        for(int i=0; i<pesan.length(); i++) { //Looping length(panjang huruf) dari isi pesan
            if(pesan.charAt(i) == '.') { //seleksi jika charAt(index ke-i) bernilai '.'
                pesanRahasia += "0"; //jika ya, tambahkan value '0' ke variable pesanRahasia
            } else { //jika karakter bukan '.'
                pesanRahasia += "1"; //jika ya, tambahkan value '1' ke variable pesanRahasia
            }
        }
        
        System.out.println("Ke Biner: "+pesanRahasia); //Untuk mengecek hasil, tampilkan hasil konversi
        
        int totDigit = 0;
        Random rand = new Random(); //Inisialisasi Random digunakan untuk merandom nilai prefix
        String prefix = "";
        String reverse = "";
        String hasilPisah = "";
        
        String pjDigit = String.valueOf(pesanRahasia.length()); //Inisialisasi pjDigit dengan Panjang isi dari variabel pesanRahasia
        for (int i=0; i<pjDigit.length(); i++) { //Looping dari panjang pjDigit
            if(i>0 && i<pjDigit.length() && pjDigit.charAt(i) == '0'){ //Jika ada 0 diantara angka lain maka variabel di increment dengan 10
                totDigit += 10;
            } else {
                totDigit += Integer.parseInt(String.valueOf(pjDigit.charAt(i))); //Increment ke variabel totDigit
            }
        }
        
        prefix = String.format("%"+(totDigit)+"s", pesanRahasia.substring(0, totDigit)).replace(' ', '0');
        // Inisialisasi variabel prefix dengan mengambil digit pertama sebanyak = (totDigit)
        reverse = String.format("%8s", pesanRahasia.substring(pesanRahasia.length()-8, pesanRahasia.length())).replace(' ', '0');
        // Inisialisasi variabel reverse dengan mengambil digit terakhir sebanyak = jumlah panjang isi pesanRahasia - 8 (karena akan diambil 8 digit terakhir)
        
        String suffix = "";
        for (int i=0; i<reverse.length(); i++) { //looping untuk mereverse menjadi suffix awal
            if(reverse.charAt(i) == '0') { //seleksi jika charAt(i) bernilai '0'
                suffix += "1"; //maka tambahkan '1' ke variabel suffix
            } else { //sebaliknya
                suffix += "0"; //tambahkan '0'
            }
        }
        
        hasilPisah = pesanRahasia.substring(totDigit, pesanRahasia.length()-8); //pisahkan isi asli biner dari prefix dan reverse suffix
        System.out.println("Pj. Biner: "+pesanRahasia.length()); //tampilkan jumlah panjang biner
        System.out.println("Total Digit pada Biner: "+totDigit+" = "+(totDigit)); //tampilkan hasil increment total pada pj biner
        System.out.println("Prefix: "+prefix); //tampilkan prefixnya
        System.out.println("Suffix: "+suffix); //tampilkan suffixnya
        System.out.println("Reverse Suffix: "+reverse); //tampilkan reverse suffixnya
        System.out.println("Hasil Pemisahan: "+hasilPisah); //tampilkan hasilPisah (isi pesan)
        
        int i = 0, j=0;
        int getDecimal = 0;
        String hasilakhir = "";
        
        while (i < hasilPisah.length()) { //loop while i kurang dari panjang nilai hasilPisah
            if (hasilPisah.length()-i >= 8) { //seleksi jika panjang hasilPisah dikurang i masih lebih besar atau sama dengan 8 (8 karena sebelumnya pada metode enkripsi dijelaskan menggunakan 8-bit biner, maka kita mengambil per-8 digit biner untuk di konversi ke decimal)
                getDecimal = Integer.parseInt(hasilPisah.substring(i, i+8),2); //jika ya, substring hasilPisah dari posisi i sampai i+8 dan angka 2 menandakan bahwa konversi dari biner ke decimal
            } else { //sebaliknya
                getDecimal = Integer.parseInt(hasilPisah.substring(i, hasilPisah.length()),2); //jika ya, substring hasilPisah dari posisi i sampai habis (pj hasilPisah) dan angka 2 menandakan bahwa konversi dari biner ke decimal
            }
            System.out.println("Decimal Biner["+j+"]: "+getDecimal); //tampilkan angka-angka decimal yang didapatkan
            hasil += (char) getDecimal; //ubah decimal ke bentuk char
            i += 8; //increment +8
            j++; //increment untuk menandakan decimal ke berapa
        }
        System.out.println("Hasil Dekripsi: "+hasil); //tampilkan hasil konversi akhir
    }
}
