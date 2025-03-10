import java.util.Scanner;
import java.time.LocalDate;

//java api
//API

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        char jeniskelamin = scanner.nextLine().charAt(0);
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunlahir = scanner.nextInt();

        // Menghitung umur
        int tahunsekarang = LocalDate.now().getYear();
        int umur = tahunsekarang - tahunlahir;

        // Menentukan jenis kelamin

        String jeniskelaminString;
        if (jeniskelamin == 'L' ||  jeniskelamin == 'l') {
            jeniskelaminString = "Laki-laki";
        } else if (jeniskelamin == 'P' || jeniskelamin == 'p') {
            jeniskelaminString = "Perempuan";
        } else {
            jeniskelaminString = "Jenis kelamin tidak valid";
        }

        // Menampilkan hasil
        System.out.println("\n=== Data Diri Pengguna ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jeniskelaminString);
        System.out.println("Umur: " + umur + " tahun");

        // Menutup scanner
        scanner.close();
    }
}