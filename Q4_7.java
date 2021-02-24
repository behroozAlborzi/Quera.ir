import java.util.Scanner;

public class Q4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ax = scanner.nextInt(),ay= scanner.nextInt(),bx=scanner.nextInt(),by=scanner.nextInt();

        if (ax-bx<1){
            System.out.println("Right");
        } else{
            System.out.println("Left");
        }
    }
}
