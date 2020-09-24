package section5;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        if ((a>=3) && (a<=8)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
