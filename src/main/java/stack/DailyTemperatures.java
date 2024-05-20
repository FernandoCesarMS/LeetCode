package stack;

import java.util.Stack;

/*
Given an array of integers "temperatures" represents the daily temperatures, return an array answer such that answer[i]
is the number of days you have to wait after the ith day to get a warmer temperature.
If there is no future day for which this is possible, keep answer[i] == 0 instead.

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]

 */
public class DailyTemperatures {
    public static void main(String[] args) {
        int[] input = {99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99};
        int[] answer = dailyTemperatures(input);
        for (int item : answer) {
            System.out.println(item);
        }
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int lengthTemperatures = temperatures.length;
        int[] answer = new int[lengthTemperatures];

        for(int i = 0; i < lengthTemperatures; i++){
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int indexPeek = stack.pop();
                answer[indexPeek] = i - indexPeek;
            }

            stack.push(i);
        }

        return answer;
    }
//    public static int[] dailyTemperatures(int[] temperatures) {
//        List<Integer> answerInList = new ArrayList<>();
//        int length = temperatures.length;
//        for (int i = 0; i < length; i++) {
//            int answerForActualTemperature = 0;
//            for (int j = i + 1; j < length; j++) {
//                answerForActualTemperature++;
//
//                if (temperatures[j] > temperatures[i]) {
//                    break;
//                } else if (length - 1 == j) {
//                    answerForActualTemperature = 0;
//                }
//            }
//            answerInList.add(answerForActualTemperature);
//        }
//
//        int[] realAnswer = new int[answerInList.size()];
//
//        for (int i = 0; i < answerInList.size(); i++) {
//            realAnswer[i] = answerInList.get(i);
//        }
//
//        return realAnswer;
//    }

}
