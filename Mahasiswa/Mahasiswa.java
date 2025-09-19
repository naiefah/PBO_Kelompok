package Mahasiswa;

public class Mahasiswa {
    
    public String nama;
    public String nim;
    public String kelas;
    public String prodi;

    public void submitTugas(){
        System.out.println("Tugas telah di-kerjakan oleh " + this.nama + "("+ this.nim +")");
    }

    public int cekNilai(){
        return 100;
    }

}
