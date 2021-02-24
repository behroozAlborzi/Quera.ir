import java.util.Scanner;

public class Q4_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(),b=scanner.nextInt();
        int total=0;
        int total_2=0;
        int sum_number=0;
        int sum_number_2=0;
        int hold_number = a;
        int hold_number_2 = b;




        while (a!=0 & b !=0){

            total= a %10;
            total_2 = b%10;
            sum_number = (sum_number*10)+total;
            sum_number_2 = (sum_number_2*10)+total_2;
            a = a/10;
            b=b/10;

        }

        if (sum_number<sum_number_2){
            System.out.println(hold_number+" < "+hold_number_2);
        }else if (sum_number>sum_number_2){
            System.out.println(hold_number_2+" < "+hold_number);
        }else {
            System.out.println(hold_number+" = "+hold_number_2);
        }

    }
}
