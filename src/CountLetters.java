// ****************************************************************
// CountLetters.java
//
// Membaca sebuah kata dari input pengguna dan menghitung jumlah
// kemunculan setiap huruf dalam kata tersebut, sambil mengabaikan
// karakter yang bukan huruf.
// ****************************************************************
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        // Array untuk menyimpan jumlah kemunculan masing-masing huruf (A-Z)
        int[] counts = new int[26];

        // Membaca input dari pengguna
        Scanner scan = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan sebuah kata
        System.out.print("Masukkan sebuah kata (hanya huruf, harap tidak ada karakter lain): ");
        String word = scan.nextLine();

        // Mengubah semua huruf menjadi huruf kapital
        word = word.toUpperCase();

        // Menghitung frekuensi setiap huruf dalam kata
        for (int i = 0; i < word.length(); i++) {
            try {
                // Menghitung kemunculan huruf dengan mengubah karakter menjadi index (A=0, B=1, ..., Z=25)
                counts[word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Jika terjadi karakter yang bukan huruf (misalnya tanda baca atau angka),
                // tangkap exception dan tampilkan pesan yang memberitahukan karakter yang tidak valid
                System.out.println("Bukan huruf: " + word.charAt(i));
            }
        }

        // Mencetak hasil frekuensi huruf
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                // Menampilkan huruf dan jumlah kemunculannya
                System.out.println((char)(i + 'A') + ": " + counts[i]);
            }
        }
    }
}
