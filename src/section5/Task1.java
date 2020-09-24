package section5;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        if ((x>=3) && (x<=8))  {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
