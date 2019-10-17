
import if01.pbo1.pkg10118009.latihan31.perkenalanmahasiswa.mHs;

/*
 * NAMA              : Tassyakur Pasya
 * KELAS             : IF-01
 * NIM               : 10118009
 * DESKRIPSI PROGRAM : Perkenalan Mahasiswa
 */

public class IF01PBO110118009Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mHs Mahasiswa = new mHs();
        
        mHs.NIM = "10118009";
        mHs.Nama = "Tassyakur Pasya";
        mHs.Kelas = "IF01";
        mHs.perkenalanMahasiswa();
        
        mHs.NIM = "10118039";
        mHs.Nama = "Fatahillah Satria Bima S";
        mHs.Kelas = "IF01";
        mHs.perkenalanMahasiswa();

        
        
    }

}
