import java.util.Scanner;
public class Q5_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();
        long sum;
        while (number >= 10) {
            sum = 0;
            while (number > 0) {
                sum = sum + (number % 10);
                number /= 10;
            }
            number = sum;
        }
        number = number % 9;
        if (number == 0) {
            System.out.println(number);
        } else {
            System.out.println(number);
        }
    }
}