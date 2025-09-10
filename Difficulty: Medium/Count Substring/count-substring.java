class Solution {
    public static int countSubstring(String s) {
        int n = s.length();
        int[] freq = new int[3]; // 0->a, 1->b, 2->c
        int left = 0, result = 0;

        for (int right = 0; right < n; right++) {
            freq[s.charAt(right) - 'a']++;

            // shrink window until all 3 present
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                result += (n - right); // all substrings from [left..n-1]
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return result;
    }
}
