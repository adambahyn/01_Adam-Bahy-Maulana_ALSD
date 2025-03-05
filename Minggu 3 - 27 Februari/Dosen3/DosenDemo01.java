package Dosen3;

import java.util.*;

public class DosenDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak dosen : ");
        String dummy = sc.nextLine();
        System.out.println("-----------------------");
        int array = Integer.parseInt(dummy);
        Dosen01[] arrayDosen01 = new Dosen01[array];

        for (int i = 0; i < arrayDosen01.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            arrayDosen01[i] = new Dosen01();
            arrayDosen01[i].inputDosen();
        }

        DataDosen01 dataDosen01 = new DataDosen01();

        dataDosen01.dataSemuaDosen(arrayDosen01);

        dataDosen01.jumlahDosenPerJenisKelamin(arrayDosen01);

        dataDosen01.rerataUsiaDosenPerJenisKelamin(arrayDosen01);
        
        int index = dataDosen01.infoDosenPalingTua(arrayDosen01);
        arrayDosen01[index].tampilDosen();

        index = dataDosen01.infoDosenPalingMuda(arrayDosen01);
        arrayDosen01[index].tampilDosen();

    }
}
