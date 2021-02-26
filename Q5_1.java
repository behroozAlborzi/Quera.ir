import java.util.Scanner;
public class Q5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int sum = 0;
        while (a <= 1000) {
            if (a==0){
                break;
            }

            sum = sum + a;
            a = scanner.nextInt();
        }
        System.out.println(sum);
        
        
    }
}

