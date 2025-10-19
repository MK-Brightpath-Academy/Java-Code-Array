class Solution {
    public int longestConsecutive(int[] nums) {
         if (nums == null || nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int best = 0;

        for (int num : set) {
            // Only start counting if `num` is the beginning of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                if (length > best) best = length;
            }
        }
        return best;
    }
}