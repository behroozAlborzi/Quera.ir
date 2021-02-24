import java.util.Scanner;

public class Q3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), e = scanner.nextInt();
        long add = a + b + c + e;
        long mutli = a * b * c * e;
        long ava = add / 4;
        long max = a;
        long min = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (e > max) {
            max = e;
        }

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (e < min) {
            min = e;
        }


        System.out.printf("Sum : %.6f\n", (double)add);
        System.out.printf("Average : %.6f\n", (double)add / 4);
        System.out.printf("Product : %.6f\n", (double) mutli);
        System.out.printf("Max  : %.6f\n", (double) (max));
        System.out.printf("Min  : %.6f\n", (double) (min));
    }
}
