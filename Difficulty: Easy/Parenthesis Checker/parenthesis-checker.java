class Solution {

    public boolean isBalanced(String s) {
        // Start recursion from index 0
        int result = check(s, 0);

        // Balanced ONLY if recursion finishes exactly at end
        return result == s.length();
    }

    // Recursive function that returns:
    // - next index to process if valid
    // - -1 if invalid
    private int check(String s, int i) {

        // If index goes beyond string length → invalid
        if (i > s.length()) {
            return -1;
        }

        // If end reached, return index
        if (i == s.length()) {
            return i;
        }

        char ch = s.charAt(i);

        // If closing bracket without opening → invalid
        if (ch == ')' || ch == '}' || ch == ']') {
            return i;
        }

        // Must be opening bracket
        char expectedClose = findClosing(ch);

        // Recursively process inside the bracket
        int next = check(s, i + 1);

        // If inner recursion failed
        if (next == -1 || next >= s.length()) {
            return -1;
        }

        // If closing bracket does not match
        if (s.charAt(next) != expectedClose) {
            return -1;
        }

        // Continue after matching closing bracket
        return check(s, next + 1);
    }

    public char findClosing(char c) {
        if (c == '(') return ')';
        if (c == '{') return '}';
        if (c == '[') return ']';
        return Character.MIN_VALUE;
    }
}
