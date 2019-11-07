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
public class IF110118005Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN: " +dosen.getNip());
        dosen.siapaKamu();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.mengajarApa();
        System.out.println("\n");
        
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("10110269");
        System.out.println("NIM MAHASISWA: " +mhs.getNim());
        mhs.siapaKamu();
        mhs.setNama("Nindi");
        mhs.setUmur(17);
        mhs.setKelas("PBO2");
        mhs.kelasApa();
        
        
    }
    
}
