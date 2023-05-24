/**
 * File      : Segitiga.java		17/05/23
 * Penulis   : Diva Ayunda Najwina / 24060121140101
 * Deskripsi : implementasi Segitiga sebagai BangunDatar
 *
 */

 public class Segitiga extends BangunDatar{
    private double sisi;

    public Segitiga(double sisi) {
        this.sisi = sisi;
    }
    public double hitungKeliling() {
        return sisi + sisi + sisi;
    }
}
Footer
