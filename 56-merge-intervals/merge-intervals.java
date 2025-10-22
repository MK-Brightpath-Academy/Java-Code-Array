class Solution {
    public int[][] merge(int[][] intervals) {
           Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Step 2: Iterate and merge
        for (int[] interval : intervals) {
            // If merged list is empty OR no overlap, add new interval
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Overlap → merge by updating end time
                merged.get(merged.size() - 1)[1] = Math.max(
                        merged.get(merged.size() - 1)[1],
                        interval[1]
                );
            }
        }

        // Step 3: Convert list to array
        return merged.toArray(new int[merged.size()][]);
    }
}