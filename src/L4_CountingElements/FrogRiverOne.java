package L4_CountingElements;

import java.util.HashSet;

public class FrogRiverOne {
    public int solution(int X, int[] A){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            int a = A[i];

            if(set.contains(a)){
                continue;
            }

            set.add(a);
            if(set.size() == X){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FrogRiverOne f = new FrogRiverOne();
        System.out.println(f.solution(5, new int[]{1,3,1,4,2,3,5,4}));
    }
}
