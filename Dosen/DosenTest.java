package Dosen;

public class DosenTest {
 public static void main(String[] args) {
        // Membuat objek dosen
        Dosen d1 = new Dosen("123456", "Muhamad Mustamiin, S.Pd.,M.Kom", "Proyek2");
        Dosen d2 = new Dosen("654321", "Ahmad Rifa'i, S.Tr.Kom., M.Tr.Kom.", "Internet Of Things");

        // Menampilkan data dosen
        d1.tampilData();
        d2.tampilData();

        // Contoh mengubah data
        d1.setMataKuliah("Algoritma dan Struktur Data");
        System.out.println("Setelah update mata kuliah:");
        d1.tampilData();
    }
}
