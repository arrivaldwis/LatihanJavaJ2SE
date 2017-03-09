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
public class MasalahSatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //deklarasi variabel scanner
        int userInput, computerInput; //deklarasi variable user dan computerInput
        String hasil = ""; //deklarasi variable hasil untuk menampilkan output
        MasalahSatu mslSatu = new MasalahSatu(); //instansiasi variabel mslSatu dengan class MasalahSatu
        
        System.out.print("0 (kelingking), 1 (telunjuk), 2 (jempol): "); //output
        userInput = input.nextInt(); //masukkan input user ke variable userInput
        if (userInput >= 0 && userInput <= 2) { //seleksi userInput hanya jika lebih sama dengan 0 dan kurang sama dengan 2
            computerInput = mslSatu.generateComputerInput(); //masukan hasil kalkulasi method generateComputerInput ke variable computerInput
            hasil = mslSatu.WhoWin(userInput, computerInput); //masukan hasil kalkulasi method WhoWin ke variable hasil
            System.out.println(hasil); //tampilkan hasil
        } else {
            System.out.println("Anda Memasukkan Input yang salah hanya (0 - 2)"); //jika input user tidak memenuhi kriteria seleksi
        }
    }
    
    public int generateComputerInput() { //method generate computerInput
        Double computerInput = Math.ceil(Math.random()*10)%3; //rumus generate
        return computerInput.intValue(); //kirim hasil kalkulasi
    }
    
    public String WhoWin(int userInput, int computerInput) { //method kalkulasi WhoWin dengan 2 parameter (userInput) dan (computerInput)
        String hasil = ""; //deklarasi variable hasil
        String komputer = ""; //deklarasi variable komputer
        String user = ""; //deklarasi variable user
        
        if (computerInput == 0) { //seleksi jika computerInput = 0
            komputer = "kelingking"; //maka value komputer adalah "kelingking"
        } else if (computerInput == 1) { //seleksi jika computerInput = 1
            komputer = "telunjuk"; //maka value komputer adalah "telunjuk"
        } else { //seleksi jika computerInput bukan 0 atau 1
            komputer = "jempol"; //maka value komputer adalah "jempol"
        }
        
        if (userInput == 0) { //seleksi jika userInput = 0
            user = "kelingking"; //maka value komputer adalah "kelingking"
        } else if (userInput == 1) { //seleksi jika userInput = 1
            user = "telunjuk"; //maka value komputer adalah "telunjuk"
        } else { //seleksi jika userInput bukan 0 atau 1
            user = "jempol"; //maka value komputer adalah "jempol"
        }
        
        if (userInput == 0) { //seleksi jika userInput = 0
            if (computerInput == 0) { //seleksi jika computerInput = 0
                hasil = "seri"; //maka hasil "seri"
            } else if (computerInput == 1) { //seleksi jika computerInput = 1
                hasil = "komputer menang"; //maka hasil "komputer menang"
            } else if (computerInput == 2) { //seleksi jika computerInput = 2
                hasil = "user menang"; //maka hasil "user menang"
            }
        } else if (userInput == 1) { //seleksi jika userInput = 1
            if (computerInput == 0) { //seleksi jika computerInput = 0
                hasil = "user menang"; //maka hasil "user menang"
            } else if (computerInput == 1) { //seleksi jika computerInput = 1
                hasil = "seri"; //maka hasil "seri"
            } else if (computerInput == 2) { //seleksi jika computerInput = 2
                hasil = "komputer menang"; //maka hasil "komputer menang"
            }
        } else if (userInput == 2) { //seleksi jika userInput = 2
            if (computerInput == 0) { //seleksi jika computerInput = 0
                hasil = "komputer menang"; //maka hasil "komputer menang"
            } else if (computerInput == 1) { //seleksi jika computerInput = 1
                hasil = "user menang"; //maka hasil "user menang"
            } else if (computerInput == 2) { //seleksi jika computerInput = 2
                hasil = "seri"; //maka hasil "seri"
            }
        }
        
        if (userInput == computerInput) { //seleksi jika value userInput sama dengan computerInput
            user += " juga"; //maka tambahkan kata "juga" diakhir hasil menandatakan hasil seri
        }
        
        return "Komputer "+komputer+", Kamu "+user+", maka "+hasil; //kirim hasil kalkulasi
    }
}
