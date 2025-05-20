package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;

public class Mahasiswa extends User implements MahasiswaActions {
    private String namaBarang;
    private String deskripsi;
    private String lokasi;

    public Mahasiswa(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void login() {
        System.out.print("Masukkan Nama: ");
        String inputName = input.nextLine();
        System.out.print("Masukkan ID: ");
        int inputId = input.nextInt();
        input.nextLine();

        if (this.name.equals(inputName) && this.id == inputId) {
            System.out.println("Login Mahasiswa Berhasil. Selamat datang, " + this.name + "!");
        } else {
            System.out.println("Nama atau ID salah.");
            System.exit(0);
        }
    }
    @Override
    public void reportItem(){
        System.out.println("======= Formulir Laporan Barang Hilang =======");

        System.out.print("Masukkan Nama Barang: ");
        namaBarang = input.nextLine();

        System.out.print("Masukkan Deskripsi Barang: ");
        deskripsi = input.nextLine();

        System.out.print("Masukkan Lokasi Terakhir/Ditemukan: ");
        lokasi = input.nextLine();

        System.out.println("\nLaporan berhasil dikirim!");

    }
    @Override
    public void viewReportedItems(){
        if (namaBarang != null){
            System.out.println("Laporan Anda: ");
            System.out.println("Nama  Barang    : " + namaBarang);
            System.out.println("Deskripsi       : " + deskripsi);
            System.out.println("Lokasi Terakhir : " + lokasi);
        } else {
            System.out.println(">> Belum ada laporan yang dikirim <<");
        }
    }
    @Override
    public void displayAppMenu() {
        int menu;
        do {
            System.out.println("\n--- Menu Mahasiswa ---");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih Menu: ");
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println("Logout...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (menu != 0);
    }
}

