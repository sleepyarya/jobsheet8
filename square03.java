import java.util.Scanner;
public class square03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int n = s.nextInt();

        for(int iOuter = 1; iOuter<=n ; iOuter++){
            for(int i=1; i <=n ; i++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
