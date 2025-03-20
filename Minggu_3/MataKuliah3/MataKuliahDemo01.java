package MataKuliah3;

import java.util.*;

public class MataKuliahDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak Mata Kuliah yang akan dimasukkan : ");
        String dummy = sc.nextLine();
        int array = Integer.parseInt(dummy);
        MataKuliah01[] arrayOfMataKuliah01 = new MataKuliah01[array];
        for (int i = 0; i < arrayOfMataKuliah01.length; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah01[i] = new MataKuliah01();
            arrayOfMataKuliah01[i].tambahData();
        }

        for (int i = 0; i < arrayOfMataKuliah01.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah01[i].cetakInfo();
        }
    }
}
