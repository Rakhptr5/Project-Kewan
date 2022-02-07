/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Hewan {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Anda ngin melihat data hewan apa?");
        System.out.println("1:Ayam \t2:Sapi \t3:Domba 4:Kucing 5:Hiu");
        System.out.println("Masukkan kode hewan: ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                Ayam.makanan();
                Ayam.warna();
                Ayam.berkaki();
                break;
            case 2:
                Sapi.makanan();
                Sapi.warna();
                Sapi.berkaki();
                break;
            case 3:
                Domba.makanan();
                Domba.warna();
                Domba.berkaki();
                break;
            case 4:
                Kucing.makanan();
                Kucing.warna();
                Kucing.berkaki();
                break;
            case 5:
                Hiu.makanan();
                Hiu.warna();
                Hiu.berkaki();
                break;
            default:
                System.out.println("Error bang");
        }

    }

}
