/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PomBensin;
import java.util.Scanner;
/**
 *
 * @author Dede Sunarwan
 */
public class PomBensin {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        
        int jenisBensin = 0; 
        int jumlahLiter = 0; 
        int jenisKendaraan = 0;
        int premium = 2000;
        int pertalite = 3000;
        int pertamax = 5000;
        int solar = 6000;
        int hargaAkhir;
        
        System.out.println("Selamat Datang di POM Bensin Murah");
        System.out.println("===== Jenis Kendaraan Anda =====");
        System.out.println("1. Motor");
        System.out.println("2. Mobil Pribadi");
        System.out.println("3. Truk");
        System.out.println("Pilih Kendaraan Berdasarkan Angka :");
        
        jenisKendaraan = input.nextInt();
        
        int hargaBensin;
        switch (jenisKendaraan) {
            case 1:
                System.out.println("1. Premium   = Rp. 6450/Liter");
                System.out.println("2. Pertalite = Rp. 7650/Liter");
                System.out.println("3. Pertamax  = Rp. 9000/Liter");
                
                System.out.print(" Pilih BBM Berdasarkan Angka :");
                jenisBensin = input.nextInt();
                
                System.out.print("Mau Beli Berapa Liter? :");
                jumlahLiter = input.nextInt();
                
                switch (jenisBensin) {
                    case 1:
                        hargaBensin = premium * jumlahLiter;
                        hargaAkhir = hargaBensin;
                        System.out.println("Harga Harus Anda Bayar = " + hargaAkhir);
                        break;
                    case 2:
                        hargaBensin = pertalite * jumlahLiter;
                        hargaAkhir = hargaBensin;
                        System.out.println("Harga Harus Anda Bayar = " + hargaAkhir);
                        break;
                    default:
                        hargaBensin = pertamax * jumlahLiter;
                        hargaAkhir = hargaBensin;
                        System.out.println("Harga Harus Anda Bayar = " + hargaAkhir);
                        break;
                    }
                break;
            case 2:
                System.out.println("2. Pertalite = Rp. 7650/Liter");
                System.out.println("3. Pertamax  = Rp. 9000/Liter");
                
                System.out.print(" Pilih BBM Berdasarkan Angka :");
                hargaBensin = input.nextInt();
                
                System.out.print("Mau Beli Berapa Liter? :");
                jumlahLiter = input.nextInt();
                
                switch (jenisBensin) {
                    case 1:
                        hargaBensin = premium * jumlahLiter;
                        hargaAkhir = hargaBensin;
                        System.out.println("Harga Harus Anda Bayar = " + hargaBensin);
                        break;
                    case 2:
                        hargaBensin = pertalite * jumlahLiter;
                        hargaAkhir = hargaBensin;
                        System.out.println("Harga Harus Anda Bayar = " + hargaAkhir);
                        break;
                    default:
                        hargaBensin = pertamax * jumlahLiter;
                        hargaAkhir = hargaBensin;
                        System.out.println("Harga Harus Anda Bayar = " + hargaAkhir);
                        break;
                    }
                break;
            case 3:
                System.out.println("4. Solar = Rp. 5150/Liter");
                
                System.out.print(" Pilih BBM Berdasarkan Angka :");
                hargaBensin = input.nextInt();
                
                System.out.print("Mau Beli Berapa Liter? :");
                jumlahLiter = input.nextInt();
                
                input.close();
                
                switch (jenisBensin) {
                    case 1:
                        hargaBensin = solar * jumlahLiter;
                        hargaAkhir = hargaBensin;
                        System.out.println("Harga Harus Anda Bayar = " + hargaAkhir);
                        break;
                    }
                break;
            default:
                System.out.println("Salah Memasukan Pilihan");
                break;
        }
    }
}