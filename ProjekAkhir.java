package com.company;
import java.util.Scanner;

public class ProjekAkhir {
    public static void main(String args[]){
        int pilihan = 0;
        while(pilihan != 5) {
            Scanner in = new Scanner(System.in);
            System.out.println("=========================MENU=========================");
            System.out.println("1. Undang-undang terkait hak wanita di Indonesia");
            System.out.println("2. Telepon Call Center");
            System.out.println("3. Donasi terkait emansipasi wanita");
            System.out.println("4. Data wanita korban kekerasan");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = in.nextInt();
            switch (pilihan){
                case 1: UU(); break;
                case 2: Telepon(); break;
                case 3: Donasi(); break;
                case 4: Korban(); break;
                case 5: break;
                default:
                    System.out.println("Ulangi, isi dengan 1-5");
                    break;
            }
        }
        System.out.println("======================================================");
        System.out.println("Terima kasih telah menggunakan jasa kami!");
        System.out.println("======================================================");
    }

    //Method Undang-undang terkait hak wanita di Indonesia
    private static void UU(){
        System.out.println("======================================================");
        Scanner in = new Scanner(System.in);
        int pilihan = 0;
        while (pilihan != 4){
            System.out.println("Undang-undang terkait hak wanita di Indonesia");
            System.out.println("1. UU No 13 Pasal 81 Ayat 1 Tahun 2003");
            System.out.println("2. UU No 13 Pasal 82 Ayat 1 Tahun 2003");
            System.out.println("3. PP No 61 Tentang Kesehatan Reproduksi");
            System.out.println("4. Kembali");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = in.nextInt();
            if (pilihan != 4) System.out.println("------------------------------------------------------");
            switch (pilihan){
                case 1:
                    System.out.println("Pekerja/buruh perempuan yang dalam masa haid merasakan");
                    System.out.println("sakit dan memberitahukan kepada pengusaha,tidak wajib");
                    System.out.println("bekerja pada hari pertama dan kedua pada waktu haid.");
                    break;
                case 2:
                    System.out.println("Pekerja/buruh perempuan berhak memperoleh istirahat");
                    System.out.println("selama 1,5 (satu setengah) bulan sebelum saatnya");
                    System.out.println("melahirkan anak dan 1,5 (satu setengah) bulan sesudah");
                    System.out.println("melahirkan menurut perhitungan dokter kandungan atau");
                    System.out.println("bidan.");
                    break;
                case 3:
                    System.out.println("Silakan akses:");
                    System.out.println("https://peraturan.bpk.go.id/Home/Download/32214/PP%20Nomor%2061%20Tahun%202014.pdf");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Ulangi, isi dengan 1-4");
                    break;
            }
            if (pilihan != 4) System.out.println("------------------------------------------------------");

        }
    }

    //Method Telepon Call Center
    private static void Telepon(){
        System.out.println("======================================================");
        Scanner in = new Scanner(System.in);
        int pilihan = 0;
        while (pilihan != 3) {
            System.out.println("Telepon Call Center");
            System.out.println("1. Nomor darurat polisi");
            System.out.println("2. Call Centre SAPA 129");
            System.out.println("3. Kembali");
            System.out.print("Masukkan pilihan : ");
            pilihan = in.nextInt();
            if (pilihan != 3) System.out.println("------------------------------------------------------");
            switch (pilihan) {
                case 1:
                    System.out.println("Silakan untuk menekan nomor darurat 112.");
                    break;
                case 2:
                    System.out.println("Tekan nomor berikut : 0811-129-129");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Ulangi, isi dengan 1-3");
            }
            if (pilihan != 3) System.out.println("------------------------------------------------------");
        }
    }

