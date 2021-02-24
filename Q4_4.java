import java.util.Scanner;

public class Q4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(),b= scanner.nextInt(),c=scanner.nextInt(),d=scanner.nextInt();
        if (a==c){
            System.out.println("Vertical");
        }
        if(b==d){
            System.out.println("Horizontal");
        }
        if(a!=c && b!=d ){
            System.out.println("Try again");
        }
    }
}
