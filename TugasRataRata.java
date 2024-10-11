import java.util.Scanner;

public class TugasRataRata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahNilai = 0;
        double totalNilai = 0;
        char lanjut;

        // Header program
        System.out.println("===================================");
        System.out.println("  Program Penghitung Rata-Rata Nilai  ");
        System.out.println("===================================");

        // Perulangan do-while untuk meminta input hingga pengguna memilih untuk berhenti
        do { 
            System.out.print("Masukkan nilai (0 - 100): ");
            double nilai = input.nextDouble();
            
            // Menggunakan if untuk memvalidasi input
            if (nilai >= 0 && nilai <= 100) {
                totalNilai += nilai;
                jumlahNilai++;
                System.out.println("Nilai berhasil ditambahkan!");
            } else {
                System.out.println("Nilai tidak valid, silakan masukkan nilai antara 0 dan 100.");
            }

            // Menanyakan apakah pengguna ingin melanjutkan
            System.out.print("Apakah Anda ingin memasukkan nilai lain? (y/n): ");
            lanjut = input.next().charAt(0);
            System.out.println("-----------------------------------");
        } while (lanjut == 'y' || lanjut == 'Y');

        // Memastikan setidaknya ada satu nilai yang dimasukkan
        if (jumlahNilai == 0) {
            System.out.println("Anda belum memasukkan nilai apa pun.");
        } else {
            // Menghitung rata-rata
            double rataRata = totalNilai / jumlahNilai;

            // Menampilkan hasil rata-rata dengan format yang rapi
            System.out.println("===================================");
            System.out.printf("Total nilai yang dimasukkan: %d\n", jumlahNilai);
            System.out.printf("Rata-rata nilai: %.2f\n", rataRata);
            System.out.println("===================================");

            // Menggunakan if-else untuk memberikan penilaian sederhana berdasarkan rata-rata
            String penilaian;
            if (rataRata >= 85) {
                penilaian = "Sangat Baik";
            } else if (rataRata >= 70) {
                penilaian = "Baik";
            } else if (rataRata >= 50) {
                penilaian = "Cukup";
            } else {
                penilaian = "Perlu Perbaikan";
            }

            // Menampilkan penilaian sebanyak 3 kali
            for (int i = 0; i < 3; i++) {
                System.out.printf("Penilaian rata-rata Anda: %s\n", penilaian);
            }
        }

        // Menutup scanner
        input.close();
    }
}
