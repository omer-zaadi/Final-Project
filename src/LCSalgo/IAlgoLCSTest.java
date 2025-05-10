package LCSalgo;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

    public class IAlgoLCSTest {

        @Test
        public void testDynamicProgramming() {
            IAlgoLCS algo = new LCSDynamicProgramming();
            assertEquals(4, algo.computeLCS("AGGTAB", "GXTXAYB"));
            assertEquals(0, algo.computeLCS("M", "ABC"));
        }

        @Test
        public void testRecursive() {
            IAlgoLCS algo = new LCSRecursive();
            assertEquals(4, algo.computeLCS("AGGTAB", "GXTXAYB"));
            assertEquals(0, algo.computeLCS("XYZ", "RET"));
        }

    }



