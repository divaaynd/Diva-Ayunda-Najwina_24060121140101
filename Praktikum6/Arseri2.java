/**
* File      : Arseri2.java
* Tanggal   : 29/03/2023
* Penulis   : Diva Ayunda Najwina
* Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
*/

/ class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}
//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0) : "jari jari tidak boleh nol!!!";
		Lingkaran lingkaran = new Lingkaran(jariJari);
		double kelilingLingkaran = lingkaran.hitungKeliling();
		System.out.println("keliling lingkaran = " + kelilingLingkaran);
	}
}

// program diatas sudah tepat jika dijalankan menggunakan enableassertions karena jari-jari diinisialiasikan
// dengan nilai nol, jika ingin memastikan bahwa asersi itu berhasil  maka nilai jari-jari harus di inisiliasikan dengan 1.0
