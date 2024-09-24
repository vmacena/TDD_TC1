package ifsp.macena;

public class SledBalancer {
    public String canBalance(int[] weights) {
        int leftSide = 0;
        int rightSide = 0;

        for (int weight : weights) {
            if (Math.abs((leftSide + weight) - rightSide) <= 5) {
                leftSide += weight;
            } else if (Math.abs(leftSide - (rightSide + weight)) <= 5) {
                rightSide += weight;
            } else {
                return "N";
            }
        }
        return "S";
    }
}