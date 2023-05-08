/**
 * File      : Manajer.java	/ 03/05/23
 * Penulis   : Diva Ayunda Najwina / 240601211400101
 * Deskripsi : Manajer.java adalah sub kelas dari pegawai yang berisi Atribut dan Metode untuk Manajer
 *
 */

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer (String nama) {
        super.setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}