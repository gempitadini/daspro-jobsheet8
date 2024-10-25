import java.util.Scanner;

public class TugasNo2Versi2 {
        public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n = 4;
        for (int i = 1; i <= n; i++) {
            System.out.println("---------------------");
            System.out.print("Nama cabang olahraga = ");
            String namaCabor = sc.nextLine();

            for (int j = 1; j <= 5; j++) {
                System.out.print("Nama atlet ke- " + j + " = ");
                String namaAtlet = sc.nextLine();
            }
        }

    }
}
