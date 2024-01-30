
//Tiling Problem ?:-
import java.util.*;

public class Tiling {

    public static int tilingproblem(int n) {
        int fnm1 = tilingproblem(n - 1);
        int fnm2 = tilingproblem(n - 2);
        int toways = fnm1 + fnm2;
        return toways;
    }

    public static void main(String[] args) {
        System.out.println(tilingproblem(4));
    }
}

/*
 * Output:-
 * 1024
 */
