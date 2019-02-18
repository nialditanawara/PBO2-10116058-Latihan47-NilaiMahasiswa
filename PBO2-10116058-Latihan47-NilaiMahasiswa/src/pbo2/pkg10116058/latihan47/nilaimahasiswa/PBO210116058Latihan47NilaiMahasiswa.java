/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan47.nilaimahasiswa;

import java.text.DecimalFormat;

public class PBO210116058Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Nilai nilai1 = new Nilai();
        Nilai nilai2 = new Nilai();
        Nilai nilai3 = new Nilai();
        
        //nilai1
        nilai1.getNilaiAkhir();
        //inputan tidak dari keyboar user
        nilai1.setQuis(75.0);
        System.out.println("Quiz\t    = " + nilai1.getQuis());
        nilai1.setUts(45.0);
        System.out.println("UTS\t    = " + nilai1.getUts());
        nilai1.setUas(34.0);
        System.out.println("UAS\t    = " + nilai1.getUas());
        

        System.out.println("\nNilai Akhir = " + nilai1.nilaiAkhir());
        System.out.println("\nIndex = " + nilai1.Indeks());
        System.out.println("Keterangan = " + nilai1.keterangan());
        
        //nilai2
        nilai2.getNilaiAkhir();
        //inputan tidak dari keyboar user
        System.out.println("");
          System.out.println("=====================");
        nilai2.setQuis(60.0);
        System.out.println("Quiz\t    = " + nilai2.getQuis());
        nilai2.setUts(80.0);
        System.out.println("UTS\t    = " + nilai2.getUts());
        nilai2.setUas(75.0);
        System.out.println("UAS\t    = " + nilai2.getUas());
        

        System.out.println("\nNilai Akhir = " + nilai2.nilaiAkhir());
        System.out.println("\nIndex = " + nilai2.Indeks());
        System.out.println("Keterangan = " + nilai2.keterangan());
        
        //nilai3
        nilai3.getNilaiAkhir();
        //inputan tidak dari keyboar user
        System.out.println("");
         System.out.println("=====================");
        nilai3.setQuis(30.0);
        System.out.println("Quiz\t    = " + nilai3.getQuis());
        nilai3.setUts(80.0);
        System.out.println("UTS\t    = " + nilai3.getUts());
        nilai3.setUas(40.0);
        System.out.println("UAS\t    = " + nilai3.getUas());
        

        System.out.println("\nNilai Akhir = " + nilai3.nilaiAkhir());
        System.out.println("\nIndex = " + nilai3.Indeks());
        System.out.println("Keterangan = " + nilai3.keterangan());

    }

}