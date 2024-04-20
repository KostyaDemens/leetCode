package by.bsuir.kostyademens.easy;

import java.util.Arrays;

/*
Given matrix, a rectangular matrix of integers, where each value represents the cost of the room,
your task is to return the total sum of all rooms
that are suitable for the CodeBots (ie: add up all the values that don't appear below a 0).
 */
public class Ghosts {
    public static int solution(int[][] matrix) {
        int sum = 0;
        int lengthInARow = matrix[0].length;
        for (int i = 0; i < lengthInARow; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 0) {
                    break;
                } else {
                    sum+=matrix[j][i];
                }
            }
        }
        return sum;
    }
}