    //Method donasi terkait emansipasi wanita
    private static void Donasi(){
        System.out.println("======================================================");
        Scanner in = new Scanner(System.in);
        double donasi, bagi;
        int ibuHamil, korban, posyandu;
        int pilihan = 1;
        while (pilihan == 1 || pilihan == 2 || pilihan == 3){
            System.out.println("Donasi terkait emansipasi wanita");
            System.out.println("Masukkan angka berapapun untuk membatalkan donasi");
            System.out.println("1. Donasi ke ibu hamil");
            System.out.println("2. Donasi ke korban KDRT");
            System.out.println("3. Donasi ke posyandu");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = in.nextInt();
            if (pilihan == 1 || pilihan == 2 || pilihan == 3) System.out.println("------------------------------------------------------");
            switch (pilihan){
                case 1:
                    System.out.print("Masukkan donasi (dalam juta rupiah): ");
                    donasi = in.nextDouble();
                    if (donasi > 10){
                        donasi = donasi * 0.9;
                        System.out.println("Donasi terkena pajak 10%");
                        System.out.println("Total donasi setelah dipajak: "+donasi+" juta rupiah");
                    }
                    System.out.print("Jumlah ibu hamil yang akan didonasi: ");
                    ibuHamil = in.nextInt();
                    bagi = donasi / ibuHamil;
                    if (bagi <= 1) System.out.println("Tiap ibu hamil mendapatkan donasi "+(bagi*1000000)+" rupiah");
                    else System.out.println("Tiap ibu hamil mendapatkan donasi "+bagi+" juta rupiah");
                    System.out.println("Terima kasih telah berdonasi");
                    break;
                case 2:
                    System.out.print("Masukkan donasi (dalam juta rupiah): ");
                    donasi = in.nextDouble();
                    if (donasi > 10){
                        donasi = donasi * 0.9;
                        System.out.println("Donasi terkena pajak 10%");
                        System.out.println("Total donasi setelah dipajak: "+donasi);
                    }
                    System.out.print("Jumlah korban KDRT tahun ini: ");
                    korban = in.nextInt();
                    bagi = donasi / korban;
                    if (bagi <= 1) System.out.println("Tiap korban KDRT mendapatkan donasi "+(bagi*1000000)+" rupiah");
                    else System.out.println("Tiap korban KDRT mendapatkan donasi "+(bagi)+" juta rupiah");
                    System.out.println("Terima kasih telah berdonasi");
                    break;
                case 3:
                    System.out.print("Masukkan donasi (dalam juta rupiah): ");
                    donasi = in.nextDouble();
                    if (donasi > 10){
                        donasi = donasi * 0.9;
                        System.out.println("Donasi terkena pajak 10%");
                        System.out.println("Total donasi setelah dipajak: "+donasi+" juta rupiah");
                    }
                    System.out.print("Jumlah Posyandu yang akan didonasi: ");
                    posyandu = in.nextInt();
                    bagi = donasi / posyandu;
                    if (bagi <= 1)System.out.println("Tiap posyandu mendapatkan donasi "+(bagi*1000000)+" rupiah");
                    else System.out.println("Tiap posyandu mendapatkan donasi "+(bagi)+" juta rupiah");
                    System.out.println("Terima kasih telah berdonasi");
                    break;
                default: break;
            }
            if (pilihan == 1 || pilihan == 2 || pilihan == 3) System.out.println("------------------------------------------------------");
        }
    }

    //Method data wanita korban kekerasan
    private static void Korban(){
        System.out.println("======================================================");
        Scanner in = new Scanner(System.in);
        int[] tahun = {2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020};
        String[] korban = {"54.425", "143.586", "105.103", "119.107", "216.156", "279.688", "293.220", "321.752", "259.150", "348.446", "406.178", "431.471", "299.911"};
        int pilihan = 2008;
        int kembali = 1;
        while (kembali == 1){
            System.out.println("Jumlah perempuan korban kekerasan");
            System.out.print("Masukkan tahun (2008-2020 dalam angka): ");
            pilihan = in.nextInt();
            while (pilihan < 2008 || pilihan > 2020){
                System.out.print("Ulangi, isi tahun dengan 2008-2020 (dalam angka): ");
                pilihan = in.nextInt();
            }
            System.out.println("------------------------------------------------------");
            for (int i = 0; i < tahun.length; i++){
                if (pilihan == tahun[i]) {
                    System.out.println("Pada tahun "+tahun[i]+", jumlah wanita yang menjadi korban\nkekerasan sebanyak "+korban[i]+" orang.");
                }
            }
            System.out.println("Sumber data:\nhttps://komnasperempuan.go.id/uploadedFiles/1466.1614933645.pdf");
            System.out.println("Apakah anda ingin melihat data pada tahun lainnya?\nKetik '0' jika tidak, dan kembali  ke menu utama.\nKetik '1' jika ya.");
            System.out.print("Pilihan anda (0 atau 1): ");
            kembali = in.nextInt();
            if (!(kembali == 0 || kembali == 1)){
                System.out.println("Ulangi, masukkan 0 atau 1");
                System.out.print("Pilihan anda (0 atau 1): ");
                kembali = in.nextInt();
            }
            if (kembali == 1) System.out.println("------------------------------------------------------");
        }
    }

}
