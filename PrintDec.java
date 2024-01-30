
//Print numbers in decreasing order?:-
import java.util.*;

public class PrintDec {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}

/*
 * Output:-
 * 10 9 8 7 6 5 4 3 2 1
 */
