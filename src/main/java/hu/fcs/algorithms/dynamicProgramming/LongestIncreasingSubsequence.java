package hu.fcs.algorithms.dynamicProgramming;

import java.util.List;

/**
 * Longest Increasing Subsequence
 * Find the length of the longest subsequence of a given sequence
 * such that all elements of the subsequence are sorted in increasing order.
 * Based on: https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/
 */
public class LongestIncreasingSubsequence {

    private List<Integer> sequence;

    public LongestIncreasingSubsequence(List<Integer> sequence) {
        this.sequence = sequence;
    }

    public int lis() {
        int max = 0;
        for (int i = 0; i < sequence.size(); i++) {
            int candidate = L(i);
            if (candidate > max) {
                max = candidate;
            }
        }
        return max;
    }

    private int L(int i) {
        int max = 1;
        for (int j = 0; j < i; j++) {
            if (sequence.get(j) < sequence.get(i)) {
                int candidate = L(j) + 1;
                if (candidate > max) {
                    max = candidate;
                }
            }
        }
        return max;
    }
}
