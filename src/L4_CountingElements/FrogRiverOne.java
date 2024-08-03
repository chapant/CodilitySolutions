package L4_CountingElements;

import java.util.HashSet;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        // HashSet to store unique positions with leaves
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            int a = A[i];

            // If the position already has a leaf, continue
            if (set.contains(a)) {
                continue;
            }

            // Add the new position with a leaf
            set.add(a);

            // Check if all positions from 1 to X are covered
            if (set.size() == X) {
                return i;  // Return the earliest time
            }
        }

        return -1;  // If not all positions are covered, return -1
    }

    public static void main(String[] args) {
        FrogRiverOne f = new FrogRiverOne();
        System.out.println(f.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
        // Expected output: 6
    }
}