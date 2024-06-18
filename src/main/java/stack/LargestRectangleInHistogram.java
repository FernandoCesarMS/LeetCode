package stack;

import java.util.Arrays;

/*
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.
 */

public class LargestRectangleInHistogram {
    public static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) {
            return 0;
        }

        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        int fleets = 0;
        double currentFleetTime = 0.0;

        for (double[] car : cars) {
            if (car[1] > currentFleetTime) {
                fleets++;
                currentFleetTime = car[1];
            }
        }

        return fleets;
    }

}
