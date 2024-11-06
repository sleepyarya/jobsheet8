import java.util.Scanner;

public class star03{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int n = s.nextInt();

        for(int i = 0; i <= n ; i++ ){
            System.out.print("*");
        }
    }
}