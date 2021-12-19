/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SkorBola;
import java.util.Scanner;
/**
 *
 * @author Dede Sunarwan
 */
public class SkorBola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Nama Tim : ");
        String namaTeam = input.nextLine();
        
        System.out.println("Main Ke-1 (M/K) : ");
        String main1 = input.nextLine();
        
        System.out.println("Main Ke-2 (M/K) : ");
        String main2 = input.nextLine();
        input.close();
        
        int total = 0;
        if (main1.equalsIgnoreCase("M") && main2.equalsIgnoreCase("M")) {
            total = 2;
        } else if (main1.equalsIgnoreCase("K") && main2.equalsIgnoreCase("K")) {
            total = 0;
        } else {
            total = 1;
        }  
        
        System.out.println("");
        System.out.println("====HASIL PERTANDINGAN SEPAK BOLA====");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Nama Tim  : " + namaTeam);
        System.out.println("Main Ke-1 : " + main1);
        System.out.println("Main Ke-2 : " + main2);
        System.out.println("Skor      : " + total);
        
        if (total == 2) {
            System.out.println("Keterangan : " + namaTeam + "Dapat Medali Emas");
        } else if (total == 1 && main1.equalsIgnoreCase("M")) {
            System.out.println("Keterangan : " + namaTeam + "Dapat Medali Perak");
        } else if (total == 1 && main2.equalsIgnoreCase("M")) {
            System.out.println("Keterangan : " + namaTeam + "Dapat Medali Perunggu");
        } else {
            System.out.println("Latihan Lagi Ya :D");
        }
    }
}
