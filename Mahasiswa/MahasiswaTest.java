package Mahasiswa;

public class MahasiswaTest {
    
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Naiefah Fawwaztiyani";
        mahasiswa1.nim = "2403060";
        mahasiswa1.kelas = "D3TI2B";
        mahasiswa1.prodi = "Teknik Informatika";
        mahasiswa1.submitTugas();
        mahasiswa1.cekNilai();

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Siska Oktaviani";
        mahasiswa2.nim = "2403004";
        mahasiswa2.kelas = "D3TI2B";
        mahasiswa2.prodi = "Teknik Informatika";
        mahasiswa2.submitTugas();
        mahasiswa2.cekNilai();

        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nama = "Ainun Nihayah";
        mahasiswa3.nim = "2403010";
        mahasiswa3.kelas = "D3TI2B";
        mahasiswa3.prodi = "Teknik Informatika";
        mahasiswa3.submitTugas();
        mahasiswa3.cekNilai();
        
    }

}
