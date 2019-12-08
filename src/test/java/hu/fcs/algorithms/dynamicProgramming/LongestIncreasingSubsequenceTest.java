package hu.fcs.algorithms.dynamicProgramming;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LongestIncreasingSubsequenceTest {

    @Test
    public void testLongestIncreasingSubsequence() {
        assertLIS(emptyList(), 0);
        assertLIS(asList(1), 1);
        assertLIS(asList(1, 2), 2);
        assertLIS(asList(2, 1), 1);
        assertLIS(asList(2, 1, 3), 2);
        assertLIS(asList(3, 10, 2, 1, 20), 3);
        assertLIS(asList(10, 22, 9, 33, 21, 50, 41, 60, 80), 6);
    }

    private void assertLIS(List<Integer> sequence, int expected) {
        assertThat(new LongestIncreasingSubsequence(sequence).lis(), is(expected));
    }
}