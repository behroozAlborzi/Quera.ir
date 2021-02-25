import java.util.Scanner;

public class Q5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum *= i;
        }

        System.out.println(sum);


    }


}



