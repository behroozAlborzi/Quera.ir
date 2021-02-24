import java.util.Scanner;

public class Q4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(),b=scanner.nextInt(),c=scanner.nextInt();

        if((a%2==0) || (b% 2 ==0 && c % 2 == 0)){
            System.out.println("good");
        }else
            System.out.println("bad");
    }
}
