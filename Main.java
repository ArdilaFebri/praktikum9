public class Main{
    public static void main(String[] args){

        Buku buku1 = new Buku ("B001", "Pemrograman Java");
        Buku buku2 = new Buku ("B002", "Pemrograman C++");
        Buku buku3 = new BukuLuar ("B003", "Harry Potter");

        Petugas petugas1 = new Petugas ("Alex", "P001");
        Peminjam peminjam1 = new Mahasiswa();
        peminjam1.setNamaPeminjam("Budi");
        peminjam1.setKodePeminjam("M0001");

        Peminjam peminjam2 = new Mahasiswa();
        peminjam2.setNamaPeminjam("Ardila");
        peminjam2.setKodePeminjam("Ayu");

        peminjam1.doLogin();
        peminjam2.doLogin();

        try{
            Peminjaman peminjaman1 = new Peminjaman(peminjam1, petugas1, buku2);

            System.out.println("Nama Peminjam: " + peminjaman1.getPeminjam().getNamaPeminjam());
            System.out.println("Kode Peminjam: " + peminjaman1.getPeminjam().getKodePeminjam());
            System.out.println("Nama Petugas: " + peminjaman1.getPetugas().getNamaPetugas());
            System.out.println("Nama Buku: " + peminjaman1.getBuku().getNamaBuku());
            Denda denda1 = new Denda(peminjaman1, hariTerlambat:5);
            System.out.println ("Tagihan denda: " + denda1.getTagihan());

            System.out.println ("===================");

            Peminjaman peminjaman2 = new Peminjaman(peminjam2, petugas1, buku3);

            System.out.println("Nama Peminjam: " + peminjaman2.getPeminjam().getNamaPeminjam());
            System.out.println("Kode Peminjam: " + peminjaman1.getPeminjam().getKodePeminjam());
            System.out.println("Nama Petugas: " + peminjaman1.getPetugas().getNamaPetugas());
            System.out.println("Nama Buku: " + peminjaman1.getBuku().getNamaBuku());
            Denda denda2 = new Denda(peminjaman2, hariTerlambat:7);
            System.out.println("Tagihan denda: " + denda2.getTagihan());

            System.out.println("== Denda dihapuskan ! ==");

            peminjam2.addAntiDenda();

            System.out.println("Tagihan denda: " + denda2.getTagihan());

            System.out.println("== Denda ditambahakan ! ==");

            peminjam2.removeAntiDenda();

            System.out.println("tagihan denda: " + denda2.getTagihan());

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally{
            System.out.println("Program Selesai");
    
        }
    }
}
