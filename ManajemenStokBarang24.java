import java.util.Scanner;

public class ManajemenStokBarang24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String namaBarang;
        int stok, permintaan;
        double hargaPerUnit, totalNilaiStok = 0;
        String pilihan = "";

        do {
            System.out.print("Masukkan nama barang (atau ketik 'selesai' untuk mengakhiri): ");
            namaBarang = input.nextLine();

            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan jumlah stok untuk barang " + namaBarang + ": ");
            stok = input.nextInt();
            
            System.out.print("Masukkan harga per unit barang " + namaBarang + ": ");
            hargaPerUnit = input.nextDouble();
            input.nextLine();

            double nilaiStok = stok * hargaPerUnit;
            totalNilaiStok += nilaiStok;
            System.out.println("Total nilai stok untuk " + namaBarang + ": " + nilaiStok);

            System.out.print("Masukkan jumlah permintaan untuk barang " + namaBarang + ": ");
            permintaan = input.nextInt();
            input.nextLine();

            if (permintaan <= stok) {
                System.out.println("Permintaan dapat dipenuhi. Sisa stok: " + (stok - permintaan));
            } else {
                System.out.println("Permintaan tidak dapat dipenuhi. Stok tidak mencukupi.");
            }

            System.out.println(); 
        } while (true);

        System.out.println("Program berakhir.");
        System.out.println("Total nilai stok keseluruhan: " + totalNilaiStok);

        input.close();
    }
}
