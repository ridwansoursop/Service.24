package com.company;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 * TUGAS AKHIR - INTRODUCTION TO PROGRAMMING
 *
 * Nama Program :
 * PROGRAM APLIKASI SEVICE.24
 *
 * Dibuat oleh :
 * JFBA - Kelompok 1
 *
 * Anggota Kelompok :
 * 2440086905 - Muchammad Wildan Thofani
 * 2440079995 - Muhammad Ridwan Arifin
 * 2440087706 - Dyah Ayu Shafitri
 * 2440076665 - Mesati Andriyani
 * 2440087555 - Anggita Krisna Putri
 */

public class Main {

    //INISIALISASI
    public static String nama, alamat, nomor;
    public static int[] qty = new int[99];
    public static int[] kode = new int[99];
    public static String[] barang = new String[99];
    public static int[] harga = new int[99];
    public static double diskon = 0.1;
    public static double total_bayar = 0;
    public static Scanner scan = new Scanner(System.in);
    public static int jum = 1, i = 0;
    public static int banyakpesanan = 0;

    //MAIN
    public static void main(String[] args) {
        //Memanggil Method untuk mengisi biodata terlebih dahulu
        personalData();
    }

    //MENU PENGISIAN DATA
    public static void personalData() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("+------------------------------------+");
        System.out.println("| SELAMAT DATANG DI APLIKASI SERVICE |");
        System.out.println("|    Siap 24 jam melayani customer   |");
        System.out.println("+------------------------------------+");
        System.out.println();
        System.out.println("MASUKAN DATA DIRI TERLEBIH DAHULU     ");
        System.out.println("--------------------------------------");
        //Input Data
        System.out.print("Masukan nama            : ");
        nama = scan.next();
        System.out.print("Masukan alamat          : ");
        alamat = scan.next();
        System.out.print("Masukan nomor           : ");
        nomor = scan.next();
        //Panggil method Menu Utama Aplikasi
        app();
        System.out.println("---------------------------------");
    }

    //MENU UTAMA APLIKASI
    public static void app() {

        int menu;
        Scanner scan = new Scanner(System.in);
        //LIST MENU
        System.out.println("");
        System.out.println("PILIHAN MENU SERVICE : ");
        String[] listMenu = {"1. AC", "2. LAUNDRY", "3. JASA PEMBERSIH", "4. SERVIS ELEKTRONIK", "5. TUKANG LEDENG"};

        while (true) {

            //LOOP LIST VARIABEL LIST MENU
            for (String s : listMenu) {
                System.out.println(s);
            }

            System.out.println();
            System.out.print("Menu (1/2/3/4/5) : ");

            //If Else untuk menu jasa yang diinginkan
            menu = scan.nextInt();
            if (menu == 1) {
                //Memanggil method untuk jasa service ac
                ACService();
            }
            if (menu == 2) {
                //Memanggil method untuk jasa Laundry
                LaundryService();
            }
            if (menu == 3) {
                //Memanggil method untuk jasa pembersihan
                PembersihanService();
            }
            if (menu == 4) {
                //Memanggil method untuk jasa service elektronik
                ElektronikService();
            }
            if (menu == 5) {
                //Memanggil method untuk jasa Ledeng
                LedengService();
            }
            else {
                System.out.println("Kode Menu Tidak Tersedia");
                app();
            }
        }
    }

    //MENU JASA SERVICE AC
    public static void ACService() {

        //list menu AC
        int[] listHargaAC = {70000, 150000, 60000};
        String[] listMenuAC = {"1. Cuci AC Rp." + listHargaAC[0], "2. Bongkar AC Rp." + listHargaAC[1], "3. Reparasi AC Rp." + listHargaAC[2]};
        System.out.println("MENU AC :");
        for (String s : listMenuAC) {
            System.out.println(s);
        }
        System.out.println();

        System.out.print("Menu (1/2/3) : ");
        kode[i] = scan.nextInt();
        System.out.print("Jumlah (qty) : ");
        qty[i] = scan.nextInt();

        switch (kode[i]) {
            case 1:
                barang[i] = "Cuci AC            ";
                harga[i] = 70000;

                break;
            case 2:
                barang[i] = "Bongkar AC         ";
                harga[i] = 150000;

                break;
            case 3:
                barang[i] = "Reparasi AC        ";
                harga[i] = 60000;

                break;
            default:
                System.out.println("Kode Barang Tidak Tersedia");
                ACService();

        }
        //Digunakan untuk menambah banyak pesanan di nota
        i++;
        banyakpesanan++;
        anotherService(banyakpesanan, qty, harga, diskon, total_bayar, barang);

    }

    //MENU JASA SERVICE LAUNDRY
    public static void LaundryService() {
        //list menu laundry
        int[] listHargaLaundry = {3000, 5000, 4000};
        String[] listMenuLaundry = {"1. Cuci Kering Rp." + listHargaLaundry[0], "2. Cuci Setrika Rp." + listHargaLaundry[1], "3. Setrika Rapi Rp." + listHargaLaundry[2]};
        System.out.println("MENU LAUNDRY :");
        for (String s : listMenuLaundry) {
            System.out.println(s);
        }
        System.out.println();
        System.out.print("Menu (1/2/3) : ");
        kode[i] = scan.nextInt();
        System.out.print("Jumlah (qty) : ");
        qty[i] = scan.nextInt();

        switch (kode[i]) {
            case 1:
                barang[i] = "Cuci Kering       ";
                harga[i] = 3000;

                break;
            case 2:
                barang[i] = "Cuci Setrika      ";
                harga[i] = 5000;

                break;
            case 3:
                barang[i] = "Setrika Rapi      ";
                harga[i] = 4000;

                break;
            default:
                System.out.println("Kode Barang Tidak Tersedia");
                LaundryService();

        }
        //Digunakan untuk menambah banyak pesanan di nota
        i++;
        banyakpesanan++;
        anotherService(banyakpesanan, qty, harga, diskon, total_bayar, barang);
    }

    //MENU JASA PEMBERSIHAN
    public static void PembersihanService() {
        //list menu jasa pembersihan
        int[] listHargaJasaPembersihan = {25000, 90000, 150000};
        String[] listMenuJasaPembersihan = {"1. Jasa bersih kos Rp." + listHargaJasaPembersihan[0], "2. Jasa bersih ruko Rp." + listHargaJasaPembersihan[1], "3. Jasa bersih rumah Rp." + listHargaJasaPembersihan[2]};
        System.out.println("Menu Jasa Pembersihan:");
        for (String s : listMenuJasaPembersihan) {
            System.out.println(s);
        }
        System.out.println();

        System.out.print("Menu (1/2/3) : ");
        kode[i] = scan.nextInt();

        System.out.print("Jumlah (qty) : ");
        qty[i] = scan.nextInt();

        switch (kode[i]) {
            case 1:
                barang[i] = "Jasa bersih kos    ";
                harga[i] = 25000;

                break;
            case 2:
                barang[i] = "Jasa bersih ruko   ";
                harga[i] = 90000;

                break;
            case 3:
                barang[i] = "Jasa bersih rumah  ";
                harga[i] = 150000;

                break;
            default:
                System.out.println("Kode Barang Tidak Tersedia");
                PembersihanService();

        }
        //Digunakan untuk menambah banyak pesanan di nota
        i++;
        banyakpesanan++;
        anotherService(banyakpesanan, qty, harga, diskon, total_bayar, barang);
    }

    //MENU JASA SERVICE ELEKTRONIK
    public static void ElektronikService() {
        //list menu service elektronik
        int[] listHargaServiceElektronik = {200000, 60000, 150000};
        String[] listMenuServiceElektronik = {"1. Service mesin cuci Rp." + listHargaServiceElektronik[0], "2. Service kulkas Rp." + listHargaServiceElektronik[1], "3. Service televisi Rp." + listHargaServiceElektronik[2]};
        System.out.println("MENU SERVICE ELEKTRONIK :");
        for (String s : listMenuServiceElektronik) {
            System.out.println(s);
        }
        System.out.println();

        System.out.print("Menu (1/2/3) : ");
        kode[i] = scan.nextInt();
        System.out.print("Jumlah (qty) : ");
        qty[i] = scan.nextInt();
        switch (kode[i]) {
            case 1:
                barang[i] = "Service mesin cuci ";
                harga[i] = 200000;

                break;
            case 2:
                barang[i] = "Service kulkas     ";
                harga[i] = 60000;

                break;
            case 3:
                barang[i] = "Service televisi   ";
                harga[i] = 150000;

                break;
            default:
                System.out.println("Kode Barang Tidak Tersedia");
                ElektronikService();
        }
        //Digunakan untuk menambah banyak pesanan di nota
        i++;
        banyakpesanan++;
        anotherService(banyakpesanan, qty, harga, diskon, total_bayar, barang);

    }

    //MENU JASA TUKANG LEDENG
    public static void LedengService() {
        //list menu tukang ledeng
        int[] listHargaTukangLedeng = {20000, 150000, 100000};
        String[] listMenuTukangLedeng = {"1. Pasang pipa air Rp." + listHargaTukangLedeng[0], "2. Pasang pemanas air Rp." + listHargaTukangLedeng[1], "3. Pompa air Rp." + listHargaTukangLedeng[2]};

        System.out.println("MENU TUKANG LEDENG :");
        for (String s : listMenuTukangLedeng) {
            System.out.println(s);
        }
        System.out.println();

        System.out.print("Menu (1/2/3) : ");
        kode[i] = scan.nextInt();
        System.out.print("Jumlah (qty) : ");
        qty[i] = scan.nextInt();

        switch (kode[i]) {
            case 1:
                barang[i] = "Pasang pipa air    ";
                harga[i] = 20000;

                break;
            case 2:
                barang[i] = "Pasang pemanas air ";
                harga[i] = 150000;

                break;
            case 3:
                barang[i] = "Pompa air          ";
                harga[i] = 100000;

                break;
            default:
                System.out.println("Kode Barang Tidak Tersedia");
                LedengService();
        }
        //Digunakan untuk menambah banyak pesanan di nota
        i++;
        banyakpesanan++;
        anotherService(banyakpesanan, qty, harga, diskon, total_bayar, barang);

    }

    //OPSI TAMBAH JASA
    public static void anotherService(int jum, int[] qty, int[] harga, double diskon, double total_harga, String[] barang) {
        Scanner scan = new Scanner(System.in);
        String yesOrNo;

        System.out.println("Apakah ingin menambah service lain? (y/n)");
        System.out.print("Masukkan Pilihan: ");
        yesOrNo = scan.nextLine();

        if (yesOrNo.equals("y")) {
            app();
        } else {
            nota(jum, qty, harga, diskon, total_harga, barang);
            System.out.print("");
            System.out.println("Apakah ingin melakukan transaksi lainnya? (y/n)");
            System.out.print("Masukkan Pilihan: ");
            yesOrNo = scan.nextLine();
            if (yesOrNo.equals("y")) {
                //Jika memilih y maka akan kembali mengisi biodata
                jum = 1;
                i = 0;
                banyakpesanan = 0;
                personalData();
            } else {
                //Jika memilih n maka program berhenti
                System.exit(0);
            }
        }
    }

    //CETAK NOTA
    public static void nota(int jum, int[] qty, int[] harga, double diskon, double total_harga, String[] barang) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        double[] sub_total = new double[99];
        int i;

        //Pengaturan format number
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("                              APLIKASI SERVICE                             ");
        System.out.println("                          Jalan Mawar no.1 Malang                          ");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Nama Pelanggan : " + nama                                                   );
        System.out.println("Alamat         : " + alamat                                                 );
        System.out.println("NO. HP         : " + nomor                                                  );
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("No   Layanan Service     Harga              Qty   Total                    ");
        System.out.println("---------------------------------------------------------------------------");
        //Menampilkan seluruh elemen di dalam array
        for (i = 0; i < jum; i++) {
            sub_total[i] = ((qty[i] * harga[i]));

            total_harga += sub_total[i];
            System.out.println(i + 1 + "    " + barang[i] + "   " + kursIndonesia.format(harga[i]) + "     " + qty[i] + "    " + kursIndonesia.format(sub_total[i]));
        }
        System.out.println(" ");
        //Menampilkan total bayar
        System.out.println("Total   : " + kursIndonesia.format(total_harga));
        System.out.println("Diskon  : " + kursIndonesia.format(total_harga * diskon));
        System.out.println("Bayar   : " + kursIndonesia.format(total_harga - (total_harga * diskon)));
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("                Terima Kasih Telah Menggunakan Jasa Kami                   ");
        System.out.println("---------------------------------------------------------------------------");
    }
}
