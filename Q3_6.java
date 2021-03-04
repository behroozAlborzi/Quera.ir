import java.util.Scanner;

public class Q3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       int n=scanner.nextInt();
        long sum=0;
        int x=n/2;
        // age n fard bashe adad ha 0 1 2 ... x-1 x x x-1 ... 1 0 hstn
        // age n zoj bashe adad ha 0 1 2 ... x-1 x x-1 ... 1 0 hstn
        sum=(long)(x-1)*x/2;// jame 0 1 2 ... x-1
        sum*=2;
        sum+=x*(n%2+1);
        double ans=(double)sum/(n+1);
        System.out.printf("%.6f\n",ans);

    }
}
