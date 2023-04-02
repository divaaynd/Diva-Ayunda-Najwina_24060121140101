/**
* File      : AngkaSial.java
* Tanggal   : 29/03/2023
* Penulis   : Diva Ayunda Najwina
* Deskripsi : Eksepsi buat sendiri, menolak masukan angka 13!
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukan angka 13 karena angka sial !!!");
	}
}