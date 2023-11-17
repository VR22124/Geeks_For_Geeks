/* 74. Search a 2D Matrix

You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.


Example 1:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

Example 2:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false */

Solution :


class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
     {
         int j=matrix[0].length;
         int i=matrix.length;
         for(int g=0;g<i;g++)
         {
             for(int h=0;h<j;h++)
             {
                 if(matrix[g][h]==target)
                 {
                     return true;
                 }
             }
         }
         return false;
         
    }
}