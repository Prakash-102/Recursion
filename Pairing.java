
// friend pairing problem ?:- Goldsachs
import java.util.*;

public class Pairing {

    public static int friendpairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendpairing(n - 1) + (n - 1) * friendpairing(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(friendpairing(3));
    }
}
/*
 * Output:-
 * 4
 */
