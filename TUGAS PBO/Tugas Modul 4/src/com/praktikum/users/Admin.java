package com.praktikum.users;

import com.praktikum.actions.AdminActions;

public class Admin extends User implements AdminActions {
    protected String username;
    protected String password;

    public Admin(String name, int id, String username, String password) {
        this.name = name;
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void login() {
        System.out.print("Masukkan Username: ");
        String inputUsername = input.nextLine();
        System.out.print("Masukkan Password: ");
        String inputPassword = input.nextLine();

        if (this.username.equals(inputUsername) && this.password.equals(inputPassword)) {
            System.out.println("Login Admin Berhasil. Selamat datang, " + this.name + "!");
        } else {
            System.out.println("Username atau Password salah.");
            System.exit(0);
        }
    }
    @Override
    public void manageItems(){
        System.out.println(">> Fitur Kelola Barang Belum Tersedia <<");
    }
    @Override
    public void manageUsers(){
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }
    @Override
    public void managetest(){
        System.out.println(">> Fitur Kelola Tester belum tersedia <<");
    }
    @Override
    public void displayAppMenu() {
        System.out.println("\n--- Menu Admin ---");
        System.out.println("1. Kelola Barang");
        System.out.println("2. Kelola Pengguna");
        System.out.println("3. Kelola Tester");
        System.out.print("Pilih Menu: ");
    }
}
