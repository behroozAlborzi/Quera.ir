import java.util.Scanner;

public class Q5_6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        while (n > 0) {
            sum = sum * 10 + (n % 10);
            n /= 10;
        }
        System.out.println(sum);

    }
}
