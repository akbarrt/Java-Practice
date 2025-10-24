import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama kamu: ");
        String nama = input.nextLine();
        System.out.println("Halo, " + nama + "! Selamat belajar Java 😄");
    }
}
