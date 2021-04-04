
package searching;

import java.util.*;

public class binary {
    
    public static void main (String[] args) {
        
        int Data[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int Cari;
        int IndeksAwal = 0;
        int IndeksAkhir = Data.length-1;
        int ketemu = 0;
        int point = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan data yang dicari: ");
        Cari = scan.nextInt();
        
        System.out.println("isi data adalah ");
        for (int i = 0; i < Data.length; ++i) {
            System.out.print(Data[i] + " ");
        }
        System.out.println("\n");
        
        while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)) {
            point = (IndeksAwal + IndeksAkhir) / 2;
            System.out.println("indeks pointer : " + point);
            if (Cari == Data[point]) {
                ketemu = 1;
                System.out.println("Data " + Cari + " Telah ditemukan pada indeks ke " + point);
                
            }
            else if (Cari < Data[point]) {
                System.out.println("Cari di kiri ");
                IndeksAkhir = point - 1;
            }
            else {
                IndeksAwal = point + 1;
                System.out.println("Cari di kanan ");
            }
        }
        if (ketemu == 1)
            System.out.println("kesimpulan: data ditemukan ");
        else
            System.out.println("kesimpulan: data tidak ditemukan ");
        System.out.println("Muhamad Bani Nazar");
    }
}
