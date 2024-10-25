import java.util.Scanner;

public class RataNilaiKelas24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama;
        double nilai, totalNilai = 0;
        int jumlahSiswa = 0, jumlahDiAtasRata = 0, jumlahDiBawahRata = 0;
        String pilihan = "";

        do {
            System.out.print("Masukkan nama siswa (atau ketik 'selesai' untuk mengakhiri): ");
            nama = input.nextLine();
            
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan nilai siswa: ");
            nilai = input.nextDouble();
            input.nextLine();

            totalNilai += nilai;
            jumlahSiswa++;

            double rataRata = totalNilai / jumlahSiswa;

            if (nilai >= rataRata) {
                jumlahDiAtasRata++;
            } else {
                jumlahDiBawahRata++;
            }

            System.out.println("Rata-rata sementara: " + rataRata);
        } while (true);

        if (jumlahSiswa > 0) {
            double rataRataAkhir = totalNilai / jumlahSiswa;
            System.out.println("\nHasil Akhir:");
            System.out.println("Rata-rata nilai siswa: " + rataRataAkhir);
            System.out.println("Jumlah siswa di atas rata-rata: " + jumlahDiAtasRata);
            System.out.println("Jumlah siswa di bawah rata-rata: " + jumlahDiBawahRata);
            
            if (jumlahDiAtasRata > jumlahSiswa / 2) {
                System.out.println("Mayoritas siswa memiliki nilai di atas rata-rata.");
            } else {
                System.out.println("Mayoritas siswa memiliki nilai di bawah rata-rata.");
            }
        } else {
            System.out.println("Tidak ada data siswa yang dimasukkan.");
        }

        input.close();
    }
}
