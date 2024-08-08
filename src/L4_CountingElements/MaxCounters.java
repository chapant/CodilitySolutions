package L4_CountingElements;

import java.util.Arrays;

public class MaxCounters {
    public int[] solution(int N, int[] A){
        int[] operators = new int[N];

        int max = 0, level = 0;
        for(int i = 0; i < A.length; i++){
            int a = A[i];
            if(a == N + 1){
                level = max;
            } else if( a >= 1 && a <= N ){
                if(operators[a-1] < level)
                    operators[a-1] = level;
                operators[a-1]++;
                max = Math.max(max, operators[a-1]);
            }

            System.out.println(Arrays.toString(operators));
        }

        for(int i = 0; i < N; i++){
            if(operators[i] < level){
                operators[i] = level;
            }
        }

        return operators;
    }

    public static void main(String[] args) {
        MaxCounters mc = new MaxCounters();
        int[] A = {1,2,4,4,4,6,2,1,4,4,1,1,6,2,2};
        int[] operators = mc.solution(5, A);
        System.out.println(Arrays.toString(operators));
    }
}
