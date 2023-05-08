/**
 * File      : Programmer.java / 03/05/23
 * Penulis   : Diva Ayunda Najwina / 24060121140101
 * Deskripsi : Programmer.java adalah sub kelas dari pegawai yang berisi Atribut dan Metode untuk Programmer
 *
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer (String nama) {
        super.setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("bonus : " + this.bonus);
    }
}