import java.util.HashSet;

public class SequenceOfSuccessiveNumbers {
    public int longestConsecutive(int[] nums) {
        int longest = 1;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (set.contains(num - 1)) {
                continue;
            }

            int count = 1;
            while (set.contains(num + 1)) {
                set.remove(num + 1);
                count ++;
                num ++;
            }

            if(count > longest) {
                longest = count;
            }
        }

        return longest;
    }
}