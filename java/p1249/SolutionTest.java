package p1249;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {

    @Test
    void shouldReturnValidStringWhenInputHasExtraClosingParentheses() {
        Solution solution = new Solution();
        String input = "lee(t(c)o)de)";
        String expected = "lee(t(c)o)de";
        assertEquals(expected, solution.minRemoveToMakeValid(input));
    }

    @Test
    void shouldReturnValidStringWhenInputHasExtraOpeningParentheses() {
        Solution solution = new Solution();
        String input = "((hello";
        String expected = "hello";
        assertEquals(expected, solution.minRemoveToMakeValid(input));
    }

    @Test
    void shouldReturnValidStringWhenInputHasUnbalancedParentheses() {
        Solution solution = new Solution();
        String input = "a)b(c)d";
        String expected = "ab(c)d";
        assertEquals(expected, solution.minRemoveToMakeValid(input));
    }

    @Test
    void shouldReturnEmptyStringWhenInputOnlyHasUnbalancedParentheses() {
        Solution solution = new Solution();
        String input = "))((";
        String expected = "";
        assertEquals(expected, solution.minRemoveToMakeValid(input));
    }

    @Test
    void shouldReturnNullWhenInputIsNull() {
        Solution solution = new Solution();
        String input = null;
        assertNull(solution.minRemoveToMakeValid(input));
    }

    @Test
    void shouldReturnSameStringWhenInputHasNoParentheses() {
        Solution solution = new Solution();
        String input = "hello";
        String expected = "hello";
        assertEquals(expected, solution.minRemoveToMakeValid(input));
    }

    @Test
    void shouldReturnSameStringWhenInputHasBalancedParentheses() {
        Solution solution = new Solution();
        String input = "(hello)";
        String expected = "(hello)";
        assertEquals(expected, solution.minRemoveToMakeValid(input));
    }
}
