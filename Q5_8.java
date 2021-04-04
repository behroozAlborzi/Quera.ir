import java.util.Scanner;
public class Q5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(),y=sc.nextInt();

        int f=x;
        if (x>=0) {
            if (x > 1) {
                if (x % 2 == 0) {
                    f = x + y;

                } else {
                    f = (x + y) - 1;
                }
//            f = x;
            } else {
                f = x;
            }
            System.out.println(f);
        }else {
            System.out.println(-1);
        }


    }
}
