/**
* File      : BujurSangkar.java 
* Tanggal   : 15/03/2023
* Penulis   : Diva Ayunda Najwina
* Deskripsi : Representasi dasar dari BujurSangkar
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
       private double panjangSisi;

       public BujurSangkar (double panjangSisi) {
              this.panjangSisi = panjangSisi;
              this.jumlahSisi = 4;
      
       }

       public double hitunganLuas () {
              return this.panjangSisi * this.panjangSisi;

       }

       public double getPanjangSisi() {
              return this.panjangSisi;

       }