import java.util.Scanner;

public class TugassNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- DAFTAR CABANG OLAHRAGA PORSENI ----");
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};

        // Loop untuk setiap cabang olahraga
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("\nCabang Olahraga: " + cabangOlahraga[i]);
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nama atlet ke-" + j + " = ");
                String namaAtlet = sc.nextLine();
                System.out.println("Atlet ke-" + j + ": " + namaAtlet);
            }
        }

        sc.close(); // Menutup scanner
    }
}
