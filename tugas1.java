import java.util.Scanner;

public class tugas1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int h=1;

        System.out.print("Masukkan input n : ");
        n = sc.nextInt();

        while(h<=n) { 
            int i=1;
            while(i<=n) {
                if (h==1 || h==n||i==1 || i == n)
                System.out.print(n);
                
                else {
                    System.out.print(" ");
                }
                i++;
            } 
            System.out.println();
            h++;
        }
    }    
}
