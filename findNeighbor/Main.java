package com.findNeighbor;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Girin : ");
        int boyut = klavye.nextInt();
        Yazdır(boyut);
    }

    public static void Yazdır(int boyut){
        Random rnd = new Random();
        int[][] matris = new int[boyut][boyut];
        String sonuc;
        for (int i = 0; i < boyut; i++){
            for (int j = 0; j < boyut; j++){
                if (i != j)
                    matris[i][j] = rnd.nextInt(2);
                else
                    matris[i][j] = 0;
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
        int c = 1;
        for (int i = 0; i < boyut; i++){
            sonuc = "";
            for (int j = 0; j < boyut; j++){
                if (matris[i][j] == 1)
                    sonuc = sonuc + (j + c) + " ";
            }
            if (sonuc.equals("")) //sonuc == "";
                sonuc = "Komşuları Yoktur";
            System.out.println((c + i)  + ". Hücrenin Komşuları : " + sonuc);
        }
    }
}