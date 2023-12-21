package p1249;

public class Solution {
    /**
     * This method removes the minimum number of parentheses to make the input string valid.
     * A valid string is a string where every opening bracket "(" has a corresponding closing bracket ")".
     * The method uses two StringBuilder objects to construct the valid string.
     *
     * @param s The input string which may contain invalid parentheses.
     * @return The modified string where invalid parentheses have been removed.
     */
    public String minRemoveToMakeValid(String s) {
        // Null check
        if (s == null) {
            return null;
        }

        // StringBuilder to construct the string with valid parentheses
        StringBuilder sb = new StringBuilder();
        // Counter for open parentheses
        int open = 0;
        // Iterate over the characters in the string
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // If the character is an open parenthesis, increment the counter
                open++;
            } else if (c == ')') {
                // If the character is a close parenthesis and there are no unmatched open parentheses, skip this character
                if (open == 0) {
                    continue;
                }
                // Decrement the counter for open parentheses
                open--;
            }
            // Append the character to the StringBuilder
            sb.append(c);
        }

        // StringBuilder to construct the final result
        StringBuilder result = new StringBuilder();
        // Iterate over the characters in the StringBuilder in reverse order
        for (int i = sb.length() - 1; i >= 0; i--) {
            // If the character is an open parenthesis and there are unmatched open parentheses, skip this character
            if (sb.charAt(i) == '(' && open-- > 0) {
                continue;
            }
            // Append the character to the result StringBuilder
            result.append(sb.charAt(i));
        }

        // Return the reversed result string
        return result.reverse().toString();
    }
}
