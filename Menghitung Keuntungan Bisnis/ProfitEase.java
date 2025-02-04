// Mengimport Library Bawaan JDK (Java Development Kit)
// Library Mengambilkan Input Dari User
import java.util.Scanner;
// Library Decimal Formater
import java.text.DecimalFormat;

// Class Utama Program Dari File Ini
public class ProfitEase {
//  Class Utama Atau Main Yang Mengeksekusi Program
    public static void main(String[] args) throws InterruptedException {

//      Mengambil Input User Yang Akan Di Masukan Kedalam Variable
        Scanner input = new Scanner(System.in);

//      Mengubah Format Decimal Menjadi Mata Uang
        DecimalFormat rupiah = new DecimalFormat("#,###");

//      Menampung Pilihan Input User
        String option = "";

//      Initialisasi Semua Variable Yang Akan Digunakan Di Process Program
//      Ada 1 Tipe Data String Dan 5 Tipe Data Interger
        String namaProduk = "";
        int jumlahProduk = 0;
        int hargaPerProduk = 0;
        int keuntunganPenjualan = 0;
        int biayaOperasionalProduksiTotal = 0;
        int keuntunganBersih = 0;

//      Tampilan Command Line Interface Untuk Pilihan User
        getLines(20);
        System.out.println(" PROFITEASE ");
        getLines(20);
        System.out.println(" 1. MULAI ");
        System.out.println(" 2. KELUAR ");
        getLines(20);
        System.out.print(" PILIH OPSI = ");
        option = input.nextLine().toLowerCase();

//      Pengkondisian Jika User Memasukan Input Antara 1 Atau Mulai
        if (option.equals("1") || option.equals("mulai")) {
            getLines(20);

//          Memuat Program
            System.out.print(" Memulai Program...");
            Thread.sleep(3000);

            System.out.print("\r");
            System.out.flush();

//          User Memasukan Nilai Sesuai Dengan Perintah Di Bawah
            System.out.println(" ");
            getLines(50);
            System.out.println(" DATA PRODUK ");
            getLines(50);
            System.out.print(" Nama Produk = ");
            namaProduk = input.nextLine();
            System.out.print(" Jumlah Produk Berhasil Terjual = ");
            jumlahProduk = input.nextInt();
            System.out.print(" Harga Per Produk = ");
            hargaPerProduk = input.nextInt();
            System.out.print(" Biaya Operasional Atau Produksi = ");
            biayaOperasionalProduksiTotal = input.nextInt();
            getLines(50);

//          Program Menghitung Data Dari User Dan Menghasil Data Yang Akan Di Tampilkan
            System.out.print(" Memuat Informasi Data Produk...");
            Thread.sleep(4000);

            System.out.print("\r");
            System.out.flush();

//          Rumus Perhitungan Nilai Nilai Yang Dimasukan Dari User
            keuntunganPenjualan = jumlahProduk * hargaPerProduk;
            keuntunganBersih = keuntunganPenjualan - biayaOperasionalProduksiTotal;

//          Menampilkan Semua Hasil Perhitungan Kepada User
            System.out.println(" ");
            getLines(50);
            System.out.println(" INFORMASI DATA PRODUK ");
            getLines(50);
            System.out.println(" Nama Produk = " + namaProduk);
            System.out.println(" Jumlah Produk Terjual = " + jumlahProduk + " Pieces ");
            System.out.println(" Harga Per Produk = Rp. " + rupiah.format(hargaPerProduk));
            System.out.println(" Biaya Operasional Produksi = Rp. " + rupiah.format(biayaOperasionalProduksiTotal));
            getLines(50);

//          Memprediksi hasil keuntungan atau kerugian
            System.out.print(" Memprediksi Hasil Pemasaran...");
            Thread.sleep(10000);

            System.out.print("\r");
            System.out.flush();

            System.out.println(" Keuntungan Penjualan = Rp. " + rupiah.format(keuntunganPenjualan));
            System.out.println(" Keuntungan Bersih = Rp. " + (keuntunganBersih < 0 ? 0 : rupiah.format(keuntunganBersih)));
            getLines(50);

            Thread.sleep(1000);

            System.out.println(" ");
            getLines(10);
            System.out.println(" [INFO]");
            getLines(80);
//          Menampilkan Info Untung Atau Rugi Kepada User
            if (keuntunganBersih > 0) {
                System.out.println(" Selamat Produk " + namaProduk + " Yang Anda Pasarkan Mengalami Keuntungan Dari");
                System.out.println(" Penjualan Sebanyak Rp. " + rupiah.format(keuntunganBersih) + " Dari Total Biaya Operasional Produksi.");
            } else {
                System.out.println(" Sepertinya Produk " + namaProduk + " Yang Anda Pasarkan Mengalami Kerugian Dari");
                System.out.println(" Penjualan Sebanyak Rp. " + rupiah.format(Math.abs(keuntunganBersih)) + " Dari Total Biaya Operasional Produksi.");
            }
            getLines(80);

//          Data Sudah Berhasil Di Tampilkan Maka Program Akan Keluar Otomatis
            System.out.print(" Keluar Dari Program...");
            Thread.sleep(3000);

            System.out.print("\r");
            System.out.flush();

//          Program Selesai Dan Keluar
            System.out.println(" ");
            getLines(20);
            System.out.println(" Program Selesai. ");
            getLines(20);

            System.out.println(" ");

//      Pengkondisian Jika User Memasukan Input Antara 2 Atau Keluar Maka Program Keluar
        } else if (option.equals("2") || option.equals("keluar")) {
            getLines(20);
            System.out.println(" ");
            getLines(37);
            System.out.println(" Anda Keluar Dari Program ProfitEase.");
            getLines(37);
            System.out.println(" ");

//      Pengkondisian Jika User Memasukan Input Selain 1 Atau 2 Dan Mulai atau Keluar Maka Input Tidak Valid Program Otomatis Keluar
        } else {
            getLines(20);
            System.out.println(" ");
            getLines(35);
            System.out.println(" Opsi Yang Anda Pilih Tidak Valid.");
            getLines(35);
            System.out.println(" ");
        }

        System.out.println(" Hak Cipta © 2024 | Dibuat Oleh ASMNAMIN.");
    }

//  Method Menampilkan Garis
    public static void getLines(int length) {
        System.out.println("─".repeat(length));
    }
}

// CATATAN :
// Dalam Program Ini Memiliki Total 9 Variable Yang Di Deklarasikan Untuk Alur Proses Eksekusi, Diantaranya 5 Interger, 2 String, Dan 2 Object.
// PROFITEASE Dikembangkan Oleh Tim 6 -> Muhammad Nizar Alfauzi, Ilham Nurhakim, Aang Solihin.