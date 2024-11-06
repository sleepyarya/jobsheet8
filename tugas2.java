import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlPoltek = 0, jmlAtlet = 5;
        String namaAtlet;

        System.out.println("---EVENT PORSENI---");
        System.out.print("Masukkan jumlah politeknik yang mendaftar : ");
        jmlPoltek = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= jmlPoltek; i++) {

            System.out.println("Politeknik ke -" + i + ":");

            System.out.println("Cabang olahraga : badminton");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("nama atlet badminton ke-" + j + ": ");
                namaAtlet = sc.nextLine();
            }

            System.out.println("Cabang olahraga : tenis meja");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("nama atlet tenis meja ke-" + j + ": ");
                namaAtlet = sc.nextLine();
            }

            System.out.println("Cabang olahraga : basket");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("nama atlet basket ke-" + ": ");
                namaAtlet = sc.nextLine();
            }

            System.out.println("Cabang olahraga : bola voly");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("nama atlet bola voly ke-" + j + ": ");
                namaAtlet = sc.nextLine();
            }

        }
    }
}
