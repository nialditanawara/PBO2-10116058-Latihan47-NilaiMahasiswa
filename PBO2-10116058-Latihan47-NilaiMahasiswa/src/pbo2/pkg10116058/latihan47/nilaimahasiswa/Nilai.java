/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan47.nilaimahasiswa;

public class Nilai {

    private double nilaiAkhir;
    private double quis;
    private double uas;
    private double uts;
    private char index;

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public double getQuis() {
        return quis;
    }

    public void setQuis(double quis) {
        this.quis = quis;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }




    public char Indeks() {
        if ((nilaiAkhir > 80) && (nilaiAkhir <= 100)) {
            index = 'A';
        } else if ((nilaiAkhir > 68) && (nilaiAkhir <= 80)) {
            index = 'B';
        } else if ((nilaiAkhir > 56) && (nilaiAkhir <= 68)) {
            index = 'C';
        } else if ((nilaiAkhir > 45) && (nilaiAkhir <= 56)) {
            index = 'D';
        } else if ((nilaiAkhir >= 0) && (nilaiAkhir <= 45)) {
            index = 'E';
        }
        return index;
    }

    public String keterangan() {
        String ket = null;

        switch (index) {
            case 'A':
                ket = ("Sangat Baik");
                break;
            case 'B':
                ket = ("Baik");
                break;
            case 'C':
                ket = ("Cukup");
                break;
            case 'D':
                ket = ("Kurang");
                break;
            case 'E':
                ket = ("Sangat kurang");
                break;
            default:
                break;
        }
        return ket;
    }

    public double nilaiAkhir() {

        return nilaiAkhir = (quis * 0.2) + (uts * 0.3) + (uas * 0.5);
    }

}