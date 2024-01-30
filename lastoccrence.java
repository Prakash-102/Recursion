
//last Occurrence?:-
import java.util.*;

public class lastoccrence {

    public static int lastoccrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastoccrence(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 5, 5 };
        System.out.println(lastoccrence(arr, 5, 0));
    }
}

/*
 * Output:-
 * 3
 */
