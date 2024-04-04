
    public class Max_Sum_Path {
        public static int findMaximumSumPath(int[] X, int[] Y) {
            int sumX = 0, sumY = 0;
            int i = 0, j = 0;
            int maxSum = 0;

            while (i < X.length && j < Y.length) {
                if (X[i] < Y[j]) {
                    sumX += X[i++];
                } else if (X[i] > Y[j]) {
                    sumY += Y[j++];
                } else { // Common element found
                    maxSum += Math.max(sumX, sumY) + X[i];
                    sumX = 0;
                    sumY = 0;
                    i++;
                    j++;
                }
            }

            // Add remaining elements of X[] or Y[] if any
            while (i < X.length) {
                sumX += X[i++];
            }

            while (j < Y.length) {
                sumY += Y[j++];
            }

            // Add the remaining cumulative sums
            maxSum += Math.max(sumX, sumY);

            return maxSum;
        }

        public static void main(String[] args) {
            int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
            int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

            int maxSum = findMaximumSumPath(X, Y);
            System.out.println("Maximum sum path: " + maxSum);
        }
    }




