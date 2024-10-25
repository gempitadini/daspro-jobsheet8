import java.util.Scanner;

public class TugasNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- DAFTAR CABANG OLAHRAGA PORSENI ----");
        System.out.println("1. Badminton");
        System.out.println("2. Tenis meja");
        System.out.println("3. Basket");
        System.out.println("4. Bola voly");

        for (int i = 1; i <= 4; i++) {
            System.out.println("Cabang Olahraga ke- " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nama atlet ke- " + j + " = ");
                String namaAtlet = sc.nextLine();
                System.out.println("Atlet ke- " + j + ": " +namaAtlet);
            }
        }
    }
}
