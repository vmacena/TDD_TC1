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

    @Test
    void testBalancedWithTwoPresents() {
        SledBalancer sledBalancer = new SledBalancer();
        int[] weights = {4, 2};
        assertEquals(
                "S", sledBalancer.isBalanced(weights),
                "With a weight difference of 2, the sled must be balanced.");
    }

    @Test
    void testUnbalancedWithTwoPresents() {
        SledBalancer sledBalancer = new SledBalancer();
        int[] weights = {6, 6};
        assertEquals(
                "N", sledBalancer.isBalanced(weights),
                "With a difference of 6, the sled must be unbalanced.");
    }

    @Test
    void testBalancedWithMultiplePresents() {
        SledBalancer sledBalancer = new SledBalancer();
        int[] weights = {3, 4, 1, 2};
        assertEquals(
                "S", sledBalancer.isBalanced(weights),
                "With balanced weights, the sled should be balanced.");
    }

    @Test
    void testUnbalancedWithMultiplePresents() {
        SledBalancer sledBalancer = new SledBalancer();
        int[] weights = {10, 1, 6, 4};
        assertEquals(
                "N", sledBalancer.isBalanced(weights),
                "Those present must unbalance the sled.");
    }

    @Test
    void testBalancedWithEqualWeights() {
        SledBalancer sledBalancer = new SledBalancer();
        int[] weights = {5, 5, 5, 5};
        assertEquals(
                "S", sledBalancer.isBalanced(weights),
                "Equal weights should result in a balanced sled.");
    }


}
