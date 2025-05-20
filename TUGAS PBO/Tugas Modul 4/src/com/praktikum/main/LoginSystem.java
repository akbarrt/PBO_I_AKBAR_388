package com.praktikum.main;

import com.praktikum.actions.AdminActions;
import com.praktikum.actions.MahasiswaActions;
import com.praktikum.users.User;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.Admin;

public class LoginSystem {
    public static void main(String[] args) {
        // Gunakan tipe yang sesuai agar bisa akses method dari interface
        Admin admin = new Admin("Akbar", 388, "akbar388", "qwerty");
        Mahasiswa mahasiswa = new Mahasiswa("Mohamad Akbar", 388);

        System.out.println("Pilihan Login");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan (1/2): ");

        int pilihan = User.input.nextInt();
        User.input.nextLine();

        if (pilihan == 1) {
            System.out.println("\n=== Login Admin ===");
            admin.login();
            admin.displayAppMenu();
            int menu = User.input.nextInt();
            User.input.nextLine();

            AdminActions action1 = admin;

            if(menu == 1) {
                action1.manageItems();
            } else if(menu == 2) {
                action1.manageUsers();
            } else {
                System.out.println("Pilihan Tidak Valid");
            }
        } else if (pilihan == 2) {
            System.out.println("\n=== Login Mahasiswa ===");
            mahasiswa.login();
            MahasiswaActions actions = mahasiswa;
            mahasiswa.displayAppMenu();

            int menu = User.input.nextInt();
            User.input.nextLine();
            if (menu == 1) {
                actions.reportItem();
            } else if (menu == 2) {
                actions.viewReportedItems();
            } else {
                System.out.println("Pilihan Menu Tidak Valid");
            }

        } else {
            System.out.println("Pilihan Tidak Valid");
        }

        User.input.close();
    }
}
