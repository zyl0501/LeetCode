import java.util.Scanner;

/**
 *
 * Created by qq448 on 2016/3/6.
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num !=-1){
            System.out.println("num -> "+ num);
            System.out.println("result -> "+ AddDigits.addDigits(num));
            num = sc.nextInt();
        }
    }
}
