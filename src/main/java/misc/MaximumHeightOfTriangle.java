package misc;

/*
You are given two integers red and blue representing the count of red and blue colored balls. You have to arrange these balls to form a triangle such that the 1st row will have 1 ball, the 2nd row will have 2 balls, the 3rd row will have 3 balls, and so on.

All the balls in a particular row should be the same color, and adjacent rows should have different colors.

Return the maximum height of the triangle that can be achieved.


https://leetcode.com/problems/pass-the-pillow/description/?envType=daily-question&envId=2024-07-06

*/

public class MaximumHeightOfTriangle {
    public static int maxHeightOfTriangle(int red, int blue) {
        int actualHeight = maxHeight(red, blue, true);
        int actualHeight2 = maxHeight(red, blue, false);

        return Math.max(actualHeight2, actualHeight);
    }

    private static int maxHeight(int red, int blue, boolean isActualColorRed) {
        int response = 0;
        while (true) {
            if (isActualColorRed) {
                if (red < response + 1) {
                    break;
                }
                red -= ++response;
                isActualColorRed = false;
                continue;
            }

            if (blue < response + 1) {
                break;
            }
            blue -= ++response;
            isActualColorRed = true;
        }

        return response;
    }
}