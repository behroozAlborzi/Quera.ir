import java.util.Scanner;

public class Q6_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] int1 = new int[n];
        int[] int2 = new int[n];
        int sum =0;

        int[] int3 = new int[n];
        for (int i = 0; i < int1.length; i++) {
            int1[i]=scanner.nextInt();
        }

        for (int i = 0; i < int2.length; i++) {
            int2[i] = scanner.nextInt();
        }
        for (int i = 0; i < int3.length; i++) {
            int3[i] = int1[i] +int2[i];
            System.out.print(int3[i]);
        }

    }

}
