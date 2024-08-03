package L4_CountingElements;

import java.util.HashSet;

public class PermCheck {
    public int solution(int[] A){
        HashSet<Integer> set = new HashSet<Integer>();

        int low = 1, high = A.length;
        for(int a : A){
            if(set.contains(a)) return 0;
            if(a < low || a > high) return 0;

            set.add(a);
        }

        return 1;
    }

    public static void main(String[] args) {
        PermCheck pc = new PermCheck();
        System.out.println(pc.solution(new int[]{1,2,5,4}));
    }
}
