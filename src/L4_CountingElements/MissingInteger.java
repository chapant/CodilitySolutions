package L4_CountingElements;

public class MissingInteger {
    public int solution(int[] A){
        int N = A.length;

        for (int i = 0; i < N; i++) {
            if (A[i] > N + 1 || A[i] <= 0) {
                A[i] = N + 1;
            }
        }

        for (int i = 0; i < N; i++) {
            int idx = Math.abs(A[i]) - 1;
            if(idx < N){
                A[idx] = -Math.abs(A[idx]);
            }
        }

        for (int i = 0; i < N; i++) {
            if (A[i] > 0) {
                return i + 1;
            }
        }

        return N + 1;
    }

    public static void main(String[] args) {
        MissingInteger m = new MissingInteger();
        System.out.println(m.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
