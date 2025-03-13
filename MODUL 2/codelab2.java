//class rekeningbank {
//	String norek;
//	String namanasabah;
//	double saldorek, jumlah;
//
//	public void tampilkanInfo() {
//		System.out.println("Nomor Rekening : " + norek);
//		System.out.println("Nama Pemilik : " + namanasabah);
//		System.out.println("Saldo : " + saldorek);
//	}
//	public void  setoruang() {
//		saldorek += jumlah;
//		System.out.println("Saldo : " + saldorek);
//		System.out.println();
//
//	}
//}
//
//	//public void
//
//	public class codelab2 {
//	public static void main(String[] args){
//		rekeningbank nomor = new rekeningbank();
//		rekeningbank nama = new rekeningbank();
//
//
//	}
//}

	class RekeningBank {
	// Atribut
	private String nomorRekening;
	private String namaPemilik;
	private double saldo;

	// Konstruktor
	public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
		this.nomorRekening = nomorRekening;
		this.namaPemilik = namaPemilik;
		this.saldo = saldo;
	}

	// Method untuk menampilkan informasi rekening
	public void tampilkanInfo() {
		System.out.println("Nomor Rekening: " + nomorRekening);
		System.out.println("Nama Pemilik: " + namaPemilik);
		System.out.println("Saldo: " + saldo);
	}

	// Method untuk setor uang
	public void setorUang(double jumlah) {
		if (jumlah > 0) {
			saldo += jumlah;
			System.out.println("Setor Uang: " + jumlah);
			System.out.println("Saldo setelah setor: " + saldo);
		} else {
			System.out.println("Jumlah setor harus positif.");
		}
	}

	// Method untuk tarik uang
	public void tarikUang(double jumlah) {
		if (jumlah > 0) {
			if (saldo >= jumlah) {
				saldo -= jumlah;
				System.out.println("Tarik Uang: " + jumlah);
				System.out.println("Saldo setelah tarik: " + saldo);
			} else {
				System.out.println("Saldo tidak cukup untuk menarik uang sebesar: " + jumlah);
			}
		} else {
			System.out.println("Jumlah tarik harus positif.");
		}
	}
}

public class codelab2 {
	public static void main(String[] args) {

		RekeningBank rekening1 = new RekeningBank("202410370110388", "Mohamad Akbar Noviandi", 1000000.0);

		RekeningBank rekening2 = new RekeningBank("202410370110433", "Rico Shandika Jovial Agista", 500000.0);

		System.out.println("Informasi Rekening 1:");
		rekening1.tampilkanInfo();
		System.out.println();

		System.out.println("Informasi Rekening 2:");
		rekening2.tampilkanInfo();
		System.out.println();

		rekening1.setorUang(500000.0);
		System.out.println();

		rekening1.tarikUang(300000.0);
		System.out.println();

		rekening2.tarikUang(600000.0);
		System.out.println();

		System.out.println("Informasi Rekening 1 setelah transaksi:");
		rekening1.tampilkanInfo();
		System.out.println();

		System.out.println("Informasi Rekening 2 setelah transaksi:");
		rekening2.tampilkanInfo();
	}
}
