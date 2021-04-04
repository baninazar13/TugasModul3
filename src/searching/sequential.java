
package searching;

import java.util.*;

public class sequential {
    
    public static void main (String[] args) {
        
        System.out.println("===== SEARCH SEQUENTIAL =====");
        
        String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Bani", "Tesla"};
        String cari;
        String nama;
        nama = "Muhamad Bani Nazar";       
               
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan data yang akan dicari : ");
        cari = input.nextLine();
        
        System.out.println("Isi data adalah : " );
        for (int i = 0; i < data.length; ++i) {
            System.out.print(data[i] + " "); 
        
        }
        System.out.println("");
        
        
        for (int i = 0; i <= data.length; ++i) {
            if (cari.equalsIgnoreCase(data[i])) {
                System.out.println("Data " + cari + " berada di indeks ke-" + i);
                break;
            }
        }
        System.out.println("");
        System.out.println("Nama : " + nama);
        System.out.println("===== Terima Kasih =====");
        } 
        
    }

        
    

