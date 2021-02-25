import java.util.Scanner;
public class Q5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        while (a != 0) {
            for (int i = 0; i < a; i++) {
                System.out.println(a);
            }
            a = scanner.nextInt();
        }
    }
}




