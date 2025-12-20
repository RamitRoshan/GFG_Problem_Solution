class Solution {
    public String removeConsecutiveCharacter(String s) {

        // If string is empty or has 1 character
        if (s.length() <= 1) {
            return s;
        }

        StringBuilder result = new StringBuilder();

        // Always keep first character
        result.append(s.charAt(0));

        // Compare current char with previous char
        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
