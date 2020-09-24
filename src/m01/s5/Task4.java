package m01.s5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double c = in.nextDouble();
        if (c >= 3 && c <= 8) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
