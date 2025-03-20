// ****************************************************************
// ParseInts.java
//
// Membaca sebuah baris teks dan mencetak jumlah integer yang ada
// dalam baris tersebut. Mengabaikan non-integer dan terus melanjutkan.
// ****************************************************************
import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0; // Variabel untuk menyimpan nilai sementara dan total jumlah
        Scanner scan = new Scanner(System.in); // Scanner untuk membaca input
        String line;

        // Meminta pengguna memasukkan baris teks
        System.out.println("Masukkan sebuah baris teks:");

        // Membaca baris yang dimasukkan pengguna
        line = scan.nextLine();

        // Membuat scanner kedua untuk membaca setiap token dalam baris
        Scanner scanLine = new Scanner(line);

        // Proses setiap token dalam baris
        while (scanLine.hasNext()) {
            try {
                // Mencoba mengonversi token menjadi integer
                val = Integer.parseInt(scanLine.next());
                sum += val; // Menambahkan nilai integer ke total sum
            } catch (NumberFormatException e) {
                // Menangani exception jika token bukan integer (misalnya kata-kata)
                // Tidak melakukan apa-apa di sini, cukup lanjutkan ke token berikutnya
            }
        }

        // Menampilkan hasil jumlah integer dalam baris tersebut
        System.out.println("Jumlah integer dalam baris ini adalah: " + sum);
    }
}