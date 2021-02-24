import java.util.Scanner;

public class Q3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt(),b=scanner.nextInt();

        if (a == 0 & b!=0){
            a = 0;
            b = 60 -b;
        }else if(b==0 & a!=0){
            b = 0;
            a = 12-a;
        }else if(b==0 & a==0){
            a=0;
            b=0;
        }
        else {
            a = 12 - a;
            b = 60 - b;



        }
        System.out.printf("%02d:%02d", a, b);


    }
}
