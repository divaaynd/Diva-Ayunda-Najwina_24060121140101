/**
* File      : IArea.java 
* Tanggal   : 22/03/2023
* Penulis   : Diva Ayunda Najwina
* Deskripsi : Kelas implementasi IArea berupa cara untuk menghitung luas lingkaran
*/

import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
}