package ifsp.macena;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SledBalancerTest {

    @Test
    @DisplayName("Test balanced sled with a single present")
    void testBalancedWithSinglePresent() {
        SledBalancer sledBalancer = new SledBalancer();
        int[] weights = {3};
        assertEquals(
                "S", sledBalancer.isBalanced(weights),
                "A single gift should always be balanced.");
    }

    @Test
    @DisplayName("Test balanced sled with two presents")
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

    @Test
    void testUnbalancedWithHighDifference() {
        SledBalancer sledBalancer = new SledBalancer();
        int[] weights = {7, 1, 3, 6};
        assertEquals(
                "N", sledBalancer.isBalanced(weights),
                "Too big a difference could unbalance the sled.");
    }

    @Test
    void testCase1() {
        SledBalancer sledBalancer = new SledBalancer();
        int[] weights = {4, 6, 2};
        assertEquals(
                "S", sledBalancer.isBalanced(weights),
                "The sled must be balanced for weights 4, 6 and 2.");
    }

    @Test
    void testCase2() {
        SledBalancer sledBalancer = new SledBalancer();
        int[] weights = {6, 6};
        assertEquals(
                "N", sledBalancer.isBalanced(weights),
                "The sled must be unbalanced for weights 6 and 6.");
    }
}
