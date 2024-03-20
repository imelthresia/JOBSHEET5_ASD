import java.util.Scanner;

public class MainAkar12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.print("Masukkan bilangan yang ingin dihitung akarnya : ");
        double num = sc.nextDouble();

        Akar12 akar = new Akar12();
        System.out.println("=====================================================");
        System.out.println("Hasil akar dengan Brute Force");
        System.out.println("Akar dari " + num + " adalah : " + akar.akarBF(num));

        System.out.println("=====================================================");
        System.out.println("Hasil akar dengan Divide and Conquer");
        System.out.println("Akar dari " + num + " adalah : " + akar.akarDC(num, 0, num));
    }
}