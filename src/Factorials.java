// ****************************************************************
// Factorials.java
// Membaca bilangan bulat dari pengguna dan mencetak faktorial dari setiap angka.
// ****************************************************************
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";  // Variabel untuk kontrol perulangan
        Scanner scan = new Scanner(System.in);

        // Perulangan untuk terus meminta input sampai pengguna berhenti
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Masukkan sebuah angka: ");
            int val = scan.nextInt();

            try {
                // Memanggil metode factorial dan mencetak hasilnya
                System.out.println("Faktorial(" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                // Menangkap pengecualian IllegalArgumentException dan menampilkan pesan error
                System.out.println("Kesalahan: " + e.getMessage());
            }

            // Menanyakan apakah pengguna ingin memasukkan angka lain
            System.out.print("Masukkan faktorial lainnya? (y/n) ");
            keepGoing = scan.next();
        }
    }
}