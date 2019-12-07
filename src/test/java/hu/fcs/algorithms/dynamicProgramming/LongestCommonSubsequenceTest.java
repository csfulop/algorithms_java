package hu.fcs.algorithms.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LongestCommonSubsequenceTest {
    @Test
    public void testLongestCommonSubsequence() {
        assertResult(LongestCommonSubsequence.of("a", ""), 0, "");
        assertResult(LongestCommonSubsequence.of("", "b"), 0, "");
        assertResult(LongestCommonSubsequence.of("a", "a"), 1, "a");
        assertResult(LongestCommonSubsequence.of("a", "b"), 0, "");
        assertResult(LongestCommonSubsequence.of("ABCDGH", "AEDFHR"), 3, "ADH");
        assertResult(LongestCommonSubsequence.of("AGGTAB", "GXTXAYB"), 4, "GTAB");
    }

    private void assertResult(LongestCommonSubsequence.Result result, int length, String lcs) {
        assertThat(result.getLenght(), is(length));
        assertThat(result.getLcs(), is(lcs));
    }
}
