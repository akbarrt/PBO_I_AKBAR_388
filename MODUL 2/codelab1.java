class Hewan {

    String nama;
    String jenis;
    String suara;

    Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }


    //membuat method untuk menampilkan hewan
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println();
    }
}

public class codelab1 {
    public static void main(String[] args) {
        // Membuat objek Hewan
        Hewan hewan1 = new Hewan("Ayam", "Herbivora", "Cukurukukk");
        Hewan hewan2 = new Hewan("Serigala", "Karnivora", "Auuuuuu!!");

        // Memanggil metode tampilkanInfo() dari kedua objek
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}