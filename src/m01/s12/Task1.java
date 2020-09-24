package tasks.src.m01.s12;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int b = 3;
        int c = 8;
        if (b <= a && a <= c) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}