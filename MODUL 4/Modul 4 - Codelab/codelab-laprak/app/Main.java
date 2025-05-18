import perpustakaan.*;


public class Main {
    public static void main (String[] args){
        int durasi = 7;

        Buku fiksi1 = new Fiksi("Cerita Masyarakat mitos pohon pisang", "Akbar Noviandi");
        Buku nonFiksi1 = new NonFiksi("Filosofi Teras", "Henry Manampiring ");

        fiksi1.displayInfo();
        nonFiksi1.displayInfo();

        Anggota member1 = new Anggota("Diki", "426");
        Anggota member2 = new Anggota("Rico", "433");

        member1.pinjamBuku(fiksi1.getJudul());
        member2.pinjamBuku(nonFiksi1.getJudul(), durasi);

        member1.kembalikanBuku(fiksi1.getJudul());
        member2.kembalikanBuku(nonFiksi1.getJudul());
    }

}
