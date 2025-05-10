package LCSalgo;

public class LCSRecursive implements IAlgoLCS {

    @Override
    public int computeLCS (String s1, String s2) {
        return computeLCSRec(s1, s2, s1.length(),s2.length());
    }

    private int computeLCSRec(String s1, String s2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return 1 + computeLCSRec(s1, s2, n - 1, m - 1);
        }
        else{
            return Math.max(
                    computeLCSRec(s1, s2, n-1, m), computeLCSRec(s1, s2, n, m - 1)
            );
        }
    }
}
