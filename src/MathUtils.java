// ****************************************************************
// MathUtils.java
//
// Menyediakan fungsi utilitas matematika statis.
//
// ****************************************************************
public class MathUtils {
    //-------------------------------------------------------------
    // Mengembalikan faktorial dari argumen yang diberikan
    //-------------------------------------------------------------
    public static int factorial(int n) {
        // Pengecekan untuk nilai negatif
        if (n < 0) {
            throw new IllegalArgumentException("Faktorial tidak terdefinisi untuk angka negatif: " + n);
        }

        // Pengecekan untuk overflow (nilai lebih dari 16)
        if (n > 16) {
            throw new IllegalArgumentException("Faktorial tidak dapat dihitung untuk angka lebih dari 16: " + n);
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
