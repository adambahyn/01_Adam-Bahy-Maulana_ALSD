package Minggu_1;

import java.util.Scanner;

public class array {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==========");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("============");

        String matkul[] = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
                int sks[] = { 2, 2, 2, 3, 2, 2, 3, 2 };
                double nilaiAngka[] = new double[8];
                String nilaiHuruf[] = new String[8];
                double nilaiSetara[] = new double[8];
                double sum = 0, totalSKS = 0;
                
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + matkul[i] + " : ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else if (nilaiAngka[i] <= 39) {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
            sum += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }
        System.out.println("================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("==============");

        System.out.printf("%-40s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n", matkul[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }
        System.out.println("================");

        double ip = sum / totalSKS;
        System.out.printf("\nIP : %.2f\n", ip);

    }
}
