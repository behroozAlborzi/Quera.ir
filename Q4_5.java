import java.util.Scanner;

public class Q4_5 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String a = scanner.next();
        int red = 0;
        int yel =0;
        int gre =0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)=='R'){
                red ++;
            }
            if (a.charAt(i)=='G'){
                gre++;
            }
            if (a.charAt(i)=='Y'){
                yel++;
            }
        }
        if (red>=3||(red>=2 && yel>=2)||gre==0){
            System.out.println("nakhor lite");
        }else{
            System.out.println("rahat baash");
        }
    }
}
