/**
* File      : AngkaSial.java
* Tanggal   : 29/03/2023
* Penulis   : Diva Ayunda Najwina
* Deskripsi : program pengunaan execption buat sendiri Pengenalan klausa 'throw' dan 'throws'
*/

public class AngkaSial{
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new  AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial"); // dapat di ekesekusi karena telah diberikan mekanisme berupa catch pada baris ke 21
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukan angka !!!");
		}
	}
}