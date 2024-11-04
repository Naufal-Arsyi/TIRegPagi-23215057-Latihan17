/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Arsyi
 * NAma  : Naufal Miftahul Arsyi
 * Kelas : Teknik Informatika
 * NIM   : 23215057
 * Deskripsi : program ini berfungsi untuk menghitung gaji pokok dan tujangan berdasarkan status pernikahan
 * 
 */
import java.util.Scanner;

public class TI_23215057_Latihan17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input gaji pokok dan status pernikahan
        System.out.print("Berapa gaji pokok anda perbulan? Rp. ");
        double gajiPokok = scanner.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        String status = scanner.next();

        // Hitung tunjangan jika menikah
        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = gajiPokok * 0.35;
        }

        // Hitung total gaji
        double totalGaji = gajiPokok + tunjangan;

        // Output hasil perhitungan
        System.out.println("=======================================");
        System.out.println("Gaji Pokok       : Rp. " + gajiPokok);
        System.out.println("Tunjangan        : Rp. " + tunjangan);
        System.out.println("Total Gaji       : Rp. " + totalGaji);
        System.out.println("(Developed by: Nama Anda)");
    }
}
