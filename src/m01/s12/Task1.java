package m01.s12;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        in.useLocale(Locale.US);
        float a = in.nextFloat();
        if ((a <= 8) && (a >= 3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
