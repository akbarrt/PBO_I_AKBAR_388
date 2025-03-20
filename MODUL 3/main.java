public class Main {
    public static void main(String[] args) {
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);

        System.out.println("Status Awal Kesehatan:");
        System.out.println(brimstone.getNama() + " Kesehatan: " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + " Kesehatan: " + viper.getKesehatan());

        System.out.println("\nPertarungan Dimulai!");
        brimstone.serang(viper);
        viper.serang(brimstone);
    }
}