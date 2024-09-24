package ifsp.macena;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SledBalancerTest {

    @Test
    void testBalancedWithSinglePresent() {
        SledBalancer sledBalancer = new SledBalancer();
        int[] weights = {3};
        assertEquals(
                "S", sledBalancer.isBalanced(weights),
                "A single gift should always be balanced.");
    }
}
