/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan49.biayaemaskawin;

/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Deskripsi Program  : Program untuk menghtung harga emas kawin konsep orientasi objek
 */
public class Emas {
    
    private double mahar;
    private double harga;

    public double getMahar() {
        return mahar;
    }

    public void setMahar(double mahar) {
        this.mahar = mahar;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double hitungHarga(double emas, double harga) {
        return emas * harga;
    }
}
