/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan52.siapakamu;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menampilkan dosen dan mahasiswa  beserta pekerjaannya
 */
public class Dosen extends Manusia {
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    public void mengajarApa(){
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang mengajar matakuliah " + mataKuliah);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen"); //To change body of generated methods, choose Tools | Templates.
    }
   
}