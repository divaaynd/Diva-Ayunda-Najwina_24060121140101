/**
 * File      : BangunDatarGeneric.java		17/05/23
 * Penulis   : Diva Ayunda Najwina / 24060121140101
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 *
 */

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}


/* 
public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 bangunDatar;
    public void set(T1 tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }
    public T1 get() {
        return bangunDatar;
    }
    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}
*/

/*
Pertanyaan:
Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti
dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan !
Jawaban:
Tidak ada masalah dan juga perubahan pada code, code tetap dapat berjalan dengan baik
tanpa ada error. Tetapi kenapa huruf T yang dahulu dipakai daripada T1 atau yang lain
adalah karena penamaan konvensi yang sudah ditentukan adalah huruf T, itulah kenapa penggunaan
huruf T lebih sering digunakan pada umumnya.
 */