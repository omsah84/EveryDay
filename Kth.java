import java.util.HashSet;

import javax.management.modelmbean.InvalidTargetObjectTypeException;

public class Kth {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 3, 6, 3, 8 };
        int k = 1;

        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
            if (s.size() > k) {
                s.remove(s.size() - 1);
            }

        }
        
        System.out.println()
    }
}
