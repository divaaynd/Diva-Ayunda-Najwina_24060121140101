/**
* File      : Asersi1.java
* Tanggal   : 29/03/2023
* Penulis   : Diva Ayunda Najwina
* Deskripsi : Program untuk menunjukan asersi
*/

public class Asersi1{
	public static void main(String[] args){
		int x = 0;
		if(x>0){
			System.out.println("x bilangan postif");
		}else{
			assert(x<0):"ada kesalahan kode";
			System.out.println("x bilangan negatif");
		}
	}
}