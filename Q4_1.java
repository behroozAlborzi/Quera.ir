import java.util.Scanner;

public class Q4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a>100){
            System.out.println("Steam");
        } else if (a<0){
            System.out.println("Ice");
        }else{
            System.out.println("Water");
        }
    }
}
