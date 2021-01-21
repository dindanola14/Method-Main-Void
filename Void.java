/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner; //Input Scanner
public class Void {
    //Deklarasi Variabel
    String nama, makanan, bunyi;
    int dengar;
    
    void kelompokhewan(){ //Method Pertama
        Scanner input = new Scanner(System.in);
        System.out.println("==================== Perhatian! =======================");
        System.out.println("( Isi data di bawah ini dengan diawali huruf kapital! )");
        System.out.println(" ");
        System.out.print("Masukkan Nama Hewan : "); //Input Nama Hewan
        nama = input.nextLine();
        
        System.out.print("Masukkan Makanan Hewan : "); //Input Makanan Hewan
        makanan = input.nextLine();
        
        switch(makanan){ //Percabangan
            case "Tumbuhan": //jika makanan hewannya tumbuhan maka kelompok herbivora
                System.out.println(nama+ " adalah " + "Kelompok Hewan Herbivora");
                break;
            case "Daging"://jika makanan hewannya daging maka kelompok karnivora
                System.out.println(nama+ " adalah " + "Kelompok Hewan Karnivora");
                break;
            case "Tumbuhan dan Daging": //jika makanan hewannya tumbuhan dan daging maka kelompok omnivora
                System.out.println(nama+ " adalah " + "Kelompok Hewan Omnivora");
                break;
            default: //jika makanan hewannya selain ketiga itu maka bukan hewan
                System.out.println(nama+ " Bukan Hewan");
        }
    }
        
    void suarahewan(){ //Method Kedua
        Scanner input = new Scanner(System.in); 
        System.out.println("======================================================");
        System.out.print("Masukkan Suara Hewan : "); //Input Suara Hewan
        bunyi = input.nextLine();
        
        System.out.print("Berapa Kali Terdengar : "); //Input Berapa Kali Terdengar
        dengar = input.nextInt();
        
        for(int i=1; i<=dengar; i++){ //Perulangan 
            System.out.println(bunyi+ " "); //agar suara hewan yang didengar dapat terulang sebanyak yang ia dengar
        }
        System.out.println("======================================================");
    }
}


    