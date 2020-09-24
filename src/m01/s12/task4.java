package m01.s12;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), n = in.nextInt();
        a = a * n + (b * n / 100);
        b = b * n % 100;
        System.out.printf("a");
        System.out.println();

    }

}