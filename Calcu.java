/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Calcu {

    public float biner;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner aw = new Scanner(System.in);
        float angka;

        System.out.println("Masukan bilangan pertama : ");
        angka = aw.nextInt();

        System.out.println("Pilih operasi : ");
        System.out.println("1. kali");
        System.out.println("2. bagi");
        System.out.println("3. tambah");
        System.out.println("4. kurang");
        System.out.println("5. sisa bagi");

        int kali = 1;
        int bagi = 2;
        int tambah = 3;
        int kurang = 4;
        int sisa = 5;
        int oper = 0;
        float hitung = 0;
        oper = aw.nextInt();

        float angka2;
        System.out.println("Masukan bilangan kedua  : ");
        angka2 = aw.nextInt();
        System.out.println("====================================================");
        if (oper == kali) {
            hitung = angka * angka2;
            System.out.println(angka + " X " + angka2);
            System.out.println("hasil   : ");
            System.out.println(hitung);

        }
        if (oper == bagi) {
            hitung = angka / angka2;
            System.out.println(angka + " : " + angka2);
            System.out.println("hasil   : ");
            System.out.println(hitung);

        }
        if (oper == tambah) {
            hitung = angka + angka2;
            System.out.println(angka + " + " + angka2);
            System.out.println("hasil   : ");
            System.out.println(hitung);

        }

        if (oper == kurang) {
            hitung = angka - angka2;
            System.out.println(angka + " - " + angka2);
            System.out.println("hasil   : ");
            System.out.println(hitung);

        }
        if (oper == sisa) {
            hitung = angka % angka2;
            System.out.println(angka + " % " + angka2);
            System.out.println("hasil   : ");
            System.out.println(hitung);

        }
        System.out.println("====================================================");

        String binary = Integer.toBinaryString((int) hitung);
        System.out.println("Hasil koverensi ke Biner    : " + binary);

        String oktal = Integer.toOctalString((int) hitung);
        System.out.println("Hasil koverensi ke Oktal    : " + oktal);

        String Hexa = Integer.toHexString((int) hitung);
        System.out.println("Hasil koverensi ke Hexadecimal  : " + Hexa);

        System.out.println("====================================================");

        float azz = Integer.parseInt(binary, 2);
        float aww = Integer.parseInt(oktal, 8);
        float arr = Integer.parseInt(Hexa, 15);
        System.out.println("Mengembalikan nilai Biner ke desimal    : " + azz);
        System.out.println("Mengembalikan nilai Oktal ke desimal    : " + aww);
        System.out.println("Mengembalikan nilai Hexadesimal ke desimal  : " + arr);

        System.out.println("========================END=========================");
    }

}
