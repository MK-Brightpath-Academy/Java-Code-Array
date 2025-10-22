class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;     // Just increase by 1
                return digits;   // No carry → done
            }
            digits[i] = 0;       // Set current digit to 0 and continue carry
        }
        
        // If all digits were 9 → e.g., [9,9,9] → [1,0,0,0]
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}