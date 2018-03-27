/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author user
 */
public class sepedaaksi {
    public static void main(String[] args) {
        sepeda A = new sepeda();
        sepeda B = new sepeda();
        sepeda C = new sepeda();
        
        A.bahan_sepeda="carbon";
        A.warna_sepeda="merah";
        A.harga_sepeda="2000000";
        A.merk_sepeda="polygon";
        A.jenis_sepeda="sepeda gunung";
        
        B.bahan_sepeda="fiber";
        B.warna_sepeda="hitam";
        B.harga_sepeda="1000000";
        B.merk_sepeda="wimcycle";
        B.jenis_sepeda="sepeda santai";
        
        C.bahan_sepeda="besi";
        C.warna_sepeda="silver";
        C.harga_sepeda="500000";
        C.merk_sepeda="phoenix";
        C.jenis_sepeda="sepeda balap";
        
        
        A.transportasi();
        System.out.println();
        B.transportasi();
        System.out.println();
        C.transportasi();
       
    }
}
