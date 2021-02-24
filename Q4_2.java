import java.util.Scanner;

public class Q4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), d = scanner.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }  if (c > max) {
            max = c;
        }  if (d > max) {
            max = d;
        }
        System.out.println(max);
    }
}
