package hu.fcs.algorithms.dynamicProgramming;

/**
 * Longest Common Subsequence
 * Given two sequences, find the length of longest subsequence present in both of them.
 * A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.
 * Based on: https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/
 */
public class LongestCommonSubsequence {

    public static class Result {
        public int lenght;
        public String lcs;

        public Result(int lenght, String lcs) {
            this.lenght = lenght;
            this.lcs = lcs;
        }

        public int getLenght() {
            return lenght;
        }

        public void setLenght(int lenght) {
            this.lenght = lenght;
        }

        public String getLcs() {
            return lcs;
        }

        public void setLcs(String lcs) {
            this.lcs = lcs;
        }
    }

    public static Result of(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return new Result(0, "");
        } else if (a.charAt(a.length() - 1) == b.charAt(b.length() - 1)) {
            Result result = of(a.substring(0, a.length() - 1), b.substring(0, b.length() - 1));
            result.setLenght(result.getLenght() + 1);
            result.setLcs(result.getLcs() + a.charAt(a.length() - 1));
            return result;
        } else {
            Result resultA = of(a, b.substring(0, b.length() - 1));
            Result resultB = of(a.substring(0, a.length() - 1), b);
            if (resultA.getLenght() > resultB.getLenght()) {
                return resultA;
            } else {
                return resultB;
            }
        }
    }
}
