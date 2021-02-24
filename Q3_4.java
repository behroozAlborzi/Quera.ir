import java.util.Scanner;

public class Q3_4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int a = scanner.nextInt();
        float b = (float) a/2+1;
        a = (int)Math.abs(b*b);
        System.out.println(a);
    }
}
