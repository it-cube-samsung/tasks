package m01.s12;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int rest = a % 10;
        System.out.println(rest);
    }
}
