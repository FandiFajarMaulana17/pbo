import java.util.Scanner;

public class tugaspbo {

    public static void main(String[] args) {
        // Membuat variabel dan scanner
        int nilai;
        String nama, predikat;
        char lanjut = 'y';  // Inisialisasi variabel 'lanjut' dengan nilai awal 'y'
        Scanner scan = new Scanner(System.in);
        int jumlahSiswa = 0; // Menghitung jumlah siswa yang dimasukkan

        // Perulangan do-while untuk input beberapa siswa
        do {
            // Mengambil input dari pengguna
            System.out.print("Nama: ");
            nama = scan.nextLine();  // Membaca input nama

            // Memastikan input nilai valid
            System.out.print("Nilai: ");
            if (!scan.hasNextInt()) {
                System.out.println("Input tidak valid. Masukkan angka untuk nilai.");
                scan.next(); // Mengabaikan input yang salah
                continue; // Kembali ke awal perulangan
            }
            nilai = scan.nextInt();
            scan.nextLine(); // Membersihkan newline dari buffer

            // Cek kelulusan menggunakan if-else
            if (nilai >= 70) {
                System.out.println("Selamat " + nama + ", Anda Lulus!");
            } else {
                System.out.println("Maaf " + nama + ", Anda Gagal.");
            }

            // Menentukan predikat berdasarkan nilai menggunakan switch-case
            switch (nilai / 10) {
                case 10:
                case 9:
                    predikat = "A";
                    break;
                case 8:
                    predikat = "B";
                    break;
                case 7:
                    predikat = "C";
                    break;
                case 6:
                    predikat = "D";
                    break;
                default:
                    predikat = "E";
                    break;
            }

            // Menampilkan predikat
            System.out.println("Predikat Anda: " + predikat);

            jumlahSiswa++; // Menghitung jumlah siswa yang diproses

            // Menanyakan apakah ingin memproses siswa lain
            System.out.print("Apakah Anda ingin memasukkan siswa lain? (y/n): ");
            lanjut = scan.next().charAt(0);
            scan.nextLine(); // Membersihkan buffer setelah char input
            System.out.println("-----------------------------------");

        } while (lanjut == 'y' || lanjut == 'Y');

        // Menggunakan while loop untuk menampilkan jumlah siswa yang dimasukkan
        System.out.println("\nMenghitung total siswa yang diproses...");
        int hitungSiswa = 0;
        while (hitungSiswa < jumlahSiswa) {
            System.out.println("Siswa ke-" + (hitungSiswa + 1));
            hitungSiswa++;
        }

        // Menggunakan for loop untuk memberikan ucapan terima kasih sebanyak 3 kali
        for (int i = 0; i < 3; i++) {
            System.out.println("Terima kasih telah menggunakan program cek kelulusan.");
        }

        // Menutup scanner
        scan.close();
    }
}
